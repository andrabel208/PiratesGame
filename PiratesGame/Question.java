import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Represents a question with multiple acceptable answers.
 */
public class Question
{
    private final String prompt;
    private final List<String> acceptableAnswers;

    public Question(String prompt, String... acceptableAnswers)
    {
        this.prompt = prompt;
        this.acceptableAnswers = new ArrayList<>();
        for (String answer : acceptableAnswers)
        {
            this.acceptableAnswers.add(normalize(answer));
        }
    }

    public String getPrompt()
    {
        return prompt;
    }

    public boolean isCorrect(String answer)
    {
        if (answer == null)
        {
            return false;
        }
        String normalized = normalize(answer);
        return acceptableAnswers.contains(normalized);
    }

    public String getPrimaryAnswer()
    {
        if (acceptableAnswers.isEmpty())
        {
            return "";
        }
        return acceptableAnswers.get(0);
    }

    private String normalize(String value)
    {
        String trimmed = value.trim().toLowerCase();
        String normalized = Normalizer.normalize(trimmed, Normalizer.Form.NFD)
            .replaceAll("\\p{InCombiningDiacriticalMarks} +", "");
        normalized = normalized.replaceAll("[^a-z0-9 ]", "");
        return normalized.replaceAll("\\s +", " ").trim();
    }
}
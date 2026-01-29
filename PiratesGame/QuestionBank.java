import java.util.ArrayList;
import java.util.List;

/**
 * QuestionBank - provides questions for different islands in the Pirates Game.
 * Acts as a bridge between the Question class and specific island question sets.
 * 
 * @author GO GIRLS! Team
 * @version 1.0
 */
public class QuestionBank
{
    /**
     * Get Art Island questions as a list of Question objects
     * Converts ArtIslandQuestions format to Question format
     */
    public List<Question> getArtQuestions()
    {
        List<Question> questions = new ArrayList<>();
        
        // Get a random question set from ArtIslandQuestions
        ArtIslandQuestions.QuestionSet questionSet = ArtIslandQuestions.getRandomQuestionSet();
        
        // Convert Multiple Choice Questions to Question format
        for (ArtIslandQuestions.MultipleChoiceQuestion mcq : questionSet.multipleChoiceQuestions)
        {
            // Format the question with options
            String prompt = mcq.question + "\n" +
                           "A) " + mcq.options[0] + "\n" +
                           "B) " + mcq.options[1] + "\n" +
                           "C) " + mcq.options[2] + "\n" +
                           "D) " + mcq.options[3] + "\n" +
                           "Raspuns (A/B/C/D):";
            
            // Create Question with acceptable answers (both letter and full answer text)
            String correctLetter = String.valueOf(mcq.correctAnswer);
            String correctAnswer = mcq.options[mcq.correctAnswer - 'A'];
            Question question = new Question(prompt, correctLetter, correctAnswer);
            questions.add(question);
        }
        
        // Convert Written Answer Questions to Question format
        for (ArtIslandQuestions.WrittenAnswerQuestion waq : questionSet.writtenAnswerQuestions)
        {
            // Create Question with all possible answers
            Question question = new Question(waq.question, waq.possibleAnswers);
            questions.add(question);
        }
        
        return questions;
    }
}

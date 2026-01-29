import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Geography Island Questions - Contains question pool for the Geography Island
 * Pool consists of 10 multiple choice and 10 written answer questions.
 * Generates random sets with 2 questions of each type (total 4 questions per set).
 * 
 * @author GO GIRLS! Team
 * @version 1.0
 */
public class GeographyIslandQuestions
{
    // Multiple Choice Questions (10 total)
    private static final MultipleChoiceQuestion[] multipleChoiceQuestions = {
        new MultipleChoiceQuestion(
            "Care este cel mai mare continent al lumii?",
            new String[]{"Africa", "Europa", "Asia", "America de Sud"},
            'C',
            "Suprafață"
        ),
        new MultipleChoiceQuestion(
            "Care este cel mai mare ocean de pe Pământ?",
            new String[]{"Oceanul Atlantic", "Oceanul Indian", "Oceanul Arctic", "Oceanul Pacific"},
            'D',
            "Întindere"
        ),
        new MultipleChoiceQuestion(
            "Ce fluviu traversează orașul București?",
            new String[]{"Dunărea", "Oltul", "Argeșul", "Mureșul"},
            'C',
            "Capitală"
        ),
        new MultipleChoiceQuestion(
            "Care este cel mai înalt munte din lume?",
            new String[]{"Mont Blanc", "Kilimanjaro", "Everest", "K2"},
            'C',
            "Himalaya"
        ),
        new MultipleChoiceQuestion(
            "Ce mare se află la sudul României?",
            new String[]{"Marea Mediterană", "Marea Neagră", "Marea Baltică", "Marea Nordului"},
            'B',
            "Litoral"
        ),
        new MultipleChoiceQuestion(
            "Ce deșert este cel mai mare din lume?",
            new String[]{"Gobi", "Kalahari", "Sahara", "Atacama"},
            'C',
            "Africa"
        ),
        new MultipleChoiceQuestion(
            "Ce linie imaginară împarte Pământul în emisfera nordică și sudică?",
            new String[]{"Tropicul Racului", "Meridianul Zero", "Ecuatorul", "Cercul Polar"},
            'C',
            "0° latitudine"
        ),
        new MultipleChoiceQuestion(
            "Care este capitala Franței?",
            new String[]{"Roma", "Madrid", "Berlin", "Paris"},
            'D',
            "Turn"
        ),
        new MultipleChoiceQuestion(
            "Ce formă de relief are cele mai mari altitudini?",
            new String[]{"Câmpia", "Dealul", "Podișul", "Munții"},
            'D',
            "Altitudine"
        ),
        new MultipleChoiceQuestion(
            "Ce tip de climă se întâlnește la Polul Nord?",
            new String[]{"Ecuatorială", "Temperată", "Tropicală", "Polară"},
            'D',
            "Foarte rece"
        )
    };
    
    // Written Answer Questions (10 total)
    private static final WrittenAnswerQuestion[] writtenAnswerQuestions = {
        new WrittenAnswerQuestion(
            "Care este cel mai mare ocean de pe Pământ?",
            new String[]{"Pacific", "Atlantic", "Indian", "Arctic"},
            new String[]{"Suprafață maximă", "Europa–America", "Asia–Africa", "Polul Nord"},
            "Pacific",
            "Suprafață maximă"
        ),
        new WrittenAnswerQuestion(
            "Ce continent are cea mai mare suprafață?",
            new String[]{"Asia", "Africa", "Europa", "America de Sud"},
            new String[]{"Extrem de vast", "Deșert", "Peninsule", "Amazon"},
            "Asia",
            "Extrem de vast"
        ),
        new WrittenAnswerQuestion(
            "Care este cel mai lung fluviu din lume?",
            new String[]{"Nil", "Amazon", "Dunărea", "Mississippi"},
            new String[]{"Africa", "Debitul cel mai mare", "Europa Centrală", "America de Nord"},
            "Nil",
            "Africa"
        ),
        new WrittenAnswerQuestion(
            "Ce munte este cel mai înalt din lume?",
            new String[]{"Everest", "K2", "Kilimanjaro", "Mont Blanc"},
            new String[]{"Himalaya", "Alpinism extrem", "Africa", "Europa"},
            "Everest",
            "Himalaya"
        ),
        new WrittenAnswerQuestion(
            "Ce deșert este cel mai mare din lume?",
            new String[]{"Sahara", "Gobi", "Atacama", "Kalahari"},
            new String[]{"Africa", "Asia", "Extrem de arid", "Sudul Africii"},
            "Sahara",
            "Africa"
        ),
        new WrittenAnswerQuestion(
            "Ce țară are cea mai mare populație?",
            new String[]{"China", "India", "SUA", "Rusia"},
            new String[]{"Asia de Est", "Asia de Sud", "America", "Suprafață mare"},
            "China",
            "Asia de Est"
        ),
        new WrittenAnswerQuestion(
            "Ce linie imaginară împarte Pământul în emisfere nordică și sudică?",
            new String[]{"Ecuator", "Meridian", "Tropic", "Pol"},
            new String[]{"0° latitudine", "Longitudine", "Zonă climatică", "Extrem"},
            "Ecuator",
            "0° latitudine"
        ),
        new WrittenAnswerQuestion(
            "Ce mare se află între Europa și Africa?",
            new String[]{"Mediterană", "Neagră", "Roșie", "Nordului"},
            new String[]{"Sudul Europei", "Estul Europei", "Africa–Asia", "Nordul Europei"},
            "Mediterană",
            "Sudul Europei"
        ),
        new WrittenAnswerQuestion(
            "Ce formă de relief este o întindere mare de teren plat?",
            new String[]{"Câmpie", "Deal", "Munți", "Podiș"},
            new String[]{"Plat", "Înălțime mică", "Altitudine mare", "Ridicat"},
            "Câmpie",
            "Plat"
        ),
        new WrittenAnswerQuestion(
            "Ce tip de climă este specific zonelor din jurul Ecuatorului?",
            new String[]{"Ecuatorială", "Temperată", "Polară", "Continentală"},
            new String[]{"Cald–umed", "Patru anotimpuri", "Foarte rece", "Extreme termice"},
            "Ecuatorială",
            "Cald–umed"
        )
    };
    
    /**
     * Get a random question set containing 2 multiple choice and 2 written answer questions
     */
    public static QuestionSet getRandomQuestionSet()
    {
        Random rand = new Random();
        List<Integer> mcIndices = getRandomIndices(multipleChoiceQuestions.length, 2, rand);
        List<Integer> waIndices = getRandomIndices(writtenAnswerQuestions.length, 2, rand);
        
        MultipleChoiceQuestion[] mcQuestions = new MultipleChoiceQuestion[2];
        WrittenAnswerQuestion[] waQuestions = new WrittenAnswerQuestion[2];
        
        for (int i = 0; i < 2; i++) {
            mcQuestions[i] = multipleChoiceQuestions[mcIndices.get(i)];
            waQuestions[i] = writtenAnswerQuestions[waIndices.get(i)];
        }
        
        return new QuestionSet(mcQuestions, waQuestions);
    }
    
    /**
     * Get random unique indices using HashSet for better performance
     */
    private static List<Integer> getRandomIndices(int max, int count, Random rand)
    {
        List<Integer> indices = new ArrayList<>();
        java.util.HashSet<Integer> seen = new java.util.HashSet<>();
        while (indices.size() < count) {
            int index = rand.nextInt(max);
            if (!seen.contains(index)) {
                seen.add(index);
                indices.add(index);
            }
        }
        return indices;
    }
    
    /**
     * Inner class for Multiple Choice Questions
     */
    public static class MultipleChoiceQuestion
    {
        public String question;
        public String[] options;
        public char correctAnswer;
        public String hint;
        
        public MultipleChoiceQuestion(String question, String[] options, char correctAnswer, String hint)
        {
            this.question = question;
            this.options = options;
            this.correctAnswer = correctAnswer;
            this.hint = hint;
        }
        
        public boolean checkAnswer(char answer)
        {
            return java.lang.Character.toUpperCase(answer) == java.lang.Character.toUpperCase(correctAnswer);
        }
    }
    
    /**
     * Inner class for Written Answer Questions
     */
    public static class WrittenAnswerQuestion
    {
        public String question;
        // Note: possibleAnswers and allHints are stored for potential future use
        // (e.g., multiple valid answers, context-specific hints)
        // Currently only correctAnswer and correctHint are used
        public String[] possibleAnswers;
        public String[] allHints;
        public String correctAnswer;
        public String correctHint;
        
        public WrittenAnswerQuestion(String question, String[] possibleAnswers, String[] allHints, 
                                     String correctAnswer, String correctHint)
        {
            this.question = question;
            this.possibleAnswers = possibleAnswers;
            this.allHints = allHints;
            this.correctAnswer = correctAnswer;
            this.correctHint = correctHint;
        }
        
        /**
         * Check if the answer is correct (case-insensitive, ignores spaces)
         */
        public boolean checkAnswer(String answer)
        {
            if (answer == null) return false;
            String normalizedAnswer = answer.trim().replaceAll("\\s+", "").toLowerCase();
            String normalizedCorrect = correctAnswer.trim().replaceAll("\\s+", "").toLowerCase();
            return normalizedAnswer.equals(normalizedCorrect);
        }
        
        public String getHint()
        {
            return correctHint;
        }
    }
    
    /**
     * Inner class for Question Set
     */
    public static class QuestionSet
    {
        public MultipleChoiceQuestion[] multipleChoiceQuestions;
        public WrittenAnswerQuestion[] writtenAnswerQuestions;
        
        public QuestionSet(MultipleChoiceQuestion[] mcQuestions, WrittenAnswerQuestion[] waQuestions)
        {
            this.multipleChoiceQuestions = mcQuestions;
            this.writtenAnswerQuestions = waQuestions;
        }
    }
}

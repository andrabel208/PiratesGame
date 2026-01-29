import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Art Island Questions - Contains question pool for the Art Island
 * Pool consists of 10 multiple choice and 10 written answer questions.
 * Generates random sets with 2 questions of each type (total 4 questions per set).
 * 
 * @author GO GIRLS! Team
 * @version 1.0
 */
public class ArtIslandQuestions
{
    // Multiple Choice Questions (10 total)
    private static final MultipleChoiceQuestion[] multipleChoiceQuestions = {
        new MultipleChoiceQuestion(
            "Ce este arta?",
            new String[]{"O stiinta exacta bazata pe formule", "O forma de exprimare a creativitatii si emotiilor", "Doar un hobby fara importanta", "Un tip de matematica vizuala"},
            'B',
            "Creativitate"
        ),
        new MultipleChoiceQuestion(
            "Care dintre urmatoarele este o forma de arta vizuala?",
            new String[]{"Muzica", "Literatura", "Pictura", "Dansul"},
            'C',
            "Imagine"
        ),
        new MultipleChoiceQuestion(
            "Cine a pictat celebra lucrare Mona Lisa?",
            new String[]{"Vincent van Gogh", "Pablo Picasso", "Leonardo da Vinci", "Michelangelo"},
            'C',
            "Renastere"
        ),
        new MultipleChoiceQuestion(
            "Ce material este folosit cel mai des in sculptura?",
            new String[]{"Hartia", "Piatra sau marmura", "Sticla de plastic", "Panza"},
            'B',
            "Durabil"
        ),
        new MultipleChoiceQuestion(
            "Ce culori sunt considerate culori primare?",
            new String[]{"Verde, portocaliu, mov", "Albastru, verde, galben", "Rosu, galben, albastru", "Alb, negru, gri"},
            'C',
            "Baza"
        ),
        new MultipleChoiceQuestion(
            "Ce este un tablou?",
            new String[]{"O opera de arta realizata prin pictura", "Un obiect folosit doar pentru decor", "O fotografie digitala", "Un desen tehnic"},
            'A',
            "Opera"
        ),
        new MultipleChoiceQuestion(
            "Ce inseamna termenul portret?",
            new String[]{"Un peisaj natural", "O sculptura abstracta", "Reprezentarea unei persoane", "O opera fara forme clare"},
            'C',
            "Chip"
        ),
        new MultipleChoiceQuestion(
            "Ce instrument este folosit frecvent in desen?",
            new String[]{"Dalta", "Pensula", "Creionul", "Ciocanul"},
            'C',
            "Linie"
        ),
        new MultipleChoiceQuestion(
            "Ce rol are arta in societate?",
            new String[]{"Doar decorativ", "Nu are niciun rol", "Exprima idei, emotii si cultura", "Inlocuieste stiinta"},
            'C',
            "Mesaj"
        ),
        new MultipleChoiceQuestion(
            "Ce tip de arta presupune realizarea de obiecte tridimensionale?",
            new String[]{"Pictura", "Desenul", "Sculptura", "Fotografia"},
            'C',
            "Forma"
        )
    };
    
    // Written Answer Questions (10 total)
    private static final WrittenAnswerQuestion[] writtenAnswerQuestions = {
        new WrittenAnswerQuestion(
            "Ce curent artistic se concentreaza pe emotii intense si natura?",
            new String[]{"Romantism", "Realism", "Cubism", "Minimalism"},
            new String[]{"Emotie", "Cotidian", "Geometrie", "Simplitate"},
            "Romantism",
            "Emotie"
        ),
        new WrittenAnswerQuestion(
            "Ce tip de arta foloseste forme geometrice fragmentate?",
            new String[]{"Cubism", "Baroc", "Renastere", "Impresionism"},
            new String[]{"Cuburi", "Ornament", "Echilibru", "Lumina"},
            "Cubism",
            "Cuburi"
        ),
        new WrittenAnswerQuestion(
            "Ce tehnica artistica foloseste pete rapide de culoare?",
            new String[]{"Impresionism", "Suprarealism", "Clasicism", "Goticul"},
            new String[]{"Lumina", "Vis", "Regula", "Evul Mediu"},
            "Impresionism",
            "Lumina"
        ),
        new WrittenAnswerQuestion(
            "Ce tip de arta reprezinta obiecte tridimensionale?",
            new String[]{"Sculptura", "Grafica", "Pictura", "Fotografie"},
            new String[]{"Volum", "Linie", "Culoare", "Camera"},
            "Sculptura",
            "Volum"
        ),
        new WrittenAnswerQuestion(
            "Ce artist este asociat cu pictura Guernica?",
            new String[]{"Picasso", "Van Gogh", "Monet", "Da Vinci"},
            new String[]{"Razboi", "Stele", "Apa", "Renastere"},
            "Picasso",
            "Razboi"
        ),
        new WrittenAnswerQuestion(
            "Ce stil artistic exploreaza visele si subconstientul?",
            new String[]{"Suprarealism", "Realism", "Baroc", "Futurism"},
            new String[]{"Vis", "Real", "Dramatic", "Viteza"},
            "Suprarealism",
            "Vis"
        ),
        new WrittenAnswerQuestion(
            "Ce element de arta se refera la folosirea culorilor?",
            new String[]{"Culoare", "Linie", "Textura", "Forma"},
            new String[]{"Pigment", "Contur", "Suprafata", "Volum"},
            "Culoare",
            "Pigment"
        ),
        new WrittenAnswerQuestion(
            "Ce perioada artistica pune accent pe echilibru si proportie?",
            new String[]{"Renastere", "Baroc", "Romanticism", "Expresionism"},
            new String[]{"Armonie", "Exagerare", "Emotie", "Deformare"},
            "Renastere",
            "Armonie"
        ),
        new WrittenAnswerQuestion(
            "Ce tip de arta se realizeaza cu aparatul foto?",
            new String[]{"Fotografie", "Pictura", "Sculptura", "Gravura"},
            new String[]{"Camera", "Pensula", "Dalta", "Tipar"},
            "Fotografie",
            "Camera"
        ),
        new WrittenAnswerQuestion(
            "Ce curent artistic pune accent pe reprezentarea fidela a realitatii?",
            new String[]{"Realism", "Abstract", "Cubism", "Dadaism"},
            new String[]{"Exact", "Non-figurativ", "Fragmentare", "Protest"},
            "Realism",
            "Exact"
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

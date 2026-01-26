import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Main world for the Pirates Game.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private Pirate pirate;

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        pirate = new Pirate();
        addObject(pirate, 300, 200);
        showText("Welcome to Art Island!", 300, 30);
        runArtIsland();
    }

    private void runArtIsland()
    {
        QuestionBank bank = new QuestionBank();
        List<Question> questions = bank.getArtQuestions();
        for (Question question : questions)
        {
            String answer = Greenfoot.ask(question.getPrompt());
            if (question.isCorrect(answer))
            {
                pirate.addScore(10);
                pirate.addCoins(5);
                showText("Correct!", 300, 200);
            }
            else
            {
                showText("Wrong! Correct: " + question.getPrimaryAnswer(), 300, 200);
            }
            Greenfoot.delay(50);
            showText("", 300, 200);
        }
        showText("Art Island complete! Score: " + pirate.getScore() + " Coins: " + pirate.getCoins(), 300, 200);
    }
}
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        // Show a message in the center of the world
        showText("Hello, Ana! Kisses :)", 300, 200);
        
        // Add some pirates to the world
        addPirates();
    }
    
    /**
     * Add pirates to the world
     */
    private void addPirates()
    {
        // Add a few pirates at random locations
        for (int i = 0; i < 3; i++)
        {
            int x = Greenfoot.getRandomNumber(getWidth() - 60) + 30;
            int y = Greenfoot.getRandomNumber(getHeight() - 60) + 30;
            Pirate pirate = new Pirate("Pirate " + (i + 1));
            addObject(pirate, x, y);
        }
    }
}
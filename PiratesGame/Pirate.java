import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Pirate character class - represents the pirate character that tracks score and coins.
 * Can be used both as the main player and as NPC pirates in the world.
 * 
 * @author GO GIRLS! Team
 * @version 1.0
 */
public class Pirate extends Actor
{
    private int score;
    private int coins;
    private String name;
    
    /**
     * Default constructor for main player pirate
     */
    public Pirate()
    {
        this.name = "Player";
        this.score = 0;
        this.coins = 0;
        setImage(createPirateImage());
    }
    
    /**
     * Constructor for NPC pirates with a name
     */
    public Pirate(String name)
    {
        this.name = name;
        this.score = 0;
        this.coins = 0;
        setImage(createPirateImage());
    }
    
    /**
     * Create a simple pirate image
     */
    private GreenfootImage createPirateImage()
    {
        GreenfootImage image = new GreenfootImage(30, 30);
        image.setColor(new Color(139, 69, 19));  // Brown color
        image.fillOval(0, 0, 30, 30);
        image.setColor(Color.BLACK);
        image.drawString("P", 12, 20);
        return image;
    }
    
    /**
     * Act method - called every frame
     */
    public void act()
    {
        // Player pirate is controlled by game logic, NPCs can move randomly
        if (!name.equals("Player"))
        {
            move();
        }
    }
    
    /**
     * Pirate movement - wanders randomly (for NPCs)
     */
    protected void move()
    {
        if (Greenfoot.getRandomNumber(100) < 20)
        {
            setRotation(Greenfoot.getRandomNumber(360));
        }
        move(2);  // Move with speed 2
    }

    public void addScore(int amount)
    {
        score += amount;
    }

    public void addCoins(int amount)
    {
        coins += amount;
    }

    public int getScore()
    {
        return score;
    }

    public int getCoins()
    {
        return coins;
    }
    
    public String getName()
    {
        return name;
    }
}

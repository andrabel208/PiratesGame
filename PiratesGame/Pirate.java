import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Represents the pirate character that tracks score and coins.
 */
public class Pirate extends Actor
{
    private int score;
    private int coins;

    public Pirate()
    {
        score = 0;
        coins = 0;
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
}
 * Pirate character class
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pirate extends Character
{
    private int attackPower;
    
    /**
     * Constructor for Pirate
     */
    public Pirate(String name)
    {
        super(name, 100, 3);  // name, health, speed
        this.attackPower = 15;
        
        // Set image - create a simple colored circle for now
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
     * Pirate movement - wanders randomly
     */
    protected void move()
    {
        if (Greenfoot.getRandomNumber(100) < 20)
        {
            setRotation(Greenfoot.getRandomNumber(360));
        }
        move(speed);
    }
    
    /**
     * Attack method
     */
    public void attack(Character target)
    {
        if (target != null)
        {
            target.takeDamage(attackPower);
        }
    }
    
    /**
     * Getter for attack power
     */
    public int getAttackPower()
    {
        return attackPower;
    }
}

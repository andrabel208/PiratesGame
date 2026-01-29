import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Base Character class for all characters in the Pirates Game.
 * Extend this class to create specific character types.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Character extends Actor
{
    protected int speed;
    protected int health;
    protected String name;
    
    /**
     * Constructor for Character
     */
    public Character(String name, int health, int speed)
    {
        this.name = name;
        this.health = health;
        this.speed = speed;
    }
    
    /**
     * Act - do whatever the character needs to do.
     */
    public void act()
    {
        move();
        checkBoundaries();
    }
    
    /**
     * Move the character based on speed
     */
    protected void move()
    {
        // Override this in subclasses for specific movement behavior
    }
    
    /**
     * Check if character is at world boundaries
     */
    protected void checkBoundaries()
    {
        if (getX() < 20 || getX() > getWorld().getWidth() - 20 ||
            getY() < 20 || getY() > getWorld().getHeight() - 20)
        {
            removeSelf();
        }
    }
    
    /**
     * Remove this character from the world
     */
    public void removeSelf()
    {
        getWorld().removeObject(this);
    }
    
    /**
     * Take damage
     */
    public void takeDamage(int damage)
    {
        health -= damage;
        if (health <= 0)
        {
            removeSelf();
        }
    }
    
    /**
     * Getters
     */
    public int getHealth()
    {
        return health;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getSpeed()
    {
        return speed;
    }
}

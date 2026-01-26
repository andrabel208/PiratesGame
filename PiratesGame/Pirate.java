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
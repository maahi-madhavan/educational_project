import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class correct_answer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class correct_answer extends AirEnemy
{
    /**
     * Act - do whatever the correct_answer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void die()
    {
        if(isTouching(Bullet.class)){
            removeTouching(Enemy.class);
            // set image to tick! yay
        }
    }
}

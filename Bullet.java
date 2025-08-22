import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * An object that wll travel in the direction it is facing and remove any enemies it touches. Bullets 
 * dissapear after a short amount of time. Bullets will lock on to enemys.
 * 
 * @author Marcus Jones Jr. 
 * @version 1.0
 */
public class Bullet extends Actor
{
    private int rotation = 0;
    private int timer = 0;
    /**
     * This is the constructor for the bullet class. It uses the rotation of the gun as a parameter 
     * so it knows what direction to travel after being created.
     */
    public Bullet(int rotation){
        this.rotation = rotation;
        setRotation(rotation);
    }

    /**
     * Act - do whatever the bullets wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(7);
        timer++;
        removeBullet();
        tracking();
    }

    /**
     * Turns the bullet towards the first enemy detected in a 25 pixel radius.
     */
    public void tracking(){
        List<Enemy> enemyList= getObjectsInRange(25, Enemy.class);
        if(!enemyList.isEmpty()){
            Actor enemy1 = enemyList.get(0);
            turnTowards(enemy1.getX(), enemy1.getY());
        }
    }

    /**
     * This method will teleport the bullet to 0,0 after a variety of situations.
     * Once the bullet reaches 0,0 it is removed by another object.
     */
    public void removeBullet(){
        if(timer == 27){
            setLocation(0,0);
        }
        if(isTouching(Platform.class)){
            setLocation(0,0);
        }

        if(isTouching(Enemy.class)){
            removeTouching(Enemy.class);
            setLocation(0,0);
        }
        if(isAtEdge()){
            setLocation(0,0);
        }
    }
}

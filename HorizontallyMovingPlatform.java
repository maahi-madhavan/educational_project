import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A platform that moves horizontally across the screen when touched by the player.
 * 
 * @author Marcus Jones Jr.
 * @version 1.0
 */
public class HorizontallyMovingPlatform extends SmallPlatform
{
    private int timer;
    private boolean moving;
    private int speed;
    /**
     * This is the constructor for the HorizontallyMovingPlatform class
     */
    public HorizontallyMovingPlatform (int speed){
        this.speed = speed;
    }

    /**
     * Act - do whatever the HorizontallyMovingPlatform wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        checkPlayerAbove();
        movement();
    }

    /**
     * This method checks to see if the player is standing above the HorizontallyMovingPlatform.
     */
    public void checkPlayerAbove(){
        Actor playerAbove = getOneObjectAtOffset(0,65,(Player.class));
        if(playerAbove != null){
            moving = true;
        }
        if(isTouching(Player.class)){
            moving = true;
        }
    }

    /**
     * This method will move the HorizontallyMovingPlatform after a player has been detecting standing above it.
     */
    public void movement(){
        if(moving){
            timer++;
            if(timer > 0 && timer < 340){
                setLocation(getX() + speed, getY());
            }
            if(timer >= 340 && timer < 530){
                setLocation(getX(), getY());
            }
            if(timer >= 600 && timer < 940){
                setLocation(getX() - speed, getY());
            }
            if(timer >940 && timer < 1130){
                setLocation(getX(), getY());
            }
            if(timer == 1130){
                timer = 0;
            }
        }
    }

    /**
     * This method sets the boolean moving to true.
     */
    public void activate(){
        moving = true;
    }
}


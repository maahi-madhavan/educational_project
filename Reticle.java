import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Object that will follow the player's mouse to help them aim.
 * 
 * @author Marcus Jones Jr.
 * @version 1.0
 */
public class Reticle extends Actor
{
    private boolean gunHeld;
    /**
     * Act - do whatever the Reticle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(gunHeld){
            trackMouse();
        }
    }

    /**
     * This method allows the reticle to follow the mouse.
     */
    public void trackMouse(){
        MouseInfo info = Greenfoot.getMouseInfo();
        if(info != null){
            setLocation(info.getX(), info.getY());
        }
    }

    /**
     * This method sets the gunHeld boolean to true.
     */
    public void activate(){
        gunHeld = true;
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A class containing multiple methods relating to the movement of objects.
 * 
 * @author Marcus Jones Jr. 
 * @version 1.0
 */
public class Mover extends Actor
{
    public int hspeed = 4;
    public int vspeed = 3;
    public int acceleration = 1;
    private int terminalVelocity = 15;
    public boolean edgeOfPlatform;
    /**
     * The fall method allows gravity to act on an object. If an object is suspended in the air and the fall method is called 
     * the object will fall at an increasing speed until it reaches terminal velocity. At terminal velocity the object will fall
     * at a constant speed until it hits the ground.
     */
    public void fall()
    {
        setLocation(getX(), getY() + vspeed);
        if(vspeed < 15){
            if(underPlatform()){
                vspeed = 0;
                vspeed += acceleration;
            }
            if(!underPlatform()){
                vspeed += acceleration;
            }
        }
        if(vspeed >= terminalVelocity){
            vspeed = vspeed;
        }
    }

    /**
     * This method moves objects towards the right side of the screen.
     */
    public void moveRight(){
        setLocation(getX() + hspeed, getY());
    }

    /**
     * This method moves object towards the left side of the screen.
     */
    public void moveLeft(){
        setLocation(getX() - hspeed, getY());
    }    

    /**
     * This method checks to see if an object is underneath a platform.
     */
    public boolean underPlatform()
    {
        Actor under = getOneObjectAtOffset(0, -getImage().getHeight()/2 ,(Platform.class));
        return under != null;
    }

    /**
     * This method checks to see if an object is on the right side of the ground.
     */
    public boolean onGroundRight()
    {
        Actor under = getOneObjectAtOffset(getImage().getWidth()/2, getImage().getHeight()/2 ,(Platform.class));
        return under != null;
    }

    /**
     * This method checks to see if an object is on the left side of the ground.
     */
    public boolean onGroundLeft()
    {
        Actor under = getOneObjectAtOffset(-getImage().getWidth()/2, getImage().getHeight()/2 ,(Platform.class));
        return under != null;
    }

    /**
     * This method checks to see if an object is standing on top of a platform
     */
    public boolean onGround()
    {
        Actor under = getOneObjectAtOffset(0, getImage().getHeight()/2 ,(Platform.class));
        return under != null;
    }

    /**
     * This method checks if an object is touching the left side of a platform.
     */
    public boolean touchingPlatformLeft()
    {
        Actor left = getOneObjectAtOffset(-getImage().getWidth() / 2 -12, 0 ,(Platform.class));
        return left != null;
    }

    /**
     * This method checks if an object is touching the right side of a platform.
     */
    public boolean touchingPlatformRight()
    {
        Actor right = getOneObjectAtOffset(getImage().getWidth() / 2 + 12 , 0 ,(Platform.class));
        return right != null;
    }

    /**
     * This method checks to see if an object is inside a platform.
     */
    public boolean insidePlatform()
    {
        Actor right = getOneObjectAtOffset(0 , 0,(Platform.class));
        return right != null;
    }

    /**
     * This method checks to see if the top of an object is on a ladder
     */
    public boolean upperBodyOnLadder()
    {
        Actor under = getOneObjectAtOffset(0, -getImage().getHeight() /4 ,(Ladder.class));
        return under != null;
    }

    /**
     * This method checks to see if the bottom of an object is on a ladder.
     */
    public boolean lowerBodyOnLadder()
    {
        Actor under = getOneObjectAtOffset(0, getImage().getHeight() /3 ,(Ladder.class));
        return under != null;
    }

    /**
     * This method checks to see whether an object is on the ground or not. If the object is not on the ground the object will fall.
     */
    public void checkFall()
    {
        if(onGroundLeft() 
        ||onGroundRight() || upperBodyOnLadder() || lowerBodyOnLadder())
        {
            vspeed = 3;
        }
        else
        {
            fall();           
        }
    }
}

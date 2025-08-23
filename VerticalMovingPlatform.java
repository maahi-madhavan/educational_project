import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A platform that will move up and down vertically once activated.
 * 
 * @author Marcus Jones Jr. 
 * @version 1.0
 */
public class VerticalMovingPlatform extends SmallPlatform
{
    private boolean moving;
    private boolean activated;
    private int timer = 0;
    private int distance;
    private GreenfootImage image1;
    private GreenfootImage image2;
    /**
     * This is the constructor for the VerticalMovingPlatform class.
     */
    public VerticalMovingPlatform (int distance){
        this.distance = distance;
        image1 = new GreenfootImage("breakoutred.png");
        image2 = new GreenfootImage("breakoutgreen.png");
    }

    /**
     * Act - do whatever the TEST wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(activated){
            if(isTouching(Player.class)){
                moving = true;
            }
        }
        if(moving){
            movement();
        }
    }

    /**
     * This method allows the platform to move up and down.
     */
    public void movement(){
        timer++;
        if(timer > 0 && timer < 60 * distance){
            setLocation(getX(), getY() - 2);
        }
        if(timer >= 60 * distance && timer < 100 * distance){
            setLocation(getX(), getY());
        }
        if(timer >= 100 * distance && timer < 160 * distance){
            setLocation(getX(), getY() + 2);
        }
        if(timer >= 160 * distance && timer < 200 * distance){
            setLocation(getX(), getY());
        }
        if(timer == 200 * distance){
            timer = 0;
        }
    }

    /**
     * This method sets the boolean moving to true whichs begins the movement method.
     */
    public void activate(){
        activated = true;
        setImage(image2);
    }
}

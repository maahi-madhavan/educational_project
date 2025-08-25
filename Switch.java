import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * When touched by a bullet, this object will modify the world.
 * 
 * @author Marcus Jones Jr. 
 * @version 1.0
 */
public class Switch extends Actor
{
    private GreenfootImage image1;
    private GreenfootImage image2;
    public Switch(){
        image1 = new GreenfootImage("redswitch.png");
        image2 = new GreenfootImage("greenswitch.png");
    }

    /**
     * Act - do whatever the Switch wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        switchHit();
    }

    public void switchHit(){
        if(isTouching(Bullet.class)){
            removeTouching(Bullet.class);
            setImage(image2);
            Level4 myLevel4 = (Level4)getWorld();
            myLevel4.spawnPlatform();
        }
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * An enemy that will fly up and down whle shooting projectiles. 
 * 
 * @author Marcus Jones Jr. 
 * @version 1.0
 */
public class AirEnemy extends Enemy
{
    private int timer = 0;
    private int rotation = 0;
    private boolean facingRight;
    private GreenfootImage image1;
    private GreenfootImage image2;
    /**
     * Constructor for the AirEnemy class
     */
    public AirEnemy(){
        image1 = new GreenfootImage("squirrel.png");
        image1.scale(30, 30);
        image2 = new GreenfootImage("squirrel.png");
        image2.scale(30, 30);
    }

    /**
     * Act - do whatever the AirEnemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public void act()
    {
        timer++;  

        shotTimer();    
        direction();    
        movement();
    }

    /**
     * This method allows the air enemy to face left or right depending on where they are.
     */
    public void direction(){
        if(getX() < getWorld().getWidth()/2){
            facingRight = true;
            setImage(image2);
        }
    }

    /**
     * This method will make the air enemy shoot at specific points in the air.
     */
    public void shotTimer(){
        if(timer == 30 || timer == 80 ||timer == 170 || timer == 205){
            shoot();
        }
    }

    /**
     * This method allows the air enemy to move up and down.
     */
    public void movement(){
        if(timer > 0 && timer < 80){
            setLocation(getX(), getY() - vspeed);
        }
        if(timer >= 80 && timer < 120){
            setLocation(getX(), getY());
        }
        if(timer >= 120 && timer < 199){
            setLocation(getX(), getY() + vspeed);
        }
        if(timer >= 199 && timer < 240){
            setLocation(getX(), getY());
        }
        if(timer == 240){
            timer = 0;
        }
    }

    /**
     * This method creates a floating projectile
     */
    public void shoot(){
        FloatingProjectile attack = new FloatingProjectile(facingRight);
        getWorld().addObject(attack, getX() - 23, getY() - 23);
    }
}

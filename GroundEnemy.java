import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * An enemy that moves left and right on a platform and launches projectiles that travel in an arc.
 * 
 * @author Marcus Jones Jr.
 * @version 1.0
 */
public class GroundEnemy extends Enemy
{
    public boolean movingRight = true;
    public boolean movingLeft;
    public boolean turning;
    private GreenfootImage image1;
    private GreenfootImage image2;
    /**
     * This is the constructor for the GroundEnemy Class.
     */
    public GroundEnemy(){
        image1 = new GreenfootImage("groundenemy.png");
        image2 = new GreenfootImage("groundenemyleft.png");
    }

    /**
     * Act - do whatever the GroundEnemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {

        turn();
        checkTurn();
        move();

    }

    /**
     * This method checks if the ground enemy should turn around.
     */
    public void checkTurn(){
        if(onGround()
        )
        {
            vspeed = 3;
            hspeed = 2;
        }
        else{
            turning = true;
        }
    }

    /**
     * This method runs the shoot method while switching the image and movement direction of the enemy.
     */
    public void turn(){
        if(movingRight && turning){
            shoot();
            movingRight = false;
            turning = false;
            setLocation(getX() - 4, getY());
            setImage(image2);

        }
        if(!movingRight && turning){
            shoot();
            movingRight = true;
            turning = false;
            setLocation(getX() + 4, getY());
            setImage(image1);
        }
    }

    /**
     * This method overrides greenfoot's move method and allows the actor to 
     * move left or right based on the value of the boolean movingRight.
     */
    public void move(){
        if (movingRight){
            moveRight();
        }
        if (!movingRight){
            moveLeft();
        }
    }

    /**
     * This method creates a new Projectile object. 
     */
    public void shoot(){
        Projectile attack = new Projectile(movingRight, false);
        if(movingRight){
            getWorld().addObject(attack, getX() + 10, getY() - 10);
        }
        if(!movingRight){
            getWorld().addObject(attack, getX() - 10, getY() - 10);
        }
    }

}

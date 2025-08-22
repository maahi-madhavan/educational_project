import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * An enemy that moves left and right on a platform and launches projectiles that travel in an arc.
 * 
 * @author Marcus Jones Jr.
 * @version 1.0
 */
public class GroundEnemyL1 extends Enemy
{
    public boolean movingRight = false;
    private int timer = 0;
    public boolean movingLeft;
    public boolean turning;
    private GreenfootImage image1;
    private GreenfootImage image2;
    /**
     * This is the constructor for the GroundEnemy Class.
     */
    public GroundEnemyL1(){
        image1 = new GreenfootImage("eclipse.png");
        image1.scale(30, 30);
        image2 = new GreenfootImage("eclipse.png");
        image2.scale(30, 30);
    }

    /**
     * Act - do whatever the GroundEnemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        shot_timer();
        //turn();
        //checkTurn();
        //move();
        
        timer++;

    }

    /**
     * This method checks if the ground enemy should turn around.
     */
    public void checkTurn(){
        if(onGround()
        )
        {
            vspeed = 3;
            hspeed = 1;
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
            //shoot();
            movingRight = false;
            turning = false;
            setLocation(getX() - 0, getY());
            //setImage(image2);

        }
        if(!movingRight && turning){
            //shoot();
            movingRight = true;
            turning = false;
            setLocation(getX() + 0, getY());
            //setImage(image1);
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
    public void shot_timer(){
        if(timer == 30 || timer == 80 ||timer == 170 || timer == 205){
            shoot();
        }
        if(timer == 240){
            timer = 0;
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

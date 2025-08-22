import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The projectile fired by the air enemy class.
 * 
 * @author Marcus Jones Jr.
 * @version 1.0
 */
public class FloatingProjectile extends AirEnemy
{
    private int rotation;
    private int timer = 0;
    private boolean facingRight;
    /**
     * This is the constructor for the FloatingProjectile class and it requires a boolean facing right
     * so the projectile knows which direction to fire. this boolean is taken from the air enemy that
     * spawns it.
     */
    public FloatingProjectile(boolean facingRight){
        this.facingRight = facingRight;
        setRotation(rotation);
    }

    /**
     * Act - do whatever the projectile wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        firingDirection();
        removeFloatingProjectile();
    }

    /**
     * This method allows the projectile to travel in whatever direction the air enemy is facing
     */
    public void firingDirection(){
        if(!facingRight){
            move(-5);
        }
        if(facingRight){
            move(5);
        }
    }

    /**
     * This method will teleport the projectile to 0,0 after a variety of situations. Once the
     * projectile is teleported to 0,0 it is removed by another object.
     */
    public void removeFloatingProjectile(){
        if(isAtEdge()){
            setLocation(0,0);
        }
        if(isTouching(Terrain.class)){
            setLocation(0,0);
        }
        if(timer == 50){
            setLocation(0,0);
        }
    }
}

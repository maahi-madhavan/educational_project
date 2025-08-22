import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A projectile that travels in an arc and damages the player.
 * 
 * @author Marcus Jones Jr. 
 * @version 1.0
 */
public class Projectile extends GroundEnemy
{
    private int timer = 0;
    private int rotation;
    private int jumpStrength = 3;
    private boolean movingRight;
    private boolean lowArc;
    /**
     * This constructor for the Projectile class requires the boolean movingRight to detirme the direction of the
     * ground enemy who created the projectile and the boolean low arc that will determine how high of an arc
     * the projectile is fired at.
     */
    public Projectile(boolean movingRight, boolean lowArc){
        this.movingRight = movingRight;
        this.lowArc = lowArc;
    }

    /**
     * Act - do whatever the projectile wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        firingDirection();
        removeProjectile();
        projectileArc();
        timer++;
    }

    /**
     * This method determines what arc the projectile will travel in. If the projectile was fired by a
     * normal ground enemy the arc will be higher than if it were fired by a alternate ground enemy.
     */
    public void projectileArc(){
        if(!lowArc){
            if(timer < 16){

                jump();
            }
            if(timer > 16){
                fall();
            }
        }
        if(lowArc){
            if(timer < 4){
                jump();
            }
            if(timer > 4){
                fall();
            }
        }
    }

    /**
     * This method will teleport to 0,0 if the projectile has hit the edge of the world or is touching a platform.
     * Once the projectile is teleported to 0,0 another object will remove it from the world.
     */
    public void removeProjectile(){
        if(isAtEdge()){
            setLocation(0,0);
        }
        if(isTouching(Platform.class)){
            setLocation(0,0);
        }
    }

    /**
     * This method using the movement direction of the ground enemy that created the projectile to 
     * determine what direction the projecile will move. 
     * 
     */
    public void firingDirection(){

        if(movingRight){
            move(4);
        }
        if(!movingRight){
            move(-4);
        }
    }

    /**
     * This jump method is borrowed from the Mover class. 
     */
    public void jump(){
        vspeed = -jumpStrength;
        fall();
    }
}

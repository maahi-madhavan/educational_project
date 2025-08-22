import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * An enemy that will shoot projectiles from the ground at a lower arc than the normal ground enemy.
 * 
 * @author Marcus Jones Jr. 
 * @version 1.0
 */
public class AlternateGroundEnemy extends GroundEnemy
{
    /**
     * This method creates a new Projectile object. 
     */
    public void shoot(){
        Projectile attack = new Projectile(movingRight, true);
        if(movingRight){
            getWorld().addObject(attack, getX() + 10, getY() - 10);
        }
        if(!movingRight){
            getWorld().addObject(attack, getX() - 10, getY() - 10);
        }
    }

}


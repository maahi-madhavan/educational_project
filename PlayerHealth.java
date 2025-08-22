import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Displays the player's Hp in the world.
 * 
 * @author Marcus Jones Jr.
 * @version 1.0
 */
public class PlayerHealth extends Actor
{
    private int hp = 2;
    /**
     * This is the constructor for the PlayerHealth class.
     */
    public PlayerHealth(){
        setImage(new GreenfootImage("hits: " + hp, 50, Color.WHITE, Color.BLACK));
    }

    /**
     * Act - do whatever the PlayerHealth wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){
        setHpCounter();
        removeBullet();
        removeEnemy();
        removeEnemyCounter();
    }

    /**
     * This method will set the hp counter to display the number of hits the player has left
     */
    public void setHpCounter(){
        setImage(new GreenfootImage("hits: "+ hp, 50, Color.WHITE, Color.BLACK));
    }

    /**
     * This method will remove objects of the EnemyCounter class if PlayerHealth is touching it.
     */
    public void removeEnemyCounter(){
        if(isTouching(EnemyCounter.class)){
            removeTouching(EnemyCounter.class);
        }
    }

    /**
     * This method will remove objects of the Enemy class if PlayerHealth is touching it.
     */
    public void removeEnemy(){
        if(isTouching(Enemy.class)){
            removeTouching(Enemy.class);
        }
    }

    /**
     * This method will remove objects of the Bullet class if PlayerHealth is touching it.
     */
    public void removeBullet(){
        if(isTouching(Bullet.class)){
            removeTouching(Bullet.class);
        }
    }

    /**
     * This method will lower the variable hp which is usde to display the remaing hit points the player has.
     */
    public void lowerHp()
    {
        hp--;
    }

    /**
     * This method will reset the variable hp to 2.
     */
    public void restoreHp(){
        hp = 2;
    }
}


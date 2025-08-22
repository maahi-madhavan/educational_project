import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * The weapon used by the player. Spawns Bullets when fired and aimed with the mouse.
 * 
 * @author Marcus Jones Jr.
 * @version 1.0
 */
public class Gun extends Actor
{
    private boolean gunHeld;
    private int timer = 0;
    private int level;
    private int rotation = 0;
    private boolean reticleActivated;
    private GreenfootImage image1;
    private GreenfootImage image2;
    public Gun(int level){
        this.level = level;
        image1 = new GreenfootImage("transparentrevolverright.png");
        image2 = new GreenfootImage("transparentrevolverleft.png");
    }

    /**
     * Act - do whatever the Gun wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(gunHeld){
            aim();
            holdGun();
            shoot();
            activateReticle();
        }
        grabGun();
        changeImage();
    }

    /**
     * This method changes the gun's image depending on the direction it's facing.
     */
    public void changeImage(){
        if(getRotation() > 90 && getRotation() < 270){
            setImage(image2);
            setRotation(getRotation() + 180);
        }
        else{
            setImage(image1);
        }
    }

    /**
     * This method sets the boolean gunHeld to treu once the player touches 
     * the gun, allowing the gun to be aimed and fired.
     */
    public void grabGun(){
        if(isTouching(Player.class)){
            gunHeld = true;
        }
    }

    /**
     * Keeps the gun by the players hands once it is near the player.
     * The code written in this method was partially written using the two links below.
     * https://www.greenfoot.org/topics/2799
     * https://runestone.academy/ns/books/published/apcsareview/ListBasics/listMethods.html#:~:text=You%20can%20get%20the%20object,set(index%2Cobj)%20.
     */
    public void holdGun(){
        List<Player> playerList= getObjectsInRange(80, Player.class);
        Actor player = playerList.get(0);
        setLocation(player.getX()+10,player.getY()-5);
    }

    /**
     * This method allows the gun to turn towards where ever the mouse is.
     */
    public void aim(){
        MouseInfo info = Greenfoot.getMouseInfo();
        List<Enemy> enemyList= getObjectsInRange(100, Enemy.class);
        if(info != null && enemyList.isEmpty()){
            turnTowards(info.getX(), info.getY());
        }
        if(!enemyList.isEmpty()){
            Actor enemy1 = enemyList.get(0);
            turnTowards(enemy1.getX(), enemy1.getY());
        }
    }

    /**
     * This method allows the gun to great a bullet every time the mouse is clicked
     */
    public void shoot(){
        timer++;
        MouseInfo info = Greenfoot.getMouseInfo();
        if(info!= null && info.getButton() == 1){
            if(timer > 60){
                Greenfoot.playSound("gunshot.mp3");
                Bullet bullet = new Bullet(getRotation());
                getWorld().addObject(bullet, getX() , getY() - 5);
                timer = 0;
            }
        }
    }

    /**
     * Calls upon the activateReticle method to allow the reticle to begin
     * tracking the mouse.
     */
    public void activateReticle(){
        if(!reticleActivated){
            reticleActivated = true;
            /*if(level == 1){
                Level1 myLevel1 = (Level1)getWorld();
                myLevel1.activateReticle();
            }*/
            if(level == 2){
                Level2 myLevel2 = (Level2)getWorld();
                myLevel2.activateReticle();
            }
            /*if(level == 3){
                Level3 myLevel3 = (Level3)getWorld();
                myLevel3.activateReticle();
            }
            if(level == 4){
                Level4 myLevel4 = (Level4)getWorld();
                myLevel4.activateReticle();
            }*/
        }
    }
}


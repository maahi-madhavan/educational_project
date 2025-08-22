import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.GreenfootSound.*;
/**
 * The character controled by the player.
 * 
 * @author Marcus Jones Jr. 
 * @version 1.0
 */
public class Player extends Mover
{
    private int jumpStrength = 15;
    private int timer = 150;
    private int timer2 = 0;
    private int timer3 = 0;
    private int hitPoints = 2;
    private int hitTimer = 200;
    private int flashTimer =0;
    private int coyoteTimer = 0;
    private int jumpHeightTimer = 0;
    private int animCounterRight = 0;
    private int animCounterLeft = 0;
    private int level = 0;
    private int count = 0;
    private GreenfootImage image1;
    private GreenfootImage image2;
    private GreenfootImage image3;
    private GreenfootImage image4;
    private GreenfootImage image5;
    private GreenfootImage image6;
    private GreenfootImage image7;
    private GreenfootImage image8;
    private GreenfootImage image9;
    private boolean jumping;
    private boolean platformInMotion;
    private boolean changeDirection;
    /**
     * This is the constructor of the Player class.
     */
    public Player(int level){
        //initAnamationSprites();
        this.level = level;
        image1 = new GreenfootImage("sidefaceleft.png");
        image2 = new GreenfootImage("sidefaceright.png");
        image3 = new GreenfootImage("realtransparentpicture.png");
    }

    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        checkKeys();
        checkFall();
        hitTimer++;
        bounceOffSpring();
        useMedkit();
        goal();
        jumpDelayTimer();
        flashOnHit();
        takeDamage();
        die();
        coyoteTimer();
        getWorld();
        collision();
        followVerticalMovingPlatform();
        followHorizontalMovingPlatform();
        escapePlatform();
    }

    /**
     * This method allows the Player to float upwards when stuck inside a platform.
     */
    public void escapePlatform(){
        if(insidePlatform()){
            setLocation(getX(), getY() - getImage().getHeight() * 2/3);
            timer = 0;
        }
    }

    /**
     * This method allows the Player to jump higher than usual when touching a Spring Object.
     */
    public void bounceOffSpring(){
        if(isTouching(Spring.class)){
            setLocation(getX(), getY() +30);
            timer = 7;
            jumpStrength = 22;
            jump();
        }
        else{
            jumpStrength = 15;
        }
    }

    /**
     * This method allows the player to travel upwards when standing on a vertically moving platform.
     */
    public void followVerticalMovingPlatform(){
        Actor undermovingplatform = getOneObjectAtOffset(0, getImage().getHeight() / 2,(VerticalMovingPlatform.class));
        if(undermovingplatform != null){
            setLocation(getX(), undermovingplatform.getY() - getImage().getHeight()/2);
        }
    }

    /**
     * This method allows the player to travel sideways in the direction a 
     * horizontally moving platform is going when they are standing on a horizontally moving platform.
     * 
     */
    public void followHorizontalMovingPlatform(){

        if(platformInMotion){
            timer2++;
            if(timer2 == 1150){
                timer2 = 0;
            }
        }

        Actor ridingmovingplatform = getOneObjectAtOffset(0, getImage().getHeight() / 2,(HorizontallyMovingPlatform.class));
        if(ridingmovingplatform != null || isTouching(HorizontallyMovingPlatform.class)){
            if(!platformInMotion){
                setLocation(getX()+5, getY()+5);
            }
            platformInMotion = true;
            if(timer2 > 0 && timer2 < 360){
                setLocation(getX() - 2, getY());
            }
            if(timer2 >= 360 && timer2 < 550){
                setLocation(getX(), getY());
            }
            if(timer2 >= 600 && timer2 < 960){
                setLocation(getX() +2, getY());
            }
            if(timer2 >960 && timer2 < 1150){
                setLocation(getX(), getY());
            }

        }
    }

    /**
     * This method makes the player's sprite flash when taking damage.
     */
    public void flashOnHit(){
        if(hitTimer<200){
            flashTimer++;
            if(flashTimer == 20){
                setImage(image3);
                flashTimer = 0;
            }
            if(flashTimer == 10){
                setImage(image1);
            }
        }
    }

    /**
     * This method allows for players to jump for a short while after walking off a platform.
     */
    public void coyoteTimer(){
        if(!onGroundLeft() && !onGroundRight() && !upperBodyOnLadder() || lowerBodyOnLadder()){
            coyoteTimer++;
            if(coyoteTimer < 3){
                timer++;
            }
            if (coyoteTimer > 3){
                timer = 0;
            }
        }
        if(onGroundLeft() || onGroundRight() || upperBodyOnLadder() || lowerBodyOnLadder()){
            coyoteTimer = 0;
        }
    }

    /**
     * This method will lower the player's hp in the player object and in the PlayerHealth object when the player
     * takes damage.
     */
    public void takeDamage(){
        if(isTouching(Enemy.class) || isTouching(Spikes.class)){
        if(hitTimer > 200){
            hitPoints--;
            hitTimer = 0;
            /*if(level == 1){
                Level1 myLevel1 = (Level1)getWorld();
                myLevel1.lowerHp();
            }*/
            if(level == 2){
                Level2 myLevel2 = (Level2)getWorld();
                myLevel2.lowerHp();
            }
            /*if(level == 3){
                Level3 myLevel3 = (Level3)getWorld();
                myLevel3.lowerHp();
            }
            if(level == 4){
                Level4 myLevel4 = (Level4)getWorld();
                myLevel4.lowerHp();
            }*/
        }
    }
    }

    /**
     * This method will change the static int level to whatever int is placed in the parameters
     */
    public void setLevel(int level){
        this.level = level;
    }

    /**
     * This method will display the death screen when the player's hit points reach zero.
     */
    public void die(){
        if (hitPoints == 0){
            /*if(level == 1){
                Level1 myLevel1 = (Level1)getWorld();
                myLevel1.dead();
            }*/
            if(level == 2){
                Level2 myLevel2 = (Level2)getWorld();
                myLevel2.dead();
            }
            /*if(level == 3){
                Level3 myLevel3 = (Level3)getWorld();
                myLevel3.dead();
            }
            if(level == 4){
                Level4 myLevel4 = (Level4)getWorld();
                myLevel4.dead();
            }*/
        }
    }

    /**
     * This method will slightly teleport the player away when the try running into a wall.
     */
    public void collision(){
        if(touchingPlatformRight()){
            setLocation(getX() - 4, getY());
        }
        if(touchingPlatformLeft()){
            setLocation(getX() + 4, getY());
        }
    }

    /**
     * This method checks what keys are being pressed and what 
     * actions the player will preform based on these key presses.
     */
    public void checkKeys()
    {
        if (Greenfoot.isKeyDown("d") && !touchingPlatformRight())
        {
            moveRight();
            setImage(image2);

            //animateWalkRight();
        }

        if (Greenfoot.isKeyDown("a") && !touchingPlatformLeft())
        {
            moveLeft();

            setImage(image1);
            //animateWalkLeft();
        }

        if(Greenfoot.isKeyDown("space")){
            jump();
        }

        if(Greenfoot.isKeyDown("w")){
            if(upperBodyOnLadder() || lowerBodyOnLadder()){
                climbUp();
            }
        }

        if(Greenfoot.isKeyDown("s")){
            if(upperBodyOnLadder() || lowerBodyOnLadder()){
                climbDown();
            }
        }
    }

    /**
     * This method will advance the player to the next level when they touch the Goal object.
     */
    public void goal(){
        if(isTouching(Goal.class)){
            /*if(level == 1){
                Level1 myLevel1 = (Level1)getWorld();
                myLevel1.nextLevel();
            }*/
            if(level == 2){
                count++;
                Level2 myLevel2 = (Level2)getWorld();
                myLevel2.nextLevel();
            }
            /*if(level == 3){
                Level3 myLevel3 = (Level3)getWorld();
                myLevel3.nextLevel();
            }
            if(level == 4){
                Level4 myLevel4 = (Level4)getWorld();
                myLevel4.nextLevel();
            }*/
        }
    }

    /**
     * This method sets a delay timer for the jump methdo so the player cannot instantly jump after landing from a previous jump.
     */
    public void jumpDelayTimer(){
        if(onGroundLeft() ||onGroundRight() || upperBodyOnLadder() || lowerBodyOnLadder()){
            timer++;
        }
    }

    /**
     * This method will restore the player's hp in the Player object aswell as in the PlayerHealth object when the player touches a Medkit.
     */
    public void useMedkit(){
        if(isTouching(Medkit.class)){
            removeTouching(Medkit.class);
            hitPoints = 2;
            /*if(level == 1){
                Level1 myLevel1 = (Level1)getWorld();
                myLevel1.restoreHp();
            }*/
            if(level == 2){
                Level2 myLevel2 = (Level2)getWorld();
                myLevel2.restoreHp();
            }
            /*if(level == 3){
                Level3 myLevel3 = (Level3)getWorld();
                myLevel3.restoreHp();
            }
            if(level == 4){
                Level4 myLevel4 = (Level4)getWorld();
                myLevel4.restoreHp();
            }*/
        }
    }
    /**
     * This method allows the player to jump.
     */
    public void jump()
    { 
        if(timer > 6){
            Greenfoot.playSound("Jump.wav");
            vspeed = -jumpStrength;
            fall();
            timer = 0;
        }
    }
    /**
     * This method allows the player to gain a speed boost when pressing the shift key.
     */
    public void sprint(){
        if(Greenfoot.isKeyDown("shift")){
            hspeed = 6;
        }
        else{
            hspeed = 4;
        }
    }

    /**
     * This method allows the player to climb up ladders
     */
    public void climbUp(){
        setLocation(getX(), getY() - vspeed);
    }

    /**
     * This method allows the player to climb down ladders.
     */
    public void climbDown(){
        setLocation(getX(), getY() + vspeed);
    }
}


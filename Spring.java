import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * An object that will increase the player's jump 
 * height when touched by the player.
 * 
 * @author Marcus Jones Jr. 
 * @version 1.0
 */
public class Spring extends Actor
{
    private int timer = 30;
    private GreenfootImage image1;
    private GreenfootImage image2;
    public Spring(){
        image1 = new GreenfootImage("spring.png");
        image2 = new GreenfootImage("spring2.png");
    }

    /**
     * Act - do whatever the Spring wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        timer++;
        changeImage();
    }

    /**
     * This method changes the image of the spring for a short amount of time
     * once the player jumps on it. 
     */
    public void changeImage(){
        if(timer < 20){
            setImage(image2);
        }
        else{
            setImage(image1);
        }

        if(isTouching(Player.class)){
            timer = 0;
        }
        else{
            timer++;
        }
    }
}

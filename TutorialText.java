import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Displays text in the world.
 * 
 * @author Marcus Jones Jr.
 * @version 1.0
 */
public class TutorialText extends Actor
{
    private String text;
    /**
     * This constructor will  allow for the display of any string that is given as the parameter.
     */
    public TutorialText(String text){
        this.text = text;
        setImage(new GreenfootImage(text, 27, Color.WHITE, Color.BLACK));
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Sets images to be used as buttons and icons used in the menus.
 * 
 * @author Marcus Jones Jr. 
 * @version 1.0
 */
public class MenuButton extends Actor
{
    private String imageName;
    private GreenfootImage image1;
    /**
     * The constructor for the MenuButton class.
     */
    public MenuButton (String imageName){
        this.imageName = imageName;
        image1 = new GreenfootImage(imageName);
        setImage(image1);
    }
}

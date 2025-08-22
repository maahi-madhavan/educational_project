import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FrenchText here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FrenchText extends Actor
{
    /**
     * Act - do whatever the FrenchText wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private String text;
    public FrenchText(String text)
    {
        this.text = text;
        setImage(new GreenfootImage(text, 27, Color.BLUE, Color.YELLOW));
    }
}

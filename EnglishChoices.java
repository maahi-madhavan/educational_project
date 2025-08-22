import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.Color;// imports color for text

/**
 * Write a description of class EnglishLabel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnglishChoices extends Actor
{
    private String text;
    
    public EnglishChoices(String text){
        this.text = text;
        setImage(new GreenfootImage(text, 25, Color.WHITE, Color.BLACK));
    }
}

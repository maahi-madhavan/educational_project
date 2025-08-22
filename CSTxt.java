
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.Color;// imports color for text

/**
 * Write a description of class CSTxt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CSTxt extends Actor
{
    private String text;
    
    public CSTxt(String text){
        this.text = text;
        setImage(new GreenfootImage(text, 27, Color.WHITE, Color.BLUE));
    }
}

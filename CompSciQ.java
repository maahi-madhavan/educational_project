
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CompSciQ here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CompSciQ extends World
{

    public CompSciQ()
    {    
        super(600, 400, 1); 
        javaq();
    }

    private void javaq(){
    CSTxt question = new CSTxt("Which reference data type is used to represent 3.22 in Java?\nPress the letter on your keyboard that matches your answer.");
    CSChoices choices = new CSChoices("a:int    b:char    c:boolean    d:double");
    CSAnswer answer = new CSAnswer(CSAnswer.getresponse());  
    addObject(question,300,100);
    addObject(choices,300,150);
    addObject(answer,300,350);
}

    }

    

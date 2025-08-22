import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Englishlevel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Englishlevel extends World
{
    /**
     * Constructor for objects of class Englishlevel.
     * 
     */
    public Englishlevel()
    {    
        // Create a new world with 1000x750 cells with a cell size of 1x1 pixels.
        super(1000, 750, 1); 
        
        prepare();
    }
    private void prepare(){
        EnglishLabel question = new EnglishLabel("Which word best completes the sentence:\n"+"'She was very _____  after running the race.'\n"+"Press the letter on your keyboard that matches your answer.");
        EnglishChoices choices = new EnglishChoices("A: Tired    B:Excited    C:Hungry    D:Quiet");
        Feedback feedback = new Feedback(Feedback.getresponse());
        addObject(question,500,200);
        addObject(choices,500,300);
        addObject(feedback,500,450);
    }
}

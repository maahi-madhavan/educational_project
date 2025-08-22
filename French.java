import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class French here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class French extends Actor
{
    /**
     * Act - do whatever the French wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public String frenchQuestion = "";
    public String correctAnswer = "";
    public String incorrectAnswer = "";
    
    public void Question(String french, String correct, String incorrect) {
        frenchQuestion = french;
        correctAnswer = correct;
        incorrectAnswer = incorrect;
    }
    
    public void act()
    {
        // Add your action code here.
    }
}

import greenfoot.*;  
import greenfoot.Color;

public class Feedback extends Actor
{
    private String text="";
    private static String response = "";
    private boolean aPressed = false;

    public Feedback(String text){
        this.text = text; // store the text for display
        setImage(new GreenfootImage(text, 25, Color.WHITE, Color.BLACK));
    }

    public void act() {
        String key = Greenfoot.getKey();  // last key pressed, then cleared

        if (key != null) { // only do something if a key was pressed
            if (key.equals("a")) {
                response = "Correct! Let's move on!";
                Level2 level2 = new Level2();
                Greenfoot.setWorld(level2);
            } else if (key.equals("b") || key.equals("c") || key.equals("d")) {
                response = "Whoops, try again";
            }

            // Update display every time a key is pressed
            setImage(new GreenfootImage(response, 25, Color.WHITE, Color.BLACK));
            System.out.println(response);
        }
    }

    public static String getresponse(){
        return response;
    }
}

        /*if (Greenfoot.isKeyDown("a")) {
            //response =
            System.out.println("Correct! Let's move on!");
            setImage(new GreenfootImage(text, 25, Color.WHITE, Color.BLACK));
        } else {
            //response = "Whoops, try again";
            System.out.println("Whoops, try again");
            setImage(new GreenfootImage(text, 25, Color.WHITE, Color.BLACK));
        }*/

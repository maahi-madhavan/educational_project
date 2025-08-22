import greenfoot.*;  
import greenfoot.Color;

public class CSAnswer extends Actor
{
    private String text="";
    private static String response = "";

    public CSAnswer(String text){
        this.text = text;
        setImage(new GreenfootImage(text, 25, Color.WHITE, Color.BLUE));
    }

    public void act() {
        String key = Greenfoot.getKey();  
        if (key != null) { //when user presses a key
            if (key.equals("d")) { //correct answer
                response = "Correct! Let's move on!";
                Level4 level4 = new Level4();
                Greenfoot.setWorld(level4);
            } else if (key.equals("b") || key.equals("c") || key.equals("a")) {
                response = "Whoops, try again";
            }

            setImage(new GreenfootImage(response, 25, Color.WHITE, Color.BLUE));
            System.out.println(response);
        }
    }

    public static String getresponse(){
        return response;
    }
}

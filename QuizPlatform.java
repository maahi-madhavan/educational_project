import greenfoot.*;

/**
 * A platform that asks a math question when the player goes on it.
 * - If correct it turns green
 * - On the first wrong it restarts the current level 
 * - On the second wrong it sends the player to the death screen.
 */
public class QuizPlatform extends SmallPlatform {

    // restart leaves 1 attempt remaining.
    private static int attemptsRemaining = 2;

    private boolean asked = false;   
    private String prompt;
    private String correct;

    /** Default: fixed question */
    public QuizPlatform() {
        this("What is the derivative of x^2", "2x");
    }

    /** Custom question/answer */
    public QuizPlatform(String prompt, String correct) {
        this.prompt = prompt;
        this.correct = correct;
        setImage(new GreenfootImage("breakoutred.png")); // red at starting
    }

    public void act() {
        askWhenPlayerOnTop();
    }

    private void askWhenPlayerOnTop() {
        if (asked) return;

        // Player standing on platform
        Actor playerAbove = getOneObjectAtOffset(0, -getImage().getHeight()/2 - 5, Player.class);
        if (playerAbove == null) playerAbove = getOneObjectAtOffset(0, 0, Player.class);
        if (playerAbove == null) return;

        String user = Greenfoot.ask(prompt);
        if (user != null && user.trim().equals(correct)) {
            // If correct reset attempts 
            setImage(new GreenfootImage("breakoutgreen.png"));
            attemptsRemaining = 2;
            asked = true;
        } else {
            handleWrongAnswer();
        }
    }

    private void handleWrongAnswer() {
        attemptsRemaining--;

        World w = getWorld();
        if (attemptsRemaining >= 1) {
            // First wrong restart the current level 
            restartCurrentLevel(w);
        } else {
            // Second wrong goes to the death screen
            sendToDeath(w);
            // Reset for future levels 
            attemptsRemaining = 2;
        }
        asked = true; 
    }

    private void restartCurrentLevel(World w) {
        if (w instanceof Level1) Greenfoot.setWorld(new Level1());
        else if (w instanceof Level2) Greenfoot.setWorld(new Level2());
        else if (w instanceof Level3) Greenfoot.setWorld(new Level3());
        else if (w instanceof Level4) Greenfoot.setWorld(new Level4());
        else {
            // Brief delay 
            Greenfoot.delay(20);
        }
    }

    private void sendToDeath(World w) {
        if (w instanceof Level1) Greenfoot.setWorld(new Death(1));
        else if (w instanceof Level2) Greenfoot.setWorld(new Death(2));
        else if (w instanceof Level3) Greenfoot.setWorld(new Death(3));
        else if (w instanceof Level4) Greenfoot.setWorld(new Death(4));
        else {
            // Remove player if problems
            Player p = (Player) getOneIntersectingObject(Player.class);
            if (p != null) w.removeObject(p);
        }
    }
}

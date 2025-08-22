import greenfoot.*;  

public class QuestionPlatform extends SmallPlatform {
    private boolean triggered = false;

    public void act() {
        checkCollision();
    }
    private void checkCollision() {
        if (!triggered) {
            Player player = (Player)getOneIntersectingObject(Player.class);
            if (player != null) {
                triggered = true;
                // Switch to CompSciQ world
                Greenfoot.setWorld(new CompSciQ());
            }
        }
    }
}

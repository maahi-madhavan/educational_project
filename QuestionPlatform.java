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

                // Change platform image to green
                GreenfootImage img = getImage();
                img.setColor(Color.GREEN);
                img.fill(); // fills the image with green
                setImage(img);

                // Switch to CompSciQ world
                Greenfoot.setWorld(new CompSciQ());
            }
        }
    }
}

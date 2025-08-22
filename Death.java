import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This world is run when the player dies in a level. It will prompt the player to retry the level or return to the main menu.
 * 
 * @author Marcus Jones Jr.
 * @version 1.0
 */
public class Death extends World
{
    private int level;
    private MenuButton retry = new MenuButton("Retry.png");
    private MenuButton menu = new MenuButton("MainMenu.png");
    Player player = new Player(0);
    /**
     * Constructor for objects of class Death.
     */
    public Death(int level)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        this.level = level;

        addObject(menu, getWidth() * 1/4 ,getHeight()*3/4);
        addObject(retry, getWidth() * 3/4,getHeight() * 3/4);
        MenuButton gameOver = new MenuButton("GameOver.png");
        addObject(gameOver, getWidth()/2,getHeight() * 1/4);
    }

    /**
     * This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment
     */
    public void act(){
        retry();
        mainMenu();
    }

    /**
     * Changes the current world to the TitleScreen
     */
    public void mainMenu(){
        if(Greenfoot.mouseClicked(menu)){
            TitleScreen TitleScreen = new TitleScreen();
            Greenfoot.setWorld(TitleScreen);
        }
    }

    /**
     * Changes the current world to the world the simulation ran previously.
     */
    public void retry(){
        if(Greenfoot.mouseClicked(retry)){
            /*if(level == 1){
                Level1 level1 = new Level1();
                Greenfoot.setWorld(level1);
            }*/
            if(level == 2){
                Level2 level2 = new Level2();
                Greenfoot.setWorld(level2);
            }
            /*if(level == 3){
                Level3 level3 = new Level3();
                Greenfoot.setWorld(level3);
            }
            if(level == 4){
                Level4 level4 = new Level4();
                Greenfoot.setWorld(level4);
            }*/
        }
    }
}

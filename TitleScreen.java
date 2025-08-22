import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Screen with the option to view the HowToPlay world or being the game in 
 * world Level1
 * 
 * @author Marcus Jones Jr.
 * @version 1.0
 */
public class TitleScreen extends World
{
    public MenuButton title = new MenuButton("SpareChange.png");
    public MenuButton controls = new MenuButton("HowtoPlay.png");

    public MenuButton start = new MenuButton("StartGame.png");
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 750, 1); 
        addObject(controls, getWidth() * 1/4 ,getHeight()*3/4);
        addObject(start, getWidth() * 3/4,getHeight() * 3/4);
        addObject(title, getWidth()/2,getHeight() * 1/4);
    }

    /**
     * This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment
     */
    public void act(){
        titleSecret();
        howToPlay();
        startGame();
    }

    /**
     * Changes the cuurent world to the Level1 world.
     */
    public void startGame(){
        if(Greenfoot.mouseClicked(start)){
            /*
            Level1 level1 = new Level1();
            Greenfoot.setWorld(level1);
            */
        }
    }

    /**
     * Changes the current world to the HowToPlay world.
     */
    public void howToPlay(){
        if(Greenfoot.mouseClicked(controls)){
            HowToPlay HowToPlay = new HowToPlay();
            Greenfoot.setWorld(HowToPlay);
        }

    }

    /**
     * Adds multiple goal objects.
     */
    public void titleSecret(){
        if(Greenfoot.mouseClicked(title)){
            Goal goal1 = new Goal();
            Goal goal2 = new Goal();
            Goal goal3 = new Goal();
            Goal goal4 = new Goal();

            addObject(goal1, getWidth() * 4/9, getHeight() * 4/9);
            addObject(goal2, getWidth() * 5/9, getHeight() * 4/9);
            addObject(goal3, getWidth() * 4/9, getHeight() * 5/9);
            addObject(goal4, getWidth() * 5/9, getHeight() * 5/9);

        }

    }
}

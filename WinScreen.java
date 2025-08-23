import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A world displaying a meassage saying "you win" with a button that changes
 * the world to the Title Screen.
 * 
 * @author Marcus Jones Jr.
 * @version 1.0
 */
public class WinScreen extends World
{
    private MenuButton menu = new MenuButton("MainMenu.png");
    /**
     * Constructor for objects of class WinScreen.
     * 
     */
    public WinScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 469, 1); 
        MenuButton win = new MenuButton("win.png");
        addObject(win, getWidth()/2, 228);

        addObject(menu, getWidth()/2, 432);
    }

    /**
     * This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment
     */
    public void act(){
        mainMenu();
    }

    /**
     * Changes the current world to the TitleScreen world.
     */
    public void mainMenu(){
        if(Greenfoot.mouseClicked(menu)){
            TitleScreen TitleScreen = new TitleScreen();
            Greenfoot.setWorld(TitleScreen);
        }
    }
}

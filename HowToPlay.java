import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A world that contains an explaination of the game's stroy as well as its controls and objectives.
 * 
 * @author Marcus Jones Jr. 
 * @version 1.0
 */
public class HowToPlay extends World
{
    private MenuButton menu = new MenuButton("MainMenu.png");

    /**
     * Constructor for objects of class Story.
     * 
     */
    public HowToPlay()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 750, 1); 
        MenuButton lore = new MenuButton("lore.png");
        addObject(lore, 587,108);

        MenuButton story = new MenuButton("Story.png");
        addObject(story, 141, 108);

        MenuButton objective = new MenuButton("Obj.png");
        addObject(objective, 534, 348);

        MenuButton how = new MenuButton("HowtoPlay.png");
        addObject(how, 117, 322);

        MenuButton controls = new MenuButton("Controls.png");
        addObject(controls, 385, 649);

        MenuButton keys = new MenuButton("keys.png");
        addObject(keys, 656, 649);

        MenuButton tips = new MenuButton("Tips.png");
        addObject(tips, 286, 465);

        Arrow arrow1 = new Arrow();
        Arrow arrow2 = new Arrow();
        addObject(arrow1, 56, 629);
        addObject(arrow2, 146, 629);

        addObject(menu, 108, 710);
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

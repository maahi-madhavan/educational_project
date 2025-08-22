import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The 3rd stage in the game.
 * 
 * @author Marcus Jones Jr.
 * @version 1.0
 */
public class Level3 extends World
{
    PlayerHealth hp = new PlayerHealth();
    EnemyCounter maincounter = new EnemyCounter(2, true, 3);
    EnemyCounter counter1 = new EnemyCounter(2, false, 3);
    EnemyCounter counter2 = new EnemyCounter(2, false, 3);
    EnemyCounter counter3 = new EnemyCounter(2, false, 3);
    EnemyCounter counter4 = new EnemyCounter(2, false, 3);
    EnemyCounter counter5 = new EnemyCounter(2, false, 3);
    Player player = new Player(3);
    VerticalMovingPlatform vplatform1 = new VerticalMovingPlatform(5); 
    Reticle reticle = new Reticle();
    /**
     * Constructor for objects of class Level2Screen2.
     * 
     */
    public Level3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 750, 1); 

        addObject(player, 52, 120);

        addObject(hp,58,25);
        addObject(maincounter, 876,15);

        Terrain terrain1 = new Terrain();
        Terrain terrain2 = new Terrain();
        Terrain terrain3 = new Terrain();
        Terrain terrain4 = new Terrain();
        Terrain terrain5 = new Terrain();
        Terrain terrain6 = new Terrain();
        Terrain terrain7 = new Terrain();
        Terrain terrain8 = new Terrain();
        Terrain terrain9 = new Terrain();
        Terrain terrain10 = new Terrain();
        addObject(terrain1, 125, 760);
        addObject(terrain2, 375, 760);
        addObject(terrain3, 625, 760);
        addObject(terrain4, 875, 760);
        addObject(terrain5, 0, 198);
        addObject(terrain6,0,290);
        addObject(terrain7, 0, 378);
        addObject(terrain8, 0, 469);
        addObject(terrain9, 0, 565);
        addObject(terrain10, 0, 656);

        Ladder ladder1 = new Ladder();
        Ladder ladder2 = new Ladder();
        Ladder ladder3 = new Ladder();
        Ladder ladder4 = new Ladder();

        addObject(ladder1,460, 293);
        addObject(ladder2,460, 329);
        addObject(ladder3,460, 364);
        addObject(ladder4,460, 397);

        SmallPlatform splatform1 = new SmallPlatform();
        SmallPlatform splatform2 = new SmallPlatform();
        SmallPlatform splatform3 = new SmallPlatform();
        SmallPlatform splatform4 = new SmallPlatform();
        SmallPlatform splatform5 = new SmallPlatform();
        SmallPlatform splatform6 = new SmallPlatform();
        SmallPlatform splatform7 = new SmallPlatform();
        SmallPlatform splatform8 = new SmallPlatform();
        SmallPlatform splatform9 = new SmallPlatform();
        /* platform 10 is the third to last platform on the right side 
        when you hit it, the question is triggered*/
        QuestionPlatform qplatform10 = new QuestionPlatform();
        SmallPlatform splatform11 = new SmallPlatform();
        SmallPlatform splatform12 = new SmallPlatform();
        SmallPlatform splatform13 = new SmallPlatform();
        SmallPlatform splatform14 = new SmallPlatform();
        SmallPlatform splatform15 = new SmallPlatform();
        SmallPlatform splatform16= new SmallPlatform();
        addObject(splatform1, 679,204);
        addObject(splatform2, 482,415);
        addObject(splatform3, 640,278);
        addObject(splatform4,270,482);
        addObject(splatform5,480,552);
        addObject(splatform6,321,637);
        addObject(splatform7, 540, 278);
        addObject(splatform8, 792, 347);
        addObject(splatform9, 746, 347);
        // question platform 10
        addObject(qplatform10, 999, 347);
        addObject(splatform11, 749, 480);
        addObject(splatform12, 948, 480);
        addObject(splatform13, 747, 582);
        addObject(splatform14, 778, 582);
        addObject(splatform15, 959, 582);
        addObject(splatform16, 280, 329);

        addObject(vplatform1, 873, 700);

        Spikes spike1 = new Spikes();
        Spikes spike2 = new Spikes();
        Spikes spike3 = new Spikes();
        Spikes spike4 = new Spikes();
        Spikes spike5 = new Spikes();
        Spikes spike6 = new Spikes();
        addObject(spike1, 808, 327);
        addObject(spike2, 765, 460);
        addObject(spike3, 943, 562);
        addObject(spike4, 983, 327);
        addObject(spike5, 932, 460);
        addObject(spike6, 794, 562);

        Medkit medkit1 = new Medkit();

        GroundEnemy enemy1 = new GroundEnemy();
        addObject(enemy1,682, 165);
        addObject(counter1,682, 165);

        AirEnemy enemy2 = new AirEnemy();
        addObject(enemy2, 655, 608);
        addObject(counter2,655, 608);

        addObject(reticle, getWidth()/2, getHeight()/2);

        Gun gun = new Gun(3);
        addObject(gun,278,446);

        Wall wall1 = new Wall();
        Wall wall2 = new Wall();
        Wall wall3 = new Wall();
        Wall wall4 = new Wall();
        Wall wall5 = new Wall();
        Wall wall6 = new Wall();
        Wall wall7 = new Wall();
        Wall wall8 = new Wall();
        Wall wall9 = new Wall();
        addObject(wall1,598,629);
        addObject(wall2,598,479);
        addObject(wall3,598,346);
        addObject(wall4,205,75);
        addObject(wall5,205,225);
        addObject(wall6,205,375);
        addObject(wall7,205,525);
        addObject(wall8,686,360);
        addObject(wall9,686,510);
        
        Goal Goal = new Goal();
        addObject(Goal, 961, 94);

    
        Arrow arrow = new Arrow();
        addObject(arrow,899,233);

    }

    /**
     * Changes current world to the Level4 world.
     */
    public void nextLevel(){
        Level4 mylevel4 = new Level4();
        Greenfoot.setWorld(mylevel4);
    }

    /**
     * Runs the lowerHp method in the Player Health Class
     */
    public void lowerHp(){
        hp.lowerHp();
    }

    /**
     * Changes current world to the Death world.
     */
    public void dead(){
        Death death = new Death(3);
        Greenfoot.setWorld(death);
    }

    /**
     * Runs the activate method in the Reticle Class.
     */
    public void activateReticle(){
        reticle.activate();
    }

    /**
     * Runs the restoreHp method in the Player Health Class
     */
    public void restoreHp(){
        hp.restoreHp();
    }

    /**
     * Runs the lowerEnemyCount method in the Enemy Counter Class
     */
    public void lowerEnemyCount(){
        maincounter.lowerEnemyCount();
    }

    /**
     * Runs the activate method in the VerticalMovingPlatform Class.
     */
    public void levelClear(){
        vplatform1.activate();
    }
}


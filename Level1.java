import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The 1st stage in the game.
 * 
 * @author Marcus Jones Jr.
 * @version 1.0
 */
public class Level1 extends World
{
    Player player = new Player(1);
    PlayerHealth hp = new PlayerHealth();
    EnemyCounter maincounter = new EnemyCounter(2, true, 1);
    EnemyCounter counter1 = new EnemyCounter(2, false, 1);
    EnemyCounter counter2 = new EnemyCounter(2, false, 1);
    CorrectAnswerCounter correct_counter = new CorrectAnswerCounter(1, false, 1);
    VerticalMovingPlatform platform13 = new VerticalMovingPlatform(1);
    Reticle reticle = new Reticle();
    French french = new French();
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Level1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 750, 1); 

        addObject(player, 52, 684);

        Terrain terrain1 = new Terrain();
        Terrain terrain2 = new Terrain();
        Terrain terrain3 = new Terrain();
        Terrain terrain4 = new Terrain();
        Terrain terrain5 = new Terrain();
        Terrain terrain6 = new Terrain();
        addObject(terrain1, 125, 760);
        addObject(terrain2, 375, 760);
        addObject(terrain3, 625, 760);
        addObject(terrain4, 875, 760);
        addObject(terrain5, getWidth() / 2, 670);
        addObject(terrain6, getWidth() / 2, 580);
        Ladder ladder1 = new Ladder();
        Ladder ladder2 = new Ladder();
        Ladder ladder3 = new Ladder();
        Ladder ladder4 = new Ladder();
        Ladder ladder5 = new Ladder();
        Ladder ladder6 = new Ladder();
        Ladder ladder7 = new Ladder();
        Ladder ladder8 = new Ladder();
        Ladder ladder9 = new Ladder();
        Ladder ladder10 = new Ladder();
        addObject(ladder1, 655, 693);
        addObject(ladder2, 655, 655);
        addObject(ladder3, 655, 616);
        addObject(ladder4, 655, 580);
        addObject(ladder5, 655, 553);
        addObject(ladder6, 787, 693);
        addObject(ladder7, 787, 655);
        addObject(ladder8, 787, 616);
        addObject(ladder9, 787, 580);
        addObject(ladder10, 787, 553);
        SmallPlatform platform1 = new SmallPlatform();
        SmallPlatform platform2 = new SmallPlatform();
        SmallPlatform platform3 = new SmallPlatform();
        SmallPlatform platform4 = new SmallPlatform();
        SmallPlatform platform5 = new SmallPlatform();
        SmallPlatform platform6 = new SmallPlatform();
        SmallPlatform platform7 = new SmallPlatform();
        SmallPlatform platform8 = new SmallPlatform();
        SmallPlatform platform9 = new SmallPlatform();
        SmallPlatform platform10 = new SmallPlatform();
        SmallPlatform platform11 = new SmallPlatform();
        SmallPlatform platform12 = new SmallPlatform();
        SmallPlatform platform14 = new SmallPlatform();
        SmallPlatform platform15 = new SmallPlatform();
        SmallPlatform platform16 = new SmallPlatform();
        SmallPlatform platform17 = new SmallPlatform();
        addObject(platform1, 189, 609);
        addObject(platform2, 322, 565);
        addObject(platform3, 866,521);
        addObject(platform4, 997,457);
        addObject(platform5, 519, 445);
        addObject(platform6, 329, 403);
        addObject(platform7, 154,347);
        addObject(platform8, 29,289);
        addObject(platform9, 583, 125);
        addObject(platform11, 949,182);
        addObject(platform14, 231, 222);
        addObject(platform15, 460,193);

        addObject(platform13, 824, 382);
        Medkit medkit1 = new Medkit();
        addObject(medkit1,978,428);
        GroundEnemyL1 enemy1 = new GroundEnemyL1();
        addObject(enemy1, 618, 85);
        addObject(counter1, 618, 85);
        Goal goal = new Goal();
        addObject(goal,949,115);
        addObject(hp,58,25);
        TutorialText jump = new TutorialText("Press the spacebar to jump.");
        addObject(jump, 222, 716);
        TutorialText climb = new TutorialText("Use the w and s Keys to climb ladders.");
        addObject(climb, 722, 716);
        TutorialText move = new TutorialText("Use the a and d keys \n to move left and right.");
        addObject(move, 120, 457);
        TutorialText medkit = new TutorialText("Collect medkits \n to restore health.");
        addObject(medkit, 905, 556);
        TutorialText sprint = new TutorialText("Move the mouse to \n aim and left click \n to shoot");
        addObject(sprint, getWidth()/2, 590);
        TutorialText clearLevel = new TutorialText("Eliminate all enemies \nin a level to advance");
        addObject(clearLevel,694,202);
        
        FrenchText hiQuestion = new FrenchText("What does the word 'Écureuil' mean?");
        addObject(hiQuestion, 335, 285);
        
        Gun gun = new Gun(1);
        addObject(gun, 50, 683);

        addObject(reticle, getWidth()/2, getHeight()/2);
        //AirEnemy enemy2 = new AirEnemy();
        //addObject(enemy2,697, 501);
        //addObject(counter2,697, 501);
        
        correct_answer hello = new correct_answer();
        addObject(hello,697, 501);
        addObject(correct_counter,697, 501);
        addObject(maincounter, 876,15);
    }

    /**
     * Changes the current world to the Level2 world
     */
    public void nextLevel(){
        Level2 level2 = new Level2();
        Greenfoot.setWorld(level2);

    }

    /**
     * Runs the lowerHp method in the Player Health Class
     */
    public void lowerHp(){
        hp.lowerHp();
    }

    /**
     * Changes the current world to the Death world.
     */
    public void dead(){
        Death death = new Death(1);
        Greenfoot.setWorld(death);
    }

    /**
     * Runs the restoreHp method in the Player Health Class.
     */
    public void restoreHp(){
        hp.restoreHp();
    }

    /**
     * Runs the lowerEnemyCount method in the EnemyCounter Class.
     */
    public void lowerEnemyCount(){
        maincounter.lowerEnemyCount();
    }

    /**
     * Runs the activate method in the Reticle Class
     */
    public void activateReticle(){
        reticle.activate();
    }

    /**
     * Runs the activate method in the HorizontallyMovingPlatform Class
     */
    public void levelClear(){
        platform13.activate();
    }
}

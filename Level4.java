import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The 4th and final stage in the game.
 * 
 * @author  Marcus Jones Jr.
 * @version 1.0
 */
public class Level4 extends World
{
    PlayerHealth hp = new PlayerHealth();
    EnemyCounter maincounter = new EnemyCounter(5, true, 4);
    EnemyCounter counter1 = new EnemyCounter(5, false, 4);
    EnemyCounter counter2 = new EnemyCounter(5, false, 4);
    EnemyCounter counter3 = new EnemyCounter(5, false, 4);
    EnemyCounter counter4 = new EnemyCounter(5, false, 4);
    EnemyCounter counter5 = new EnemyCounter(5, false, 4);
    Player player = new Player(4);
    Reticle reticle = new Reticle();
    /**
     * Constructor for objects of class Level4.
     */
    public Level4()
    {    
        super(1000, 750, 1); 

        addObject(player, 52, 575);

        addObject(hp,58,25);
        addObject(maincounter, 876,15);
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
    VerticalMovingPlatform platform13 = new VerticalMovingPlatform(1);
    Reticle reticle = new Reticle();
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Level1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 750, 1); 
        
        QuizPlatform quiz = new QuizPlatform("What is 3 + 4?", "7");
        addObject(quiz, 231, 222);


        addObject(player, 52, 684);

        Terrain terrain1 = new Terrain();
        Terrain terrain2 = new Terrain();
        Terrain terrain3 = new Terrain();
        Terrain terrain4 = new Terrain();
        Terrain terrain5 = new Terrain();
        Terrain terrain6 = new Terrain();
        Terrain terrain7 = new Terrain();
        Terrain terrain8 = new Terrain();
        Terrain terrain9 = new Terrain();

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


        addObject(ladder1,348, 514);
        addObject(ladder2,198, 191);
        addObject(ladder3,198, 225);
        addObject(ladder4,348, 550);
        addObject(ladder5,198, 264);
        addObject(ladder6,198,300);          
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
        SmallPlatform platform13 = new SmallPlatform();
        
        addObject(splatform1, 943,623);
        addObject(splatform2, 278,179);
        addObject(splatform3, 152, 415);
        addObject(splatform4, 49, 415);
        addObject(splatform5,146,315);

        AlternateGroundEnemy enemy1 = new AlternateGroundEnemy();
        AlternateGroundEnemy enemy2 = new AlternateGroundEnemy();
        addObject(enemy1,905, 586);
        addObject(counter1,905, 586);
        addObject(enemy2,273, 141);
        addObject(counter2,273, 141);

        AirEnemy enemy3 = new AirEnemy();
        addObject(enemy3, 68, 379);
        addObject(counter3,15, 379);

        AlternateGroundEnemy enemy4 = new AlternateGroundEnemy();
        addObject(enemy4,607, 325);
        addObject(counter4,607, 325);

        GroundEnemyL1 enemy5 = new GroundEnemyL1();
        addObject(enemy5,685, 68);
        addObject(counter5,685, 68);

        addObject(reticle, getWidth()/2, getHeight()/2);

        Medkit medkit = new Medkit();
        addObject(medkit,903,282);

        Gun gun = new Gun(4);
        addObject(gun,947,674);

        HorizontallyMovingPlatform platform2 = new HorizontallyMovingPlatform(-2);
        addObject(platform2,905, 321); 

        Platform platform3 = new Platform();
        addObject(platform3,677, 105);

        Switch switch1 = new Switch();
        addObject(switch1,405, 303);

        Sign sign1 = new Sign();
        addObject(sign1,337, 302);
    }

    /**
     * Adds a small platform to the world at X 452, Y 148.
     */
    public void spawnPlatform(){
        SmallPlatform platform5 = new SmallPlatform();
        addObject(platform5, 452,148);
    }

    /**
     * Changes the current world to the WinScreen world
     */
    public void nextLevel(){
        WinScreen WinScreen= new WinScreen();
        Greenfoot.setWorld(WinScreen);
    }

    /**
     * Runs the lowerHp method in the Player Health object.

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
        GroundEnemy enemy1 = new GroundEnemy();
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
        addObject(clearLevel,619,302);
        Gun gun = new Gun(1);
        addObject(gun, 50, 683);

        addObject(reticle, getWidth()/2, getHeight()/2);
        AirEnemy enemy2 = new AirEnemy();
        addObject(enemy2,697, 501);
        addObject(counter2,697, 501);
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
     * Changes to current world to the Death world
     */
    public void dead(){
        Death death = new Death(1);
        Greenfoot.setWorld(death);
    }

    /**
     * Runs the restoreHp method in the Player Health object.
=======
     * Runs the restoreHp method in the Player Health Class.
     */
    public void restoreHp(){
        hp.restoreHp();
    }

    /**
     * Runs the activate method in the Reticle object
     */
    public void activateReticle(){
        reticle.activate();
    }

    /**
     * Runs the lowerEnemyCount method in the EnemyCounter object
     */
    public void lowerEnemyCount(){
        maincounter.lowerEnemyCount();
    }

    /**
     * Spawns a goal object and an arrow object.
     */
    public void levelClear(){
        Goal goal = new Goal();
        addObject(goal, 57, 127);
        Arrow arrow = new Arrow();
        addObject(arrow,57,68);
        AirEnemy aenemy2 = new AirEnemy();
        addObject(aenemy2,473,340);
    }
}

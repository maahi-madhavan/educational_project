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

        Terrain terrain1 = new Terrain();
        Terrain terrain2 = new Terrain();
        Terrain terrain3 = new Terrain();
        Terrain terrain4 = new Terrain();
        Terrain terrain5 = new Terrain();
        Terrain terrain6 = new Terrain();
        Terrain terrain7 = new Terrain();
        Terrain terrain8 = new Terrain();
        Terrain terrain9 = new Terrain();
        addObject(terrain1, 125, 760);
        addObject(terrain2, 375, 760);
        addObject(terrain3, 625, 760);
        addObject(terrain4, 875, 760);
        addObject(terrain5, 120, 702);
        addObject(terrain6,497,541);
        addObject(terrain7, 576, 498);
        addObject(terrain8, 635, 453);
        addObject(terrain9, 693, 402);

        Ladder ladder1 = new Ladder();
        Ladder ladder2 = new Ladder();
        Ladder ladder3 = new Ladder();
        Ladder ladder4 = new Ladder();
        Ladder ladder5 = new Ladder();
        Ladder ladder6 = new Ladder();
        addObject(ladder1,348, 514);
        addObject(ladder2,198, 191);
        addObject(ladder3,198, 225);
        addObject(ladder4,348, 550);
        addObject(ladder5,198, 264);
        addObject(ladder6,198,300);

        SmallPlatform splatform1 = new SmallPlatform();
        SmallPlatform splatform2 = new SmallPlatform();
        SmallPlatform splatform3 = new SmallPlatform();
        SmallPlatform splatform4 = new SmallPlatform();
        SmallPlatform splatform5 = new SmallPlatform();
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
     */
    public void lowerHp(){
        hp.lowerHp();
    }

    /**
     * Changes to current world to the Death world
     */
    public void dead(){
        Death death = new Death(4);
        Greenfoot.setWorld(death);
    }

    /**
     * Runs the restoreHp method in the Player Health object.
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

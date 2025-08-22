import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The 2nd stage in the game.
 * 
 * @author Marcus Jones Jr. 
 * @version 1.0
 */
public class Level2 extends World
{
    Player player = new Player(2);
    PlayerHealth hp = new PlayerHealth();
    EnemyCounter maincounter = new EnemyCounter(2, true, 2);
    EnemyCounter counter1 = new EnemyCounter(2, false, 2);
    EnemyCounter counter2 = new EnemyCounter(2, false, 2);
    VerticalMovingPlatform platform13 = new VerticalMovingPlatform(1);
    HorizontallyMovingPlatform hplatform1 = new HorizontallyMovingPlatform(-2);
    HorizontallyMovingPlatform hplatform2 = new HorizontallyMovingPlatform(2);
    HorizontallyMovingPlatform hplatform3 = new HorizontallyMovingPlatform(2);

    Reticle reticle = new Reticle();
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Level2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 750, 1); 

        addObject(player, 52, 684);
        addObject(hp,58,25);
        addObject(maincounter, 876,15);

        Terrain terrain1 = new Terrain();
        Terrain terrain2 = new Terrain();
        Terrain terrain3 = new Terrain();
        Terrain terrain4 = new Terrain();
        addObject(terrain1, 125, 760);
        addObject(terrain2, 375, 760);
        addObject(terrain3, 625, 760);
        addObject(terrain4, 875, 760);

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
        Ladder ladder11 = new Ladder();
        Ladder ladder12 = new Ladder();
        Ladder ladder13 = new Ladder();
        Ladder ladder14 = new Ladder();
        addObject(ladder1, 984, 439);
        addObject(ladder2, 984, 479);
        addObject(ladder3, 124, 567);
        addObject(ladder4, 124, 607);
        addObject(ladder5, 124, 647);
        addObject(ladder6, 124, 687);
        addObject(ladder7, 634, 240);
        addObject(ladder8, 634, 280);
        addObject(ladder9, 634, 320);
        addObject(ladder10, 863, 247);
        addObject(ladder11, 863, 287);
        addObject(ladder12, 863, 327);
        addObject(ladder13, 863, 367);
        addObject(ladder14, 124, 527);

        SmallPlatform platform1 = new SmallPlatform();
        SmallPlatform platform2 = new SmallPlatform();
        SmallPlatform platform3 = new SmallPlatform();
        SmallPlatform platform4 = new SmallPlatform();
        SmallPlatform platform5 = new SmallPlatform();
        SmallPlatform platform6 = new SmallPlatform();
        SmallPlatform platform7 = new SmallPlatform();
        addObject(platform1, 209, 535);
        addObject(platform2, 484,527);
        addObject(platform3, 845,376);
        addObject(platform4, 632,350);
        addObject(platform5, 942,220);
        addObject(platform6, 556,220);
        addObject(platform7, 215,86);

        Spring spring1 = new Spring();
        Spring spring2 = new Spring();
        Spring spring3 = new Spring();
        addObject(spring1, 310, 682);
        addObject(spring2, 675, 682);
        addObject(spring3, 867, 683);

        Spikes spike1 = new Spikes();
        Spikes spike2 = new Spikes();
        Spikes spike3 = new Spikes();
        Spikes spike4 = new Spikes();
        Spikes spike5 = new Spikes();
        Spikes spike6 = new Spikes();
        addObject(spike1, 228, 689);
        addObject(spike2, 394, 689);
        addObject(spike3, 490, 689);
        addObject(spike4, 588, 689);
        addObject(spike5, 767, 689);
        addObject(spike6, 950, 689);

        Medkit medkit1 = new Medkit();
        addObject(medkit1, 664, 320);

        GroundEnemy genemy1 = new GroundEnemy(); 
        addObject(genemy1, 991,184);
        addObject(counter1, 991, 184);

        AlternateGroundEnemy agenemy1 = new AlternateGroundEnemy();
        addObject(agenemy1,576,185);
        addObject(counter2, 576,185);

        Goal goal = new Goal();
        addObject(goal, 217, 38);

        Gun gun = new Gun(2);
        addObject(gun, 605, 325);

        Wall wall = new Wall();
        addObject(wall, 163, 623);

        addObject(reticle, getWidth()/2, getHeight()/2);
    }

    /**
     * Changes the current world to the English level.
     */
    public void nextLevel(){
        Englishlevel EngLevel = new Englishlevel();
        Greenfoot.setWorld(EngLevel);
    }

    /**
     * Runs the lowerHp method in the Player Health Class.
     */
    public void lowerHp(){
        hp.lowerHp();
    }

    /**
     * Changes the current world to the Death world.
     */
    public void dead(){
        Death death = new Death(2);
        Greenfoot.setWorld(death);
    }

    /**
     * Runs the restoreHp method in the Player Health Class.
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
     * Runs the activate method in the Reticle Class.
     */
    public void activateReticle(){
        reticle.activate();
    }

    /**
     * Adds a Spring object to the world at X 366, Y 326
     */
    public void levelClear(){
        Spring spring4 = new Spring();
        addObject(spring4, 366, 326);
    }
}

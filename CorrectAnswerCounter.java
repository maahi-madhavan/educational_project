import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A class that keeps track of how many enemies are in a given level.
 * 
 * @author Marcus Jones Jr. 
 * @version 1.0
 */
public class CorrectAnswerCounter extends Actor
{
    private static int enemyNumber;
    private int level;
    private boolean mainCounter;
    private boolean levelCleared;
    /**
     * This is the constructor for the enemy counter class.
     */
    public CorrectAnswerCounter(int enemyNumber, boolean mainCounter,int level){
        this.enemyNumber = enemyNumber;
        this.mainCounter = mainCounter;
        this.level = level;
        if(mainCounter){
            setImage(new GreenfootImage("Enemies Remaining: " + enemyNumber, 30, Color.WHITE, Color.BLACK));
        }
    }

    /**
     * Act - do whatever the CorrectAnswerCounter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setMainCounterImage();
        followEnemy();
        enemiesEliminated();
    
    }
    /**
     * Changes the image of the main counter to display the current number of
     * enemies remaining in the level.
     */
    public void setMainCounterImage(){
        if(mainCounter){
            setImage(new GreenfootImage("Enemies Remaining: "+ enemyNumber, 30, Color.WHITE, Color.BLACK));
        }
    }
    /**
     * This method will lower the number of enemys on the main enemy counter 
     * by one when a non main enemycounter is no longer following an enemy.
     */
    public void lowerEnemyCount(){
            enemyNumber--;
            setLocation(5,5);
    }
    /**
     * This method allows the non main counters to follow the enemies they 
     * are attached to.
     */
    public void followEnemy(){
        Actor enemy = getOneObjectAtOffset(0, 0,(correct_answer.class));
        if(enemy != null && !mainCounter){
            setLocation(enemy.getX(),enemy.getY());
        }
        if(enemy == null && !mainCounter){
            lowerEnemyCount();
        }
    }
    /**
     * This method will run the level clear method once after all enemies have
     * been eliminated.
     */
    public void enemiesEliminated(){
        if(enemyNumber == 0 && !levelCleared){
            levelClear();
            levelCleared = true;            
        }
    }
    /**
     * This method will make something happen in the world when enemys are killed
     */
    public void levelClear(){
        if(level == 1){
            Level1 myLevel1 = (Level1)getWorld();
            myLevel1.levelClear();
        }
        if(level == 2){
            Level2 myLevel2 = (Level2)getWorld();
            myLevel2.levelClear();
        }
        if(level == 3){
            Level3 myLevel3 = (Level3)getWorld();
            myLevel3.levelClear();
        }
        if(level == 4){
            Level4 myLevel4 = (Level4)getWorld();
            myLevel4.levelClear();
        }
    }
}

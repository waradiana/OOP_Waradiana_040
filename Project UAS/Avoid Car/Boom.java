import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boom extends Actor
{
    /**
     * Act - do whatever the Boom wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        boom();
    }
    private int boomTimer=0;
    private void boom(){
        if(boomTimer==60){
            getWorld().removeObject(this);
        } else {
            boomTimer++;
        }
    }
}
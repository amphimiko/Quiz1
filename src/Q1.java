
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pintm1551
 */
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        becker.robots.City city = new becker.robots.City();
        Robot bot = new Robot(city, 4, 0, Direction.EAST);
        new Wall(city, 4, 2, Direction.NORTH);
        new Wall(city, 4, 2, Direction.WEST);
        new Wall(city, 3, 3, Direction.NORTH);
        new Wall(city, 3, 3, Direction.WEST);
        new Wall(city, 2, 4, Direction.NORTH);
        new Wall(city, 2, 4, Direction.WEST);
        new Wall(city, 2, 5, Direction.NORTH);
        new Wall(city, 2, 5, Direction.EAST);
        new Wall(city, 3, 6, Direction.NORTH);
        new Wall(city, 3, 6, Direction.EAST);
        new Wall(city, 4, 7, Direction.NORTH);
        new Wall(city, 4, 7, Direction.EAST);
        new Thing(city, 4, 1);
        new Thing(city, 3, 2);
        new Thing(city, 2, 3);
        new Thing(city, 1, 4);
        bot.move();         //move forward, pick thing and go up a level
        bot.pickThing();
        bot.turnLeft();
        bot.move();
        bot.turnLeft();
        bot.turnLeft();
        bot.turnLeft();
        
        bot.move();         //move forward, pick thing and go up a level
        bot.pickThing();
        bot.turnLeft();
        bot.move();
        bot.turnLeft();
        bot.turnLeft();
        bot.turnLeft();
        
        bot.move();         //move forward, pick thing and go up a level
        bot.pickThing();
        bot.turnLeft();
        bot.move();
        bot.turnLeft();
        bot.turnLeft();
        bot.turnLeft();
        
        bot.move();         //pick last thing
        bot.pickThing();
    
        bot.move();         //drop first thing
        bot.putThing();
        
        bot.move();         //move forward drop thing and go down a level
        bot.turnLeft();
        bot.turnLeft();
        bot.turnLeft();
        bot.move();
        bot.putThing();
        bot.turnLeft();
        
        bot.move();         //move forward drop thing and go down a level
        bot.turnLeft();
        bot.turnLeft();
        bot.turnLeft();
        bot.move();
        bot.putThing();
        bot.turnLeft();
        
        bot.move();         //move forward drop thing and go down a level
        bot.turnLeft();
        bot.turnLeft();
        bot.turnLeft();
        bot.move();
        bot.putThing();
        bot.turnLeft();
        
        bot.move();         //moving into final position
    }
}

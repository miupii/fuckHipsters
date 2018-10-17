package game.Player;

import game.DinamicArray;
import game.Grid.Grid;
import game.Grid.GridPosition;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

/**
 * Created by codecadet on 16/10/2018.
 */
public class Player implements KeyboardHandler {

    /**
     * Properties
     */

    private GridPosition position;
    private GridPosition currentPosition;
    private Grid grid;
    private Keyboard keyboard;
    private int speed = 7;
    private Shuri shuri;


    /**
     * Constructor
     */

    public Player() {
        position = new GridPosition(4, 20, "Ninja1.png");
        keyboard = new Keyboard(this);


        KeyboardEvent upPressed = new KeyboardEvent();
        upPressed.setKey(KeyboardEvent.KEY_UP);
        upPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(upPressed);

        KeyboardEvent upReleased = new KeyboardEvent();
        upReleased.setKey(KeyboardEvent.KEY_UP);
        upReleased.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);
        keyboard.addEventListener(upReleased);

        KeyboardEvent downPressed = new KeyboardEvent();
        downPressed.setKey(KeyboardEvent.KEY_DOWN);
        downPressed.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(downPressed);

        KeyboardEvent downReleased = new KeyboardEvent();
        downReleased.setKey(KeyboardEvent.KEY_DOWN);
        downReleased.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);
        keyboard.addEventListener(downReleased);

        KeyboardEvent space = new KeyboardEvent();
        space.setKey(KeyboardEvent.KEY_SPACE);
        space.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(space);
    }


    /**
     * Keyboard
     */
    //public Shuriken shuriken;
    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {


        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_UP:
                System.out.println("up");
                position.moveUp(speed);
                break;
            case KeyboardEvent.KEY_DOWN:
                System.out.println("down");
                position.moveDown(speed);
                break;
            case KeyboardEvent.KEY_SPACE:
                System.out.println(this.getPosition());
                Shuri shuri = new Shuri(this.position);
                //shuri.moveShuri();
                System.out.println("Shuriken");
                break;
            default:
                System.out.println("WALA-DUB-LUB!");
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_UP:
                break;
            case KeyboardEvent.KEY_DOWN:
                break;
            default:
                System.out.println("WALA-DUB-LUB!");
        }
    }

    /**
     * Methods
     */


    public void draw() {
        position.draw();
    }

    /** Getters */

    /**
     * Setters
     */

    public void setGrid(Grid grid) {
        this.grid = grid;
    }
    //public void setShuri(Shuri shuri){
    //  this.shuri = shuri;
    //}

    public GridPosition getPosition() {
        return this.position;
    }

    /**
     * Nested Class
     */

    private class Shuri {

        private GridPosition posi;
        private int speedShu ;

        public Shuri(GridPosition position) {
            posi = new GridPosition(16, position.getXShuri(), "shuriken4.png");  //muito cacada mas funciona
            System.out.println("X: " + posi.getX() + " Y: " + posi.getY());
            posi.draw();
            speedShu = 1;
            moveShuri();
        }

        public Shuri shoot(GridPosition position) {
            return new Shuri(position);
        }




        public void moveShuri() {

            while (posi.getY() != 60) {
                posi.moveRight(speedShu);
                posi.draw();
                System.out.println("moving shuriken" + posi);
            }

            System.out.println("final");
        }

    }
}



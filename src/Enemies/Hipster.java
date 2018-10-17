package Enemies;

import game.Grid.Grid;
import game.Grid.GridPosition;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Created by codecadet on 16/10/2018.
 */
public class Hipster {

    /** Properties */

    private Grid grid;
    private GridPosition position;
    private int speed;
    private Picture picture;

    /** Constructor */

    public Hipster(int x, int y){
        speed = 5;
        position = new GridPosition(x, y, "Ninja5.png");
    }

    /** Methods */

    public void move(){
        position.moveLeft(speed);
    }

    public void draw(){
        position.draw();
    }

    /** Getters */


    /** Setters */

    public void setGrid(Grid grid){
        this.grid = grid;
    }
}

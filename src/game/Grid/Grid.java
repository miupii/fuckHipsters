package game.Grid;

import org.academiadecodigo.simplegraphics.graphics.*;
import org.academiadecodigo.simplegraphics.pictures.Picture;


/**
 * Created by codecadet on 16/10/2018.
 */
public class Grid {

    /** Properties */

    public static final int PADDING = 10;
    public static final int CELLSIZE = 10;
    private int cols;
    private int rows;
    private int height;
    private int widht;
    private int x;
    private int y;
    private Picture picture;


    /** Constructor */

    public Grid(int cols , int rows , int x , int y){

        this.cols = cols;
        this.rows = rows;
        this.x = x;
        this.y = y;

    }

    /** Methods */

    public void init(){
        Rectangle grid = new Rectangle(PADDING, PADDING, getWidth(), getHeigth());
        Picture picture = new Picture(PADDING, PADDING, "Background.png");
        grid.setColor(Color.BLACK);
        picture.draw();
        //grid.draw();
    }

    /** Getters */

    private int getWidth(){
        return cols * CELLSIZE + PADDING;
    }
    private  int getHeigth(){
        return rows * CELLSIZE + PADDING;
    }
}

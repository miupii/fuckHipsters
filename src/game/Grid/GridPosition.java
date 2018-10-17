package game.Grid;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Created by codecadet on 16/10/2018.
 */
public class GridPosition {

    /** Properties */

    private int x;
    private int y;
    private Color color;
    private Rectangle rectangle;
    private Picture picture;

    /** Constructor */


    public GridPosition(int x, int y, String picture1){
        this.x = x;
        this.y = y;
        picture = new Picture(x * Grid.CELLSIZE, y * Grid.CELLSIZE, picture1);
        rectangle = new Rectangle(x * Grid.CELLSIZE,y * Grid.CELLSIZE,20,20);

    }

    /** Move Methods */


    public void moveUp(int speed){
        this.x -= speed;
        picture.translate(0, -speed);
        rectangle.translate(0,-speed);
        System.out.println(rectangle.getY());
    }

    public void moveDown(int speed) {
        this.x += speed;
        picture.translate(0, speed);
        rectangle.translate(0,speed);
        System.out.println(rectangle.getY());
    }

    public void moveLeft(int speed){
        this.y -= speed;
        picture.translate(-speed, 0);
        rectangle.translate(-speed, 0);
    }

    public void moveRight(int speed){
        this.y += speed;
        picture.translate(speed, 0);
        rectangle.translate(speed,0);
        System.out.println("Shooting right");
    }

    /** Color */

    public void setColor(Color color){
        this.color = color;
    }
    public void draw(){

        picture.draw();
        rectangle.fill();
    }

    /** Getters */

    public int getX(){
        return this.x;
    }

    public int getXShuri(){
        return this.x / Grid.CELLSIZE + 27;
    }
    public int getY(){
        return this.y;
    }




    @Override
    public String toString() {
        return "GridPosition{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

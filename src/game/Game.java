package game;

import Enemies.EnemyFactory;
import Enemies.Hipster;
import game.Grid.Grid;
import game.Player.Player;


/**
 * Created by codecadet on 16/10/2018.
 */
public class Game {

    /** Properties */

    private Grid grid;
    private Player player;
    private Hipster[] hipsters;
    private static int ENEMIES = 10;

    /** Constructor */

    public Game(int cols, int rows){

        grid = new Grid(cols, rows, Grid.PADDING, Grid.PADDING);
        player = new Player();

    }

    public void init(){

        grid.init();

        player.setGrid(grid);
        player.draw();
        System.out.println(player.getPosition());

        hipsters = new Hipster[20];
            int spacing = 1;
        for (int i = 0; i < hipsters.length ; i++) {
            hipsters[i] = EnemyFactory.getHipster(i * 2);//(i + spacing);
            hipsters[i].setGrid(grid);
            hipsters[i].draw();
            System.out.println("suposedly making hipsters");
            spacing += 1;
            System.out.println(spacing);
        }


    }

    public void start() throws InterruptedException{

        while (true){

            Thread.sleep(200);
            moveAllHipsters(hipsters);

        }
    }

    private void moveAllHipsters(Hipster[] hipsters) {
        for (int i = 0; i < hipsters.length; i++) {
            hipsters[i].move();
        }
    }


}

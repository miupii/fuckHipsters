package game;

/**
 * Created by codecadet on 16/10/2018.
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {

        Game game = new Game(90,40);

        game.init();
        game.start();
    }
}

package homeworks.java.seabattle;

import homeworks.java.seabattle.battle.Game;

public class Main {

    public static void main(String[] args) {
        Game game = new Game();

        while (!game.isGameOver()) {
            game.process();
        }
    }

}
package sea_battle.main;

import sea_battle.controllers.BotPlayer;
import sea_battle.controllers.HumanPlayer;
import sea_battle.controllers.Player;
import sea_battle.utils.FieldOperations;
import sea_battle.utils.Points;
import sea_battle.utils.Reader;
import sea_battle.utils.ShipSetter;

public class Game {

    private FieldOperations operations;
    private ShipSetter setter;
    private Player turnOrder;
    private Player opponent;
    private Reader reader;

    public Game(FieldOperations operations,ShipSetter setter, Reader reader) {
        this.operations = operations;
        this.setter = setter;
        this.reader = reader;
    }

    public void run() {
        System.out.println("<<<<<<<<<<<<<<<<SEA BATTLE>>>>>>>>>>>>>>>>");
        System.out.println("Let`s start!");

        checkPlayersQty();
        setter.setShips(turnOrder);
        setter.setShips(opponent);
        game();
    }

    private void checkPlayersQty() {
        System.out.println("One player or two players?(type: 1 or 2)");

        String userInput = reader.read();
        int playersQty;

        if (tryParse(userInput)) {
            playersQty = Integer.parseInt(userInput);
            setPlayers(playersQty);
        } else{
            System.out.println("Wrong entry! Try again!");
            checkPlayersQty();
        }
    }

    private void setPlayers(int playersQty) {
        turnOrder = new HumanPlayer(reader,"Player One");

        if (playersQty == 1) {
            opponent = new BotPlayer("Bot");
        } else if(playersQty == 2) {
            opponent = new HumanPlayer(reader,"Player Two");
        } else {
            checkPlayersQty();
        }
    }

    private void game() {

        while (true) {
            System.out.println(opponent.getTitle() + " field");
            operations.printField(turnOrder.getOpponentField());

            System.out.print(turnOrder.getTitle() + " turn: ");

            if (!(turnOrder.shot(opponent))) {
                Player temp = turnOrder;
                turnOrder = opponent;
                opponent = temp;
            } else {
                if (turnOrder.isWin()) {
                    System.out.println("<<< " + turnOrder.getTitle() + " win! >>>");
                    reader.close();
                    break;
                }
            }
        }
    }

    private boolean tryParse(String s) {
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }
}
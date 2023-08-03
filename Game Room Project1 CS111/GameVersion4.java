//Alex Ryse

public class GameVersion4 {

    public static void main(String args[]) {

        // designate how many rooms are in the game
        final int NUM_ROOMS = 7;

        // declare array of rooms
        Room[] gameBoard = new Room[NUM_ROOMS];

        // populate the room array, using the superclass Room
        gameBoard[0] = new Room("First Room", "1 apple;pumpkin", 0, "e1;w2");
        gameBoard[1] = new Room("Blue Room", "3 grapes;barking Germany Shephard", 1, "w0;e2");
        gameBoard[2] = new Room("Green Room", "meowing kitten;", 2, "w1;e3");
        gameBoard[3] = new Room("Red Room", "rock;paper;scissor", 3, "n1;w4");
        gameBoard[4] = new Room("Bath Room", "toilet paper;plunger;soap", 4, "n0;e5");
        gameBoard[5] = new Room("Treasure Room", "golden ticket;double 02;eggsalent hat", 5, "w1;s6");
        gameBoard[6] = new SleepRoom();

        // keep track of which room player is in 
        int playerRoomNumber = 0;

        // instance of CustomPlayer
        CustomPlayer customPlayer = new CustomPlayer("Alex", playerRoomNumber, "water bottle;backpack;pencil", 22.0);

        // play the game, as long as player object has field continuePlay set to true
        while (customPlayer.getContinuePlay() == true) {
            playerRoomNumber =
                    gameBoard[playerRoomNumber].playRoom(customPlayer);
        }
    }
}
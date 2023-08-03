// Alex Ryse
import java.util.Scanner;

public class SleepRoom extends Room
{  
   // constructor
   public SleepRoom()
   {
      super("Sleep Room", "pillow", 6, "e1;w5");
   }
   
   // playRoom method
   public int playRoom(CustomPlayer customPlayer)
   {
      // inform the player of his/her current room
      System.out.println("You are in the " + getRoomName());
      System.out.println("There is a bed in the corner of the room.");
      System.out.println("What would you like to do?");

      // variables for player interaction
      String command;
      int newRoomNum = getRoomNum();
      Scanner keyboard = new Scanner(System.in);
      command = keyboard.nextLine();

      // switch on the user's command
      switch (command) 
      {
         case "exits":
             printListOfExits();
             break;
         case "look":
             printObjectsInRoom();
             break;
         case "sleep":
             sleepOnStraw(customPlayer);
             break;    
         case "inventory":
             customPlayer.printInventory();
             break;
         case "go west":
         case "go east":
         case "go south":
         case "go north":
             newRoomNum = leaveRoom(command);
             break;
         case "quit":
             customPlayer.setContinuePlay(false);
             break;
         case "pick up":
             userPicksUp(customPlayer);
             break;
         case "drop":
             userDrops(customPlayer);
             break;
         case "help":
             Utilities.printHelp();
             break;
         default:
             System.out.println("Invalid command. Type help for details.");
     }   
     return newRoomNum;
   }
   
   // sleepOnStraw method
   protected void sleepOnStraw(CustomPlayer customPlayer)
   {
      customPlayer.addToVitalityPoints(10.0);
      customPlayer.printVitalityPoints();
   }
}
// Alex Ryse

import java.util.StringTokenizer;

public class CustomPlayer extends Player 
{
   // field
   private double vitalityPoints;

   // constructor
   public CustomPlayer(String name, int room, String inventory, double vitPoints) 
   {
      super(name, room, inventory);
      this.vitalityPoints = vitPoints;
   }
   
   // addToVitalityPoints method
   protected void addToVitalityPoints(double pointsToAdd)
   {
      vitalityPoints += pointsToAdd;
   }
   
   // printVitalityPoints method
   protected void printVitalityPoints()
   {
      System.out.println("You awake after 3 hours, and then...");
      System.out.println("You have " + vitalityPoints + " vitality points");
   }
   
   // printInventory method in CustomPlayer overrides printInventory in Player
   public void printInventory() 
   {
      StringTokenizer strT = new StringTokenizer(getInventory(), ";");
      System.out.println(getName() + "'s items: ");
      int numItems = 0;
      while (strT.hasMoreTokens()) 
      {
         System.out.println("  " + strT.nextToken());
         numItems++;
      }
      System.out.println("  A total of " + numItems + " item(s)");
      System.out.println("Vitality:\n" + " " + vitalityPoints + " points");
    }

}
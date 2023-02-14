//Max Hite
/*On my honor as a student I have not given nor recieved any unauthorized assitance on this assignment*/

import java.util.*;

public class SlotMachine
{
   
   private int cost = 0;
   private int multiplier = 0;
   
   private SlotReel sr1;
   private SlotReel sr2;
   private SlotReel sr3;
   
   public SlotMachine(int s)
   {
      cost = s;
      multiplier = cost/5;
      sr1 = new SlotReel();
      sr2 = new SlotReel();
      sr3 = new SlotReel();
   }
   public void pull()
   {
      sr1.spinVal();
      sr2.spinVal();
      sr3.spinVal();
   }
   
   public int getCost()
   {
      return cost;
   }
   
   private boolean hit3()
   {
      if (sr1.equals(sr2) && sr2.equals(sr3) && sr1.equals(sr3))
      {
         if (!sr1.toString().equals("horseshoe") && !sr1.toString().equals("star"))
         {
            if (!sr2.toString().equals("horseshoe") && !sr2.toString().equals("star"))
            {
               if (!sr3.toString().equals("horseshoe") && !sr3.toString().equals("star"))
               {
                  return true;
               }
            }
         }
      }
      return false;
   }
   
   private boolean hit2()
   {
      if (!sr1.toString().equals("horseshoe") && !sr1.toString().equals("horseshoe"))
      {
         return true;
      }
      return false;
   }
   
   public int calculate()
   {
      if (sr1.toString().equals("spade") && sr2.toString().equals("spade") && sr3.toString().equals("spade"))
      {
         return multiplier * 20;
      }
      if (sr1.toString().equals("diamond") && sr2.toString().equals("diamond") && sr3.toString().equals("diamond"))
      {
         return multiplier * 30;
      }
      if (sr1.toString().equals("heart") && sr2.toString().equals("heart") && sr3.toString().equals("heart"))
      {
         return multiplier * 40;
      }
      if (sr1.toString().equals("Liberty Bell") && sr2.toString().equals("Liberty Bell") && sr3.toString().equals("Liberty Bell"))
      {
         return multiplier * 50;
      }
      if (sr1.toString().equals("horseshoe") && sr2.toString().equals("horseshoe") && sr3.toString().equals("star"))
      {
         return multiplier * 10;
      }
      if (sr1.toString().equals("horseshoe") && sr2.toString().equals("horseshoe"))
      {
         return multiplier * 5;
      }
      else
      {
         return 0;
      }
   }
   
   public String toString()
   {
      return "Cost: " + cost + "\nYOUR SPIN: \n" + sr1.toString() + "           " + sr2.toString() + "         " + sr3.toString();
   }
      
}

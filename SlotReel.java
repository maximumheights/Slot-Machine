//Max Hite
/*On my honor as a student I have not given nor recieved any unauthorized assitance on this assignment*/

import java.util.*;

public class SlotReel
{

   private int value = 0;
   
   public void spinVal()
   {
      value = (int)(Math.random() * (6-1+1) + 1);
   }
   
   public boolean equals(SlotReel sr)
   {
      return this.equals(sr);
   }
   
   public String toString()
   {
      if(value == 1)
      {
         return "diamond";
      } 
      if(value == 2)
      {
         return "heart";
      } 
      if(value == 3)
      {
         return "spade";
      } 
      if(value == 4)
      {
         return "horseshoe";
      } 
      if(value == 5)
      {
         return "star";
      } 
      else
      {
         return "Liberty Bell";
      } 
   }
   
}

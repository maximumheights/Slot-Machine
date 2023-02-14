//Max Hite
/*On my honor as a student I have not given nor recieved any unauthorized assitance on this assignment*/

import java.util.*;

public class Player
{
   
   private String name;
   private int money;
   
   public  Player(String n)
   {
      name = n;
      money = 100;
   }
   
   public String getName()
   {
      return name;
   }
   
   public int getMoney()
   {
      return money;
   }
   
   public void  setMoney(int m)
   {
      money = m;
   }
   
   public String toString()
   {
      return name + " has " + money + " coins remaining.";
   }
   
}

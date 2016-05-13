public class CandyMachine
{
   public static void sellProduct(Dispenser d, CashRegister c, int insert)
   {
      assert insert >= d.getCost(): "Not enough money";
      c.acceptAmount(insert);
      System.out.println("Collect your Item at the bottom");
   }
   public static void main(String args []) 
   {
      Dispenser d = new Dispenser();
      CashRegister c = new CashRegister();
      sellProduct(d, c, 50);
   }
}
public class Dispenser
{
   public int numberOfItems;
   double cost;
   public Dispenser()
   {
      numberOfItems = 50;
      cost = 50;
   }
   public Dispenser(int num, double price)
   {
      assert num != 0:"No items";
      assert price != 0:"Free items?";
      numberOfItems = num;
      cost = price;
   }
   public void makeSale()
   {
      assert numberOfItems != 0: "No items left" ;
      numberOfItems--;
   }
   public double getCost()
   {
      return cost;
   }
}
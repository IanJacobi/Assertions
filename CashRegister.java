public class CashRegister
{
   public int cashOnHand;
   public CashRegister()
   {
      cashOnHand = 500;
   }
   public CashRegister(int cash)
   {
      cashOnHand = cash;
   }
   public void acceptAmount(int a)
   {
      cashOnHand = cashOnHand + a;
   }
}
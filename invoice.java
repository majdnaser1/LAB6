package week2;

public class invoice extends customer {

  public customer s =new customer();
   public double amount;


   public invoice(int id, double amount) {
       this.amount=amount;
      this.id=id;
      this.amount=amount;

   }

    public invoice(int id, String name, int discount) {
        super(id, name, discount);
    }

    public customer getS() {
      return s;
   }

   public double getAmount() {
      return amount;
   }

   public void setS(customer s) {
      this.s = s;
   }

   public void setAmount(double amount) {
      this.amount = amount;
   }
   public int getcustomerid(){
      return id;
   }
   public String getcustomername(){
      return getName();
   }
   public int getcustomerdiscount(){
      return  getDiscount();

   }

   @Override
   public String toString() {
      return "invoice{" +
              "id=" + id +
              ", s=" + s +
              ", amount=" + amount +
              '}';
   }
}

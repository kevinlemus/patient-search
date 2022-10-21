import java.util.*;

class Main {

  public static void main(String[] args) {

    ArrayList<Bill> var1= new ArrayList<Bill>();
    Patient John = new Patient("John", var1);
    John.setIllness("severe cold");
    System.out.println(John.toString());
    
    Bill var2 = new Bill(99.95, "June 15 2021");
    John.addBill(var2);
    John.printBills();
	}
    
}
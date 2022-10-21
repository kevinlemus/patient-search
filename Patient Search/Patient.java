
import java.util.*;

class Patient{
  
  private String name;
  private String illness;
  private ArrayList<Bill> bills;

 public Patient (String name, ArrayList<Bill> bills){
  this.name = name;
  this.bills = bills;
 }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getIllness() {
    return illness;
  }
  public void setIllness(String illness){
    this.illness = illness;
  }

  public void addBill(Bill bill){
    bills.add(bill);
  }

  @Override
  public String toString() {
    return "[Patient's name = " + name + ", Patient's illness = " + illness + "]";
  }

  double total;
  
public void printBills(){
  
  for(Bill i : bills){
    total += i.getAmount();
    this.total = total;
  System.out.println(i.toString());  
  }
  System.out.println(total);
  }
  }

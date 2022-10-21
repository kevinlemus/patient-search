class Bill {

  private double amount;
  private String date;

  public Bill(double amount, String date) {
    this.amount = amount;
    this.date = date;
  }
	
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
  }

  @Override
  public String toString() {
    return "Billing date: " + this.date + ". Bill amount: " + this.amount;
  }
  
}
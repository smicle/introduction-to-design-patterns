class Television extends Product {
  private int tvSerialNumber;
  private String date;

  public void numberring() {
    tvSerialNumber = Counter.getTvNumber();
  }

  public void setDate(String date) {
    this.date = date;
  }

  public void print() {
    System.out.println("Information about this TV");
    System.out.println("Serial number: " + tvSerialNumber);
    System.out.println("Made date: " + date);
    System.out.println("");
  }
}

class Radio extends Product {
  private int radioSerialNumber;
  private String date;

  public void numberring() {
    radioSerialNumber = Counter.getRadioNumber();
  }

  public void setDate(String date) {
    this.date = date;
  }

  public void print() {
    System.out.println("Information about this radio");
    System.out.println("Serial number: " + radioSerialNumber);
    System.out.println("Made date: " + date);
    System.out.println("");
  }
}

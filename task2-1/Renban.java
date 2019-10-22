class Renban {
  private static Renban instance = new Renban();
  private static String number;

  private Renban() {
    this.number = "0000";
  }

  public static Renban getInstance() {
    return instance;
  }

  public static String getNumber() {
    return number = String.format("%04d", Integer.parseInt(number) + 1);
  }
}

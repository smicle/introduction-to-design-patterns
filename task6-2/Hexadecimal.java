class Hexadecimal implements Observer {
  public void update(Subject s) {
    var n = (Numeric)s;
    print(n.getValue());
  }

  private void print(int n) {
    System.out.printf("%2dの16進数は%7sです。\n", n, Integer.toHexString(n));
  }
}

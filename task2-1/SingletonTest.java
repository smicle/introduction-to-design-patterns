public class SingletonTest {
  public static void main(String[] args) {
    var renban1 = Renban.getInstance();
    var renban2 = Renban.getInstance();

    System.out.println("renban1");
    System.out.println(renban1.getNumber());
    System.out.println(renban1.getNumber());

    System.out.println("renban2");
    System.out.println(renban2.getNumber());
    System.out.println(renban2.getNumber());
  }
}

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

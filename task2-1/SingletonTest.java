import java.util.stream.*;

public class SingletonTest {
  public static void main(String[] args) {
    var renban1 = Renban.getInstance();
    var renban2 = Renban.getInstance();

    System.out.println("renban1");
    IntStream.range(0, 5)
      .forEach(v -> System.out.println(renban1.getNumber()));
    System.out.println("renban2");
    IntStream.range(0, 5)
      .forEach(v -> System.out.println(renban2.getNumber()));
  }
}

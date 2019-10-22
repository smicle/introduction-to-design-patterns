import java.util.stream.*;

public class Client {
  public static void main(String[] args) {
    var s = new Numeric();
    s.attach(new Binary());
    s.attach(new Hexadecimal());
    Stream.iterate(0, i -> i < 100, i -> i + (int)(Math.random() * 30) - 10)
    .forEach(i -> s.putValue(i));
  }
}

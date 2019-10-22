import java.util.*;

public class Client {
  public static void main(String[] args) {
    var stadium1 = new TvStadium();
    var stadium2 = new RadioStadium();
    Arrays.<Product>asList(
      stadium1.create(),
      stadium2.create(),
      stadium1.create()
    ).forEach(v -> v.print());
  }
}

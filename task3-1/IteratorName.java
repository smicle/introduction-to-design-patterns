import java.util.*;

public class IteratorName {
  public static void main(String[] args) {
    var aggr = new PeopleListAggregate();
    var iter = aggr.createIterator();
    Arrays.<People>asList(
      new People("島村卯月", 159, 45),
      new People("渋谷凛", 165, 44),
      new People("本田未央", 161, 46)
    ).forEach(aggr::add);

    extractionPeopleName(iter)
      .forEach(System.out::println);
  }

  private static List<String> extractionPeopleName(Iterator iter) {
    var list = new ArrayList<String>();
    for (iter.first(); !iter.isDone(); iter.next()) {
      list.add(
        ((People)iter.getItem()).getName()
      );
    }
    return list;
  }
}

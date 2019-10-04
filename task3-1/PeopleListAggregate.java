import java.util.*;

interface Aggregate {
  public Iterator createIterator();
}

class PeopleListAggregate implements Aggregate {
  private List<People> list = new ArrayList<>();

  @Override
  public Iterator createIterator() {
    return new PeopleListIterator(this);
  }

  public void add(People p) {
    list.add(p);
  }

  public Object get(int n) {
    return list.get(n);
  }

  public int size() {
    return list.size();
  }
}

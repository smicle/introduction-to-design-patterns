interface Iterator {
  public void first();
  public void next();
  public boolean isDone();
  public Object getItem();
}

class PeopleListIterator implements Iterator {
  private PeopleListAggregate aggr;
  private int cur;

  public PeopleListIterator(PeopleListAggregate aggr) {
    this.aggr = aggr;
  }

  @Override
  public void first() {
    cur = 0;
  }

  @Override
  public void next() {
    cur++;
  }

  @Override
  public boolean isDone() {
    return cur >= aggr.size() ? true : false;
  }

  @Override
  public Object getItem() {
    return aggr.get(cur);
  }
}

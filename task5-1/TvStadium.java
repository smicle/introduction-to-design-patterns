class TvStadium extends Stadium {
  public Product factoryMethod() {
    return new Television();
  }

  public void registration(Product s) {
    var t = (Television)s;
    t.numberring();
    t.setDate(Date.today());
  }
}

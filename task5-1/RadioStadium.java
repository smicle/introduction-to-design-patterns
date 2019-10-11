class RadioStadium extends Stadium {
  public Product factoryMethod() {
    return new Radio();
  }

  public void registration(Product s) {
    var r = (Radio)s;
    r.numberring();
    r.setDate(Date.today());
  }
}

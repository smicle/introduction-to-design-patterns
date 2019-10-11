abstract class Stadium {
  public final Product create() {
    var p = factoryMethod();
    registration(p);
    return p;
  }

  public abstract Product factoryMethod();

  public abstract void registration(Product s);
}

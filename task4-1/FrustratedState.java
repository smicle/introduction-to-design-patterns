class FrustratedState extends DogState {
  private static FrustratedState s = new FrustratedState();

  private FrustratedState() {
  }

  public static DogState getInstance() {
    return s;
  }

  public void tired(Dog d) {
    d.changeState(SickState.getInstance());
  }

  public void ate(Dog d) {
    d.changeState(PleasantState.getInstance());
  }

  public String toString() {
    return "いらいら状態";
  }
}

class UsuallyState extends DogState {
  private static UsuallyState s = new UsuallyState();

  private UsuallyState() {
  }

  public static DogState getInstance() {
    return s;
  }

  public void tired(Dog d) {
    d.changeState(FrustratedState.getInstance());
  }

  public void ate(Dog d) {
    d.changeState(PleasantState.getInstance());
  }

  public String toString() {
    return "普通の状態";
  }
}

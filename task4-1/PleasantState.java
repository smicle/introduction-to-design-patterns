class PleasantState extends DogState {
  private static PleasantState s = new PleasantState();

  private PleasantState() {
  }

  public static DogState getInstance() {
    return s;
  }

  public void tired(Dog d) {
    d.changeState(UsuallyState.getInstance());
  }

  public void ate(Dog d) {
  }

  public String toString() {
    return "楽しい状態";
  }
}

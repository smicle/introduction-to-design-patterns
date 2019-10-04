class SickState extends DogState {
  private static SickState s = new SickState();

  private SickState() {
  }

  public static DogState getInstance() {
    return s;
  }

  public void tired(Dog d) {
  }

  public void ate(Dog d) {
    d.changeState(UsuallyState.getInstance());
  }

  public String toString() {
    return "病気状態";
  }
}

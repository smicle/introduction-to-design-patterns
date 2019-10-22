class Dog {
  private DogState myState;

  public Dog() {
    myState = UsuallyState.getInstance();
  }

  public void labor() {
    myState.tired(this);
  }

  public void meal() {
    myState.ate(this);
  }

  public void changeState(DogState d) {
    myState = d;
  }

  public void print() {
    System.out.println("現在、わたしは「" + myState.toString() + "」です。");
  }
}

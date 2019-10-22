class Numeric extends Subject {
  int state, value;

  public int getState() {
    return state;
  }

  public void putValue(int v) {
    if (v > this.value) {
      this.value = v;
      this.notice();
    }
  }

  public int getValue() {
    return value;
  }
}

import java.util.Calendar;

class Date {
  public static String today() {
    var cl = Calendar.getInstance();
    var year  = cl.get(Calendar.YEAR);
    var month = cl.get(Calendar.MONTH);
    var date  = cl.get(Calendar.DATE);

    return year + "/" +  month + "/" + date;
  }
}

class Counter {
  private static int tvNum = 100;
  private static int radioNum = 76;

  public static int getTvNumber() {
    return tvNum++;
  }

  public static int getRadioNumber() {
    return radioNum++;
  }
}

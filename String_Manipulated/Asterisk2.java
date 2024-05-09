public class Asterisk2 extends Asterisk {

  public static void main(String[] args) {
    String str = "NAJLA";
    int n = str.length();

    System.out.println("String length: " + str.length());
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (i == j || (i - j) == n + 1) {
          System.out.print(str.charAt(i));
        } else {
          System.out.print("*");
        }
      }
      System.out.println();
    }
  }
}
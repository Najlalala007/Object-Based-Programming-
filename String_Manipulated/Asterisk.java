public class Asterisk {

  public static void main(String[] args) {
    String str = "NAJLA";

    System.out.println("String length: " + str.length());
    for (int i = str.length() + 0; i >= 0; i--) { 
      for (int j = 0; j < str.length(); j++) {
        if (j <= i) {
          System.out.print(str.charAt(j));
        } else {
          System.out.print("*");
        }
      }
      System.out.println();
    }
  }
}
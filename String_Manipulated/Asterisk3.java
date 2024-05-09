public class Asterisk3 extends Asterisk {

    public static void main(String[] args) {
        String str = "NAJLA";
        int n = str.length();
        
    System.out.println("String length: " + str.length());
    for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        if (j == 2 && i < 2) {
            System.out.print(str.charAt(i) + " ");
        } else if (i == 2) {
            System.out.print(str.charAt(j) + " ");
        } else if (j == 2 && i > 2) {
            System.out.print(str.charAt(i) + " ");
        } else {
            System.out.print("*");
        }
      }
      System.out.println();
    }
  }
}
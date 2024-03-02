class Main {
    public static void main(String[] args) {
        sequenceA();
        sequenceB();
        sequenceC();
        sequenceD();
        sequenceE();
    }

    static void sequenceA() {
        System.out.println("Sequence A:");
        for (int i = 1; i <= 11; i += 2) {
            System.out.print(i);
            if (i < 11) {
                System.out.print(" ");
            }
        }
        System.out.println("\n");
    }

    static void sequenceB() {
        System.out.println("Sequence B:");
        int num = 25;
        for (int i = 0; i < 5; i++) {
            System.out.print(num);
            num -= 5;
            if (i < 4) {
                System.out.print(" ");
            }
        }
        System.out.println("\n");
    }

    static void sequenceC() {
        System.out.println("Sequence C:");
        int num = -4;
        for (int i = 0; i < 5; i++) {
            System.out.print(num);
            num += 3;
            if (i < 4) {
                System.out.print(" ");
            }
        }
        System.out.println("\n");
    }

    static void sequenceD() {
        System.out.println("Sequence D:");
        int a = 0, b = 1;
        for (int i = 0; i < 6; i++) {
            System.out.print(a);
            int sum = a + b;
            a = b;
            b = sum;
            if (i < 5) {
                System.out.print(" ");
            }
        }
        System.out.println("\n");
    }

    static void sequenceE() {
        System.out.println("Sequence E:");
        int a = 0, b = 1;
        for (int i = 0; i < 7; i++) {
            System.out.print(a);
            int sum = a + b + i;
            a = b;
            b = sum;
            if (i < 6) {
                System.out.print(" ");
            }
        }
        System.out.println("\n");
    }
}

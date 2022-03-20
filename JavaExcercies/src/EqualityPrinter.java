public class EqualityPrinter {
    public static void main(String[] args) {
        printEqual(1,2,1);
        printEqual2(2,2,2);
    }
    public static void printEqual (int a, int b, int c) {
        if (a < 0 || b < 0 || c < 0) {
            System.out.println("Invalid Value");
        }
        if (a == b) {
            if (b == c){
                System.out.println("All numbers are equal");
            } else {
                System.out.println("Neither all are equal or different");
            }
        } else if (b == c) {
            System.out.println("Neither all are equal or different");
        } else if ( a == c ) {
            System.out.println("Neither all are equal or different");
        } else {
            System.out.println("All numbers are different");
        }
    }
    public static void printEqual2(int a, int b, int c) {
        if (a < 0 || b < 0 || c < 0) {
            System.out.println("Invalid Value");
            return;
        }

        if (a == b && b == c) {
            System.out.print("All numbers are equal");
            return;
        }

        if(a == b || a == c || b == c) {
            System.out.println("Neither all are equal or different");
            return;
        }

        System.out.print("All numbers are different");
    }
}


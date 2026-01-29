
public class Pattern {

    //? static is a key word which loads at the time of loding of class
    //?  static rhing binds with class not with object

    static void p1() {
        int n=5;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (col <= row) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    static void p2() {
        int n = 5;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                if (col <= n - row - 1) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    

    public static void main(String[] args) {
        p1();
        System.out.println();
        p2();
        System.out.println();
       
    }
}

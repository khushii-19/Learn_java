package patterns;

public class main {
    public static void main(String[] args) {
        pattern1(5);
    }
    static void pattern1(int n) {
        for (int i = 1; i <=n; i++) {
            for (int j = 1;j <=i; j++) {
                System.out.println("*");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int i = 1; i <=n; i++) {
            for (int j = 1;j <=n; j++) {
                System.out.println("*");
            }
            System.out.println();
        }
    }

}

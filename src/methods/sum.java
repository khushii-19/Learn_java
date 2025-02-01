package methods;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
    int ans = sum3(20,30);
    System.out.println(ans);
    }

    static int sum2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: "  );
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        return sum;
    }


    static void sum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: "  );
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);
    }

    static int sum3(int a, int b){
        int sum = a + b;
        return sum;
    }
}
//return_type name of function(arguments) {
//body
//return statement

//pass the value of numbers when u r calling the method in main()



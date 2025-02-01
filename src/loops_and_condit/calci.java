package loops_and_condit;

import java.util.Scanner;

    public class calci{
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
//        break loop if user enter X or x
            int ans = 0;
            while (true) {
                System.out.println("Enter the operator");
                char op = sc.next().trim().charAt(0);
                if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                    System.out.println("Enter the 2 numbers");
                    int num1 = sc.nextInt();
                    int num2 = sc.nextInt();
                    if (op == '+') {
                        ans = num1 + num2;
                    }
                    if (op == '-') {
                        ans = num1 - num2;
                    }
                    if (op == '*') {
                        ans = num1 * num2;
                    }
                    if (op == '/') {
                        ans = num1 / num2;
                    }
                    if (op == '%') {
                        ans = num1 % num2;
                    }
                } else if (op == 'X' || op == 'x') {
                    break;
                } else {
                    System.out.println("Invalid operator");
                }
                System.out.println(ans);
            }
        }
    }



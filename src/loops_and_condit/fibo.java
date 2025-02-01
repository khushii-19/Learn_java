package loops_and_condit;

import java.util.Scanner;

public class fibo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 1;
        int count = 2;
        while(count<=n){
            int c=b;
            b=a+b;
            a=c;
            count++;
        }
        System.out.println(b);
    }
}

package loops_and_condit;

import java.util.Scanner;

public class countoccurence {
    public static void main(String[] args) {
        System.out.println("Enter a number which have repeated characters");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter number which is getting repeated");
        Scanner sc1 = new Scanner(System.in);
        int s = sc.nextInt();
        int count=0;

        while(n>0){
            int rem = n%10;
            if(rem==s){
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
    }
}

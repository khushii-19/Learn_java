package loops_and_condit;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        System.out.println("Enter a number to reverse");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s=0;
        while(n>0){
            int r = n%10;
            s=s*10+r;
            n=n/10;
        }
        System.out.println(s);
    }
}

package loops_and_condit;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        /*
        Syntax of for loop ( use when how many times a loop will run)
        for (initialization,condition,increment/decrement)
         */
        /*
        print numbers from 1 to 100
         */
//        for(int i=1;i<=100;i++){
//            System.out.println(i);
//        }
        System.out.println("Enter number");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(i + "");
            System.out.println("Hello");
        }
        /* syntax of while loop (use when don't know how many times a loop will run)
        while(condition){
        body
        }
         */

        int num=1;
        while(num<=n){
            System.out.println(num);
            num++;
        }

        /*
        Syntax of do while loop
        do{
        body
        }while (condition);
         */

        int no=1;
        do{
            System.out.println("Hello");
        } while (no != 1);
    }
}

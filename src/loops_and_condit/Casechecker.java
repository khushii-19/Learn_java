package loops_and_condit;

import java.util.Scanner;

public class Casechecker {
    public static void main(String[] args) {
        System.out.println("Enter a string");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().trim().charAt(0);  //charAt(0) only checking 0th index lower and uppercase
        System.out.println(ch);
        if(ch>='a' && ch<='z'){
            System.out.println("Lowercase");
        }
        else if(ch>='A' && ch<='Z'){
            System.out.println("Uppercase");
        }
        else{
            System.out.println("Invalid input");
        }
    }
}

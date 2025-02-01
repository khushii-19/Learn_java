package loops_and_condit;

import java.util.Scanner;
public class Conditions {
    public static void main(String[] args) {
        //syntax of if statements
//        if(boolean expression){
//            body
//        }else{
//        body}
//        int salary = 1000;
//        if(salary>1000){
//            salary=salary+2000;
//        }
//        else{
//            salary=salary+2000;
//        }
//        System.out.println(salary);

//        Multiple if else
        System.out.println("Enter Salary");
        Scanner input = new Scanner(System.in);
        int salary = input.nextInt();
        if(salary >= 1000) {
            salary += 2000;
        } else if (salary > 2000) {
            salary += 2000;
        }else{
            salary -= 1000;
        }
        System.out.println(salary);
    }
}
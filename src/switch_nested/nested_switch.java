package nested_switch;

import java.util.Scanner;

//nested switch is switch inside a switch
public class nested_switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int emp_id = in.nextInt();
        String dept = in.next();

        switch (emp_id) {
            case 1 -> System.out.println("Khushi");
            case 2 -> System.out.println("Atharv");
            case 3 -> {
                System.out.println("avni");
                switch (dept) {
                    case "AI" -> System.out.println("AI department");
                    case "IT" -> System.out.println("IT department ");
                    default -> System.out.println("Unknown department");
                }
            }
            default -> System.out.println("Unknown employee id");
        }
    }
}

package methods;

import java.util.Scanner;

public class Stringexample {

    public static void main (String[] args) {
//    String message = greet();
//        System.out.println(message);


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        String personalised = myGreet(name);
        System.out.println(personalised);

    }
    static String myGreet(String name) {
        String message = "Hello " + name + "!";
        return message;
    }




    static String greet() {
        String greeting = "how are you";
        return greeting;
    }
}

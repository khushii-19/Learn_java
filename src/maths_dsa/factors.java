package maths_dsa;

import java.util.ArrayList;

public class factors {
    public static void main(String[] args) {
        int n = 20;
        factors2(n);
    }
//    static int factors1(int n) {
//        //but this code is very repetitive as its checking each number
//        for (int i = 1; i <= n; i++) {
//            if (n % i == 0) {
//                System.out.println(i + " ");;
//            }
//        }
//        return n;
//    }

    static void factors2(int n) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=1; i<=Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    System.out.println(i + " ");
                } else {
                    System.out.println(i + " ");
                    list.add(n/i);
                }
            }
        }
        for(int i = list.size()-1; i>=0; i--) {
            System.out.println(list.get(i));
        }
    }
}

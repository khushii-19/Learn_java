package Bitwise_operators;

public class digit_no_in_base {
    public static void main(String[] args) {
        int n = 10;
        int b = 2;
        int ans = (int)(Math.log(n)/Math.log(b)+1);
        System.out.println(ans);
    }
}

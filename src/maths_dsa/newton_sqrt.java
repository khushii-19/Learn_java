package maths_dsa;

public class newton_sqrt {
    public static void main(String[] args) {
    int n = 40;
        System.out.println(sqrt(n));
    }
    static double sqrt(double n){
        double x =n;
        double root;
        while(true){
//            using newton sqrt formula
            root = 0.5*(x+(n/x));
//            checking error less difference in the root and assumed number more precised answer
            if(Math.abs(root-x)<0.1){
                break;
            }
            x=root;
        }
    return root;}

}

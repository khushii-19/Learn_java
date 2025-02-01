public class main {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//
//        //swap code
//        int temp = a;
//        a = b;
//        b = temp;
//        System.out.println("a:"+  a + " " + "b:"+ b);


        String name = "Iron Man";
        changeName(name);
        System.out.println(name);
//        will not change value because it is pass by value and function is creating new object rahul not changing it

    }
    static void changeName(String naam){
        naam = "Rahul";
    }



    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
//        will not swap

}


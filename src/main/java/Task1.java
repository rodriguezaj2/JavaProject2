public class Task1 {
    public static void main(String[] args) {

        String a="This will be b";
        String b="This will be a";

        a=a+b;
        b=a.substring(0,a.length()-b.length());
        a=a.substring(b.length());


        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}

//Write a program to swap 2 String without a temporary variable?
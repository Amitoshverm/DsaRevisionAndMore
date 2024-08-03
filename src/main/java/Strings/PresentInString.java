package Strings;


public class PresentInString {
    static int length = 2;
    static int breadth = 5;
    static int area;
    static {
        System.out.println("invoked static block");

        area = length * breadth;

    }
    public static void main(String[] args) {
        System.out.println("this is main method");
        System.out.println("area of length is "+ area);
    }


}

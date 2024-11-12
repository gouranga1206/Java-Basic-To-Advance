package Operators.ShiftOpr;

public class test {
    //Shift Operators
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("a<<2: " + (a << 2)); // 10<<2 = 40
        System.out.println("a>>2: " + (a >> 2)); // 10>>2 = 2
        System.out.println("a>>>2: " + (a >>> 2)); // 10>>>2 = 2
        System.out.println("b<<2: " + (b << 2)); // 20<<2 = 80
        System.out.println("b>>2: " + (b >> 2)); // 20>>2 = 5
        System.out.println("b>>>2: " + (b >>> 2)); // 20>>>2 = 5
    }
}

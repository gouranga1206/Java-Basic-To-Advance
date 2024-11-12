package Operators.LogicalOpr;

public class test {
    public static void main(String[] args) {
        //Logical Operators
        boolean a = true;
        boolean b = false;
        System.out.println("a&&b: " + (a && b)); // true && false = false
        System.out.println("a||b: " + (a || b)); // true || false = true
        System.out.println("!a: " + (!a));       // !true = false
        System.out.println("!b: " + (!b));       // !false = true
    }
}

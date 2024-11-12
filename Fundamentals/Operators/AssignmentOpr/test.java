package Operators.AssignmentOpr;

public class test {
    public static void main(String[] args) {
        // Assignment Operator
        int a = 10;
        int b = 20;

        System.out.println("a+=b: " + (a += b));        // a = a+b = 10+20 = 30
        System.out.println("a-=b: " + (a -= b));        // a = a-b = 30-20 = 10
        System.out.println("a*=b: " + (a *= b));        // a = a*b = 10*20 = 200
        System.out.println("a/=b: " + (a /= b));        // a = a/b = 200/20 = 10
        System.out.println("a%=b: " + (a %= b));        // a = a%b = 10%20 = 10
        System.out.println("a&=b: " + (a &= b));        // a = a&b = 10&20 = 0
        System.out.println("a|=b: " + (a |= b));        // a = a|b = 0|20 = 20
        System.out.println("a^=b: " + (a ^= b));        // a = a^b = 20^20 = 0
        System.out.println("a>>=b: " + (a >>= b));      // a = a>>b = 0>>20 = 0
        System.out.println("a<<=b: " + (a <<= b));      // a = a<<b = 0<<20 = 0
        System.out.println("a>>>=b: " + (a >>>= b));    // a = a>>>b = 0>>>20 = 0
    }
}

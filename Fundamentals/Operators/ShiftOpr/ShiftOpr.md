# Shift Operators
- Shift operators are used to shift the bits of a number left or right.
- The shift operators are:
    - Left shift (<<)
    - Right shift (>>)

`<<` **(Val / 2^N)**

`>>` **(Val * 2^N)**

`>>>` **(Right shift with zero fill) in case of negative numbers, the leftmost bits are filled with 0s.**

```java 
public class ShiftOperators {
    public static void main(String[] args) {
        int a = 5; // 101
        int b = -10; // 11111111111111111111111111110110
        System.out.println("a << 2 = " + (a << 2)); // 10100 = 20
        System.out.println("b >> 2 = " + (b >> 2)); //
        System.out.println("b >>> 2 = " + (b >>> 2)); //
    }
}
```



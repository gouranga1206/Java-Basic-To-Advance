# Control Flow in Java
- [Control Flow](#control-flow)
  - [If-Else](#if-else)
  - [Switch](#switch)
  - [Loops](#loops)
    - [For Loop](#for-loop)
    - [While Loop](#while-loop)
    - [Do-While Loop](#do-while-loop)
  - [Break and Continue](#break-and-continue)
  - [Return](#return)
  - [Throw](#throw)
  - [Try-Catch](#try-catch)
  - [Finally](#finally)

## Control Flow
Control flow is the order in which the program's code executes. It is the sequence in which the program should be executed.

### If-Else
The `if-else` statement is used to execute a block of code if a condition is true. If the condition is false, another block of code can be executed.

```java
public class IfElse {
    public static void main(String[] args) {
        int number = 10;
        if (number > 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is not positive.");
        }
    }
}
```

### Switch
The `switch` statement is used to execute a block of code based on the value of a variable.

```java
public class Switch {
    public static void main(String[] args) {
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}
```

### Loops
Loops are used to execute a block of code multiple times.

#### For Loop
The `for` loop is used to execute a block of code a specified number of times.

```java
public class ForLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }
}
```

#### While Loop
The `while` loop is used to execute a block of code as long as a condition is true.

```java
public class WhileLoop {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
    }
}
```

#### Do-While Loop
The `do-while` loop is used to execute a block of code at least once, and then repeatedly execute it as long as a condition is true.

```java
public class DoWhileLoop {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 5);
    }
}
```

### Break and Continue
The `break` statement is used to exit a loop or switch statement, while the `continue` statement is used to skip the current iteration of a loop.

```java
public class BreakContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
        }

        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }
    }
}
```

### Return
The `return` statement is used to exit a method and return a value.

```java
public class Return {
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int sum = add(5, 3);
        System.out.println(sum);
    }
}
```

  

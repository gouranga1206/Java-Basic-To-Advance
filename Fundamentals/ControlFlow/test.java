package ControlFlow;

public class test {
public static void main(String[] args) {
    //Control Flow
    int a = 10;
    int b = 20;

    //if-else
    if (a > b) {
        System.out.println("a is greater than b");
    } else {
        System.out.println("b is greater than a");
    }

    //if-else-if
    if (a > b) {
        System.out.println("a is greater than b");
    } else if (a < b) {
        System.out.println("b is greater than a");
    } else {
        System.out.println("a is equal to b");
    }

    //nested if
    if (a > b) {
        if (a > 15) {
            System.out.println("a is greater than b and greater than 15");
        } else {
            System.out.println("a is greater than b but not greater than 15");
        }
    } else {
        System.out.println("b is greater than a");
    }

    //switch-case
    int day = 3;
    switch (day) {
        case 1:
            System.out.println("Sunday");
            break;
        case 2:
            System.out.println("Monday");
            break;
        case 3:
            System.out.println("Tuesday");
            break;
        case 4:
            System.out.println("Wednesday");
            break;
        case 5:
            System.out.println("Thursday");
            break;
        case 6:
            System.out.println("Friday");
            break;
        case 7:
            System.out.println("Saturday");
            break;
        default:
            System.out.println("Invalid day");
    }

    //while loop
    int i = 0;
    while (i < 5) {
        System.out.println(i);
        i++;
    }

    //do-while loop
    int j = 0;
    do {
        System.out.println(j);
        j++;
    } while (j < 5);

    //for loop
    for (int k = 0; k < 5; k++) {
        System.out.println(k);
    }

    //for-each loop
    int[] numbers = {10, 20, 30, 40, 50};
    for (int num : numbers) {
        System.out.println(num);
    }

    //break statement
    for (int l = 0; l < 5; l++) {
        if (l == 2) {
            break;
        }
        System.out.println(l);
    }

    //continue statement
    for (int m = 0; m < 5; m++) {
        if (m == 2) {
            continue;
        }
        System.out.println(m);
    }

    //return statement
    System.out.println(add(10, 20));
}

public static int add(int a, int b) {
    return a + b;
}
    
}
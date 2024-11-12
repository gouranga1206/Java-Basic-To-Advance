# Variable:

1.  Variable is a container which holds the value while the java program is executed.
2.  A variable is assigned with a data type.
3.  Variable is the name of memory location.
4.  There are three types of variables in java: local, instance and static.

# Local Variable:

1.  A variable declared inside the body of the method is called local variable.
2.  Only accessible within the method.
3.  Local variables are created when the method, constructor or block is entered
    and the variable will be destroyed once it exits the method, constructor or block.
4.  Access modifiers cannot be used for local variables.
5.  Local variables are implemented at stack level internally.

# Instance Variable:

1.  A variable declared inside the class but outside the body of the method, is called instance variable.
2.  It is not declared as static.
3.  It is called instance variable because its value is instance specific and is not shared among instances and stored in heap memory.
4.  Instance variable is created when an object is created with the use of the keyword 'new' and destroyed when the object is destroyed.
5.  Access modifiers can be given for instance variables.

# Static Variable:

1.  A variable which is declared as static is called static variable.
2.  It cannot be local.
3.  You can create a single copy of static variable and share among all the instances of the class.
4.  Memory allocation for static variable happens only once when the class is loaded in the memory.
5.  Static variables are stored in the static memory, mostly in the class/method area.
6.  Static variables are created at the start of program execution and destroyed automatically when execution ends.
7.  Access modifiers can be given for static variables.

# Syntax:
```
<access modifier> <static> <data type> <variable name> = <value>;
```

# Identifier: 
The name of variable is called identifier, which represents the memory location.

Rules for defining a variable:

1.  Variable name must start with either letter or underscore.
2.  A variable name cannot start with

    - number
    - special characters

3.  No white spaces are allowed in variable name.
4.  Variable name must not be a keyword.
5.  Variable name is case sensitive.

# Naming Convention:

1.  Variable name should start with lowercase letter.
2.  If variable name is combination of two words, the second word should start with uppercase letter.
3.  If variable name is combination of two words, the second word should start with uppercase letter.
4.  If variable name is combination of two words, the second word should start with uppercase letter.

# Data Types:

1. Data type specifies the size of the variable and the type of values that it can hold.
   There are two types of data types in Java: - Primitive data types - Reference/Object data types

# Primitive Data Types:

1. Primitive data types are predefined by the language and named by a keyword.
2. There are 8 primitive data types in Java:
   - byte
   - short
   - int
   - long
   - float
   - double
   - char
   - boolean

Example:

```java
public class PrimitiveDataTypes {
    public static void main(String[] args) {
        byte b = 10;
        short s = 100;
        int i = 1000;
        long l = 10000;
        float f = 10.5f;
        double d = 10.5;
        char c = 'A';
        boolean bool = true;
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);
        System.out.println(bool);
    }
}
```

# Reference Data Types:

1. Reference variables are created using defined constructors of the classes.
2. They are used to access objects.
3. These variables are declared to be of a specific type that cannot be changed.
4. For example, Employee, Student etc.

Using class, interface or array we can create reference data type.

Example:

```java
class Student {
    int id;
    String name;
}

public class ReferenceDataTypes {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 101;
        s1.name = "John";
        System.out.println(s1.id + " " + s1.name);
    }
}
```





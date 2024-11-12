## OOPS(Object Oriented Programming System)
- OOPS is a programming paradigm that uses "objects" to design applications and computer programs.
- It utilizes several techniques from previously established paradigms
- OOPS is a way to structure a program by bundling related properties and behaviors into individual objects.

**OOP is a methadalogy that simplify the software development & maintain by providing some rules**

### OOPS Concepts
- Class
- Object
- Inheritance
- Polymorphism
- Abstraction
- Encapsulation

In Java OOPS is implemented using classes and objects.

```java
class Student{
    int rollno;
    String name;
    void insertRecord(int r, String n){
        rollno=r;
        name=n;
    }
    void displayInformation(){
        System.out.println(rollno+" "+name);
    }
}
public class TestStudent{
    public static void main(String args[]){
        Student s1=new Student();
        Student s2=new Student();
        s1.insertRecord(111,"Karan");
        s2.insertRecord(222,"Aryan");
        s1.displayInformation();
        s2.displayInformation();
    }
}
```

In OOP the variables of class are called as `fields` which desribes **property** and the functions are called as `methods` which describes **behaviour**.

### Advantages of OOPS
- **Modularity**: The source code for a class can be written and maintained independently of the source code for other classes.
- **Information-hiding**: By interacting only with an object's methods, the details of its internal implementation remain hidden from the outside world.
- **Code re-use**: If a class already exists, you can use objects of that class in your program.
- **Pluggability and debugging ease**: If a particular object turns out to be problematic, you can simply remove it from your application and plug in a different object as its replacement.

### Disadvantages of OOPS
- **Complexity**: OOP is often complex to understand and implement.
- **Large size**: Object-oriented programs typically involve more lines of code than procedural programs.
- **Slow speed**: OOP is slower than procedural programming.

## Implementation Point of View
 - `Object Based Language`: The language that does not support Inheritance and RunTime Bondong is called Object Based Language. For example: JavaScript

- `Object Oriented Language`: The language that supports Inheritance and RunTime Bondong is called Object Oriented Language. For example: Java, C++, Python

- `True Object Oriented Language`: The language that supports all the features of OOPs (Inheritance, Polymorphism, Encapsulation, Abstraction) is called True Object Oriented Language. For example: Java, C++, Smalltalk

- `Pure Object Oriented Language`: The language that supports all the features of OOPs (Inheritance, Polymorphism, Encapsulation, Abstraction) + Primitive Data Types is called Pure Object Oriented Language. For example: Smalltalk, C#


## OOPS Principles
- **Encapsulation**: Encapsulation is the mechanism that binds together code and the data it manipulates, and keeps both safe from outside interference and misuse. One way to think about encapsulation is as a protective wrapper that prevents code and data from being arbitrarily accessed by other code defined outside the wrapper.

- **Abstraction**: Abstraction is a process where you show only “relevant” data and “hide” unnecessary details of an object from the user. Abstraction lets you focus on what the object does instead of how it does it.

- **Inheritance**: Inheritance is a mechanism wherein a new class is derived from an existing class. The derived class inherits features from the base class, adding new features to it. This is one of the most important concepts in object-oriented programming.

- **Polymorphism**: Polymorphism is the ability of a variable, function or object to take on multiple forms. In other words, polymorphism allows you to define one interface and have multiple implementations.

- **Association**: Association is a relationship where all objects have their own lifecycle and there is no owner. Let's take an example of Teacher and Student. Multiple students can associate with a single teacher and a single student can associate with multiple teachers, but there is no ownership between the objects and both have their own lifecycle. These relationships can be one to one, one to many, many to one and many to many.

- **Aggregation**: Aggregation is a specialized form of Association where all objects have their own lifecycle, but there is ownership. This represents a "whole-part or a-part-of" relationship. This is a more specific form of association.

- **Composition**: Composition is again a specialized form of Aggregation and we can call this as a "death" relationship. It is a strong type of Aggregation. Child objects do not have their lifecycle and if parent object is deleted, all child objects will also be deleted.



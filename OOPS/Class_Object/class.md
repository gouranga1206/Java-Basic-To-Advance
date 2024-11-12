# Class

- In Java Class ia just a representation which describes the properties and behaviour of an object.
- Class is a blueprint for the object.

Implementation:

```java
class Student{

    //fields
    int rollno; //instance variable(Heap memory)
    String name;

    //methods
    void insertRecord(int r, String n){ //here r and n are local variables.(Stack memory)
        rollno=r;
        name=n;
    }

    //constructor
    Student(){
        System.out.println("Constructor called");
    }

    //blocks
    static{ 
        System.out.println("Static block called");
    }

    {
        System.out.println("Instance block called");
    }

     //Inner class
    private class InnerClass{
        void display(){
            System.out.println("Inner class");
        }
    }

    //interface
    interface InnerInterface{
        void display();
    }
}
```

In the above example we understood that
The `Class` can have:

- fields
- methods
- constructors
- blocks
- classes and interfaces


# Object
- Object is an instance of a class.
- Object is a real world entity.
- Object is a runtime entity.


Implementation:

```java
public class TestStudent{
    public static void main(String args[]){
        Student s1=new Student();
        Student s2=new Student();
        s1.insertRecord(111,"Karan");
        s2.insertRecord(222,"Aryan");
    }
}
```
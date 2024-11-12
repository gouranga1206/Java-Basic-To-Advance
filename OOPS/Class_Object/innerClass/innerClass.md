# Inner Class in Java
- Inner class is a class that is defined inside another class.
- Inner class can access all the members of the outer class including private data members and methods.
- Inner class can be private, public, protected or default. 
- Inner class can be static, non-static, final or abstract.

```java
class OuterClass{
    private int data=30;
    class InnerClass{
        void msg(){System.out.println("data is "+data);}
    }
    public static void main(String args[]){
        OuterClass obj=new OuterClass();
        OuterClass.InnerClass in=obj.new InnerClass();
        in.msg();
    }
}
```


# Types of Inner Class
- Inner class can be of four types:
    - Member inner class
    - Static inner class
    - Local inner class
    - Anonymous inner class

- Member inner class
    - A class created within class and outside method
    - It is also known as a regular inner class.
    - It can access all members of the outer class including private data members and methods.
    - Syntax:
        ```java
        class OuterClass{
            class InnerClass{
                //code
            }
        }
        ```
- Static inner class
    - A class created within class and outside with static keyword.
    - It can access only static members of the outer class.
    - Syntax:
        ```java
        class OuterClass{
            static class InnerClass{
                //code
            }
        }
        ```
- Local inner class
    - A class created within method and outside.
    - It can access all members of the outer class including private data members and methods.
    - Syntax:
        ```java
        class OuterClass{
            void display(){
                class InnerClass{
                    //code
                }
            }
        }
        ```

- Anonymous inner class
    - A class created for implementing an interface or extending a class.
    - It is defined and instantiated in a single statement.
    - Syntax:
        ```java
        class OuterClass{
            void display(){
                new InnerClass(){
                    //code
                };
            }
        }
        ```
# Inner Class Example
```java
class OuterClass{
    private int data=30;
    class InnerClass{
        void msg(){System.out.println("data is "+data);}
    }
    public static void main(String args[]){
        OuterClass obj=new OuterClass();
        OuterClass.InnerClass in=obj.new InnerClass();
        in.msg();
    }
}
```

 Output
```
data is 30
```

# Static Inner Class Example
```java
class OuterClass{
    private static int data=30;
    static class InnerClass{
        void msg(){System.out.println("data is "+data);}
    }
    public static void main(String args[]){
        OuterClass.InnerClass in=new OuterClass.InnerClass();
        in.msg();
    }
}
```

 Output
```
data is 30
```

# Local Inner Class Example
```java
class OuterClass{
    void display(){
        class InnerClass{
            void msg(){System.out.println("data is 30");}
        }
        InnerClass in=new InnerClass();
        in.msg();
    }
    public static void main(String args[]){
        OuterClass obj=new OuterClass();
        obj.display();
    }
}
```
 Output
```
data is 30
```

# Anonymous Inner Class Example
```
class OuterClass{
    void display(){
        new InnerClass(){
            void msg(){System.out.println("data is 30");}
        }.msg();
    }
    public static void main(String args[]){
        OuterClass obj=new OuterClass();
        obj.display();
    }
}
```
 Output
```
data is 30
```


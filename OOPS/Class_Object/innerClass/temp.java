package OOPS.Class_Object.innerClass;

public class temp {

    //member inner class
    class innerClass{
        void display(){
            System.out.println("Member Inner Class");
        }
    }

    //static inner class
    static class StaticClass{
        void display(){
            System.out.println("Static Inner Class");
        }
    }

    //local inner class
    void print(){
        class LocalInnerClass{
            void display(){
                System.out.println("Local Inner Class");
            }
        }
        new LocalInnerClass().display();
    }

    abstract class AnonymousClass{
        abstract void print();
    }

    public static void main(String[] args) {
        temp t1 = new temp();
        
        t1.new innerClass().display();

        new StaticClass().display();

        t1.print();

        t1.new AnonymousClass() {
            void print(){
                System.out.println("Anonymous Inner Class");
            }
        }.print();


    }
    
}

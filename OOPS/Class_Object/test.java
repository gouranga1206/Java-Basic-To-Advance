package OOPS.Class_Object;

public class test{
    
    //fields
    int StdId;
    String StdName;
    String School = "ABC Public School";


    //block
    static{
        System.out.println("This is an example of Class and Object");
    }
    {
        System.out.println("Instance is created: "+ this);
    }

    //constructor
    test(int id, String name){
        StdId = id;
        StdName = name;
    }

    //method
    void print(){
        System.out.println("STDID: "+StdId);
        System.out.println("STDName: "+StdName);
        System.out.println("School: "+ School);
    }

    interface Info {
        void info();
    }
    //Inner Class
    private abstract class information implements Info{}

    public static void main(String[] args) {
        test student1 = new test(110, "Kasish" ); //OBJECT
        student1.print();
        student1.new information() {
            public void info(){
                System.out.println("This is an inner class");
            }
        }.info(); //Anonymous Inner Class with interface 

        new test(104,"Rahul").print(); //Anonymous Object
        
    }
}
package Variable;

public class test {
    int sum(int a, int b){
        return a+b;
    }

    int avg = 10; // instance variable, for each object a separate copy is created, that's why stored in heap memory
    static int count = 0; // static variable for all objects a single copy is created, that's why stored in class memory

    public static void main(String[] args) {
        int a = 20; // local variable for each method a separate copy is created, that's why stored in stack memory
        System.out.println(a);
        
        test obj = new test();
        System.out.println(obj.sum(10, 20));



    }
}


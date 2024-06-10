package myexample;

public class TestStatic {

    public static void main(String[] args) {
        
        StaticDemo demo1 = new StaticDemo();
        System.out.println(demo1);
        
        StaticDemo demo2 = new StaticDemo();
        System.out.println(demo2);
    
    
        System.out.println(StaticDemo.greeting);
    }

}

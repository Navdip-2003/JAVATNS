package polymorphismexample;

public class DerivedClass extends BaseClass {
    
    @Override
    public void greet(String message) {
        super.greet("I am the BaseClass");
        System.out.println("Hello, I am the DerivedClass " + message);
    }
}

package polymorphismexample;

public class Example {
    public static void main(String[] args) {

        BaseClass base = new DerivedClass();
        base.greet("Have a wonderful day!!!");

        // BaseClass base1 = new BaseClass();
        // base1.greet("Goodbye.....");
    }
}

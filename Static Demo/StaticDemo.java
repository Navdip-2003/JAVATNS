package myexample;

public class StaticDemo {
    static int totalCount = 0;
    int instanceNo = 0;
    static String greeting = "Welcome to Java Programming!!!";

    public StaticDemo() {
        totalCount++;
        instanceNo++;
    }

    @Override
    public String toString() {
        return "Static Total = " + totalCount + " Instance no = " + instanceNo;
    }
    
}

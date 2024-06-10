package employeeData;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferDemo {

    public static void main(String[] args) {
        try {
            int wage;
            String empName;
        
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
            System.out.println("Enter Employee Name:");
        
            empName = reader.readLine();
        
            System.out.println("Enter Wage:");
        
            wage = Integer.parseInt(reader.readLine());
        
            System.out.println("Employee Name: " + empName + ", Wage: " + wage);
        } catch (Exception e) {
            System.out.println("An error occurred");
        }
    }
}

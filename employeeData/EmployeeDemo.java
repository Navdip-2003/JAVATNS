package employeeData;

// import java.util.Scanner;
public class EmployeeDemo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        EmployeeDetails emp1 = new EmployeeDetails();
        emp1.setEmpName("Janvi");
        emp1.setJobTitle("Manager");
        emp1.setSalary(40000);
        
        System.out.println(emp1);
        
        EmployeeDetails emp2 = new EmployeeDetails("Jiya", "HR", 3456852);
        
        System.out.println(emp2);
    }
}

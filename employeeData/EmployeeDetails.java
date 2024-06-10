package employeeData;

public class EmployeeDetails {

    private String empName, jobTitle;
    private int salary;
    
    // Constructor with no parameters
    public EmployeeDetails() {
        empName = "defaultName";
        jobTitle = "defaultJob";
        salary = 0;
    }
    
    // Constructor with parameters
    public EmployeeDetails(String name, String title, int salary) {
        this.empName = name;
        this.jobTitle = title;
        this.salary = salary;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeeDetails [empName=" + empName + ", jobTitle=" + jobTitle + ", salary=" + salary + "]";
    }
}

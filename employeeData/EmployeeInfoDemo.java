package employeeData;

public class EmployeeInfoDemo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        PersonalInfo info1 = new PersonalInfo();

        info1.setFullName("Vidhi");
        info1.setEmail("vidhipatel12@gmail.com");
        info1.setAddress("Navrangpura");
        info1.setPhoneNumber(74890790);

        System.out.println(info1); // info1.toString()

        System.out.println(info1.getFullName() + " " + info1.getEmail() + " " + info1.getPhoneNumber());

        PersonalInfo info2 = new PersonalInfo();
        info2.setFullName("Apple");
        info2.setAddress("On the tree");

        System.out.println(info2); // info2.toString()
    }
}

package employeeData;

public class PersonalInfo {

    private String fullName, email, address; // default values
    private int phoneNumber;
    
    public PersonalInfo() {
        fullName = "defaultName";
        email = "defaultEmail";
        phoneNumber = 123;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "PersonalInfo [fullName=" + fullName + ", email=" + email + ", address=" + address + ", phoneNumber="
                + phoneNumber + "]";
    }
}

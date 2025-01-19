package Employee;

public class Employee {
    private String name;
    private int age;
    private String dob;
    private String gender;

    public Employee(String name, int age, String dob, String gender) {
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    // Method to add two
    public int add(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
    // Method to display employee information
    public void displayInfo() {
        System.out.println("Employee information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Date of birth: " + dob);
        System.out.println("Gender: " + gender);
    }
}

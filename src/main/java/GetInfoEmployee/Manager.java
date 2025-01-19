package GetInfoEmployee;
import Employee.Employee;

public class Manager extends Employee{
    public Manager(String name, int age, String dob, String gender) {
        super(name, age, dob, gender);
    }

    public void demonstrateMethods() {
        displayInfo();
        int a = 5, b = 3;
        System.out.println("Addition of " + a + " and " + b + ": " + add(a,b));
        System.out.println("Multiplication of " + a + " and " + b + ": " + multiply(a,b));
    }

    public static void main(String[] args) {
        Manager manager = new Manager("John Doe", 30, "01/15/1955", "male");
        manager.demonstrateMethods();
    }
}

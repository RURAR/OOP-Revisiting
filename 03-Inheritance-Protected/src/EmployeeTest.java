// Demonstrates Inheritance and protected access
class Person {
    protected String role = "Person";
}

class Employee extends Person {
    void showRole() {
        System.out.println("Role: " + role);
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.showRole();
    }
}

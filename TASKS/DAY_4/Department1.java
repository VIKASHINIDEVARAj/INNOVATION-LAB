
class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }
}

class Department {
    List<Employee> employees = new ArrayList<>();

    void addEmployee(Employee employee) {
        employees.add(employee);
    }
}

public class Department1{
    public static void main(String[] args) {
        Department dept = new Department();
        dept.addEmployee(new Employee("Alice"));
        dept.addEmployee(new Employee("Bob"));
    }
}


class Employee {
    private int id;
    private double salary;
    public Employee(int id, double salary)
    {
        this.id = id;
        this.salary = Math.max(salary, 30000.0);
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double newSalary) {
        if (newSalary >= 30000.0) {
            salary = newSalary;
        } else {
            System.out.println("Salary cannot be less than 30000.0");
        }
    }
}

public class Employee {
    public static void main(String[] args) {
        Employee emp = new Employee(101, 50000.0);
        System.out.println("Current Salary: " + emp.getSalary());

        emp.setSalary(25000.0);
        emp.setSalary(40000.0);

        System.out.println("Final Salary: " + emp.getSalary());
    }
}

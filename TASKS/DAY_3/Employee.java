<<<<<<< HEAD
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
=======
public class Employee {
    private int id;
    private double salary;
    private static final double MIN_SALARY = 30000.00; 
    public Employee(int id, double salary) {
        this.id = id;
        this.salary = (salary >= MIN_SALARY) ? salary : MIN_SALARY;
    }

    public void displayEmployee() {
        System.out.println("Employee ID: " + id + ", Salary: $" + salary);
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee(234, 54000.00);
        Employee emp2 = new Employee(567, 25450.00); 

        emp1.displayEmployee();
        emp2.displayEmployee();
    }
}
>>>>>>> d4b784a1a2afeb66c2a26fd79cea05049f33afe4

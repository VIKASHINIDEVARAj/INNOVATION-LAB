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

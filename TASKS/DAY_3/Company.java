<<<<<<< HEAD
public class Company {
    static String companyName = "ZOHO";
    String employeeName;
    public Company(String employeeName) {
        this.employeeName = employeeName;
    }

        public void displayDetails() {
        System.out.println("Company: " + companyName);
        System.out.println("Employee Name: " + employeeName);
    }

    public static void main(String[] args) {
        
        Company emp1 = new Company("VIKXX");
        Company emp2 = new Company("ADI");
        Company emp3 = new Company("YUVA");
        System.out.println("Before modifying companyName:");
        emp1.displayDetails();
        emp2.displayDetails();
        emp3.displayDetails();

        Company.companyName = "WIPRO";
        System.out.println("After modifying companyName:");
        emp1.displayDetails();
        emp2.displayDetails();
        emp3.displayDetails();
    }
}
=======
public class Company {
    static String companyName = "ZOHO";
    String employeeName;
    public Company(String employeeName) {
        this.employeeName = employeeName;
    }

        public void displayDetails() {
        System.out.println("Company: " + companyName);
        System.out.println("Employee Name: " + employeeName);
    }

    public static void main(String[] args) {
        
        Company emp1 = new Company("VIKXX");
        Company emp2 = new Company("ADI");
        Company emp3 = new Company("YUVA");
        System.out.println("Before modifying companyName:");
        emp1.displayDetails();
        emp2.displayDetails();
        emp3.displayDetails();

        Company.companyName = "WIPRO";
        System.out.println("After modifying companyName:");
        emp1.displayDetails();
        emp2.displayDetails();
        emp3.displayDetails();
    }
}
>>>>>>> d4b784a1a2afeb66c2a26fd79cea05049f33afe4

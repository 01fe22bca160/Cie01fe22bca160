class EmployeeDetails extends Person {
    private String empId;
    private double salary;

    public EmployeeDetails(String name, String dob, String empId, double salary) {
        super(name, dob);
        this.empId = empId;
        this.salary = salary;
    }

    public void displayEmployeeDetails() {
        displayName();
        displayAge();
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: " + salary);
    }
}

 class Main{
    public static void main(String[] args) {
        // Creating an instance of the EmployeeDetails class
        EmployeeDetails employee = new EmployeeDetails("John Doe", "1990-01-01", "EMP123", 50000);
        
        // Displaying employee details
        employee.displayEmployeeDetails();

        // Pushing the changes to a new branch "employee_details"
        // Once the functionalities of "Person" and "EmployeeDetails" class are executed successfully,
        // the new branch should be merged to the "main" branch.
        // This part cannot be automated within this script as it requires interactions with a version control system like Git.
    }
}

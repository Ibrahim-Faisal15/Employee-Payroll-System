

public class Main {
    public static void main(String[] args) {
        PayRoll payRollSystem = new PayRoll();


//        Employees Initialization
        FullTimeEmployee emp1 = new FullTimeEmployee(1,"Ron", 7000 );
        PartTimeEmployee emp2 = new PartTimeEmployee(2,"Zain", 20, 5);

        payRollSystem.addEmployee(emp1);
        payRollSystem.addEmployee(emp2);
        System.out.println("Initial Employee Details: ");
        payRollSystem.displayEmployee();

//        Removing Employee
        payRollSystem.removeEmployee(2);

        System.out.println("Remaining Employee Details");
        payRollSystem.displayEmployee();



    }
}

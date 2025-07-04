public class FullTimeEmployee extends Employee{

    private double monthlySalary;

    public FullTimeEmployee(int ID, String name, double monthlySalary) {
        super(ID, name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}

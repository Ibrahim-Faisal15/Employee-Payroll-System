public class PartTimeEmployee extends Employee{

    private int noOfHoursWorked;
    private int HourlyRate;


    public PartTimeEmployee(int ID, String name, int hourlyRate, int noOfHoursWorked) {
        super(ID, name);
        this.HourlyRate = hourlyRate;
        this.noOfHoursWorked = noOfHoursWorked;
    }

    @Override
    public double calculateSalary() {
        return (this.HourlyRate*this.noOfHoursWorked);
    }
}

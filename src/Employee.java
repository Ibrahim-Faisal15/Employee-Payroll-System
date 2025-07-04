public abstract class Employee {
    private String name;
    private int ID;

    public Employee(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public int getID(){
        return this.ID;
    }

    public abstract double calculateSalary();

    @Override
    public String toString() {
        return "Employee [name=" + name + ", id=" + ID + ", salary=" + calculateSalary() + "]";
    }
}

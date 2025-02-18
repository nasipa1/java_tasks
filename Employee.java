public abstract class Employee {
    String name;
    int id;
    int  baseSalary;

    public Employee(String name, int baseSalary, int id) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.id = id;
    }
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
        this.baseSalary = 0;
    }

    public abstract double calculateSalary();

    public void displayEmployeeInfo(){
        System.out.println("Name: " + name + "\nID:" + id + "\nBase salary: " + baseSalary);
    }
}

interface Payable{
    public double getPaymentAmount();
}

class FullTimeEmployee extends Employee implements Payable{
    double bonus = 1.2;
    boolean healthInsurance = true;
    public FullTimeEmployee(String name, int salary, int id) {
        super(name, salary, id);
    }

    public double calculateSalary(){
        return baseSalary*bonus;
    }
    public void displayEmployeeInfo(){
        super.displayEmployeeInfo();
    }

    public double getPaymentAmount(){
        return calculateSalary();
    }
}

class ContractEmployee extends Employee implements Payable{
    int hoursWorked;
    int hourlyRate;

    public ContractEmployee(String name,  int id, int hourlyRate, int hoursWorked) {
        super(name, id);
        this.baseSalary = 0;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double calculateSalary(){
        return hoursWorked*hourlyRate;
    }

    public void displayEmployeeInfo(){
        super.displayEmployeeInfo();
    }
    public double getPaymentAmount(){
        return calculateSalary();
    }
}

class EmployeeManager{
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new FullTimeEmployee("Salma", 10000, 100);
        employees[1] = new ContractEmployee("Atai", 100, 100, 12);
        for (Employee employee : employees) {
            if (employee != null) {
                employee.displayEmployeeInfo();
                System.out.println("Total Salary: " + employee.calculateSalary());
            }
        }
    }
}
public abstract class Employee implements Payable {
    // TODO fix class declaration and declare variables here here
     String employeeId;
     String name;
     double averageMonthlySalary;

    public Employee(String name, String employeeId) {
        // TODO fill in code here
        this.name = name;
        this.employeeId = employeeId;
    }

    public String getEmployeeId() {
        // TODO fill in code here and replace the return statement
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        // TODO fill in code here
        this.employeeId = employeeId;
    }

    public String getName() {
        // TODO fill in code here and replace the return statement
        return name;
    }

    public void setName(String name) {
        // TODO fill in code here
        this.name = name;
    }

    public double getAverageMonthlySalary() {
        // TODO fill in code here and replace the return statement
        return averageMonthlySalary;
    }

    @Override
    public String toString() {
        // TODO fill in code here and replace the return statement, be sure to format double value
        return name + " " + employeeId + " " + averageMonthlySalary;
    }
    // Отформатировать до 2х знаков после ,

}

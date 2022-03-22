import java.util.List;

public class Employee extends Person {
    private int employeeID;
    private String employeeRole;
    private long employeeSalary;
    private String employeeDepartment;
    private Device mobile;
    private List<Device> laptops;

    public Employee(int employeeID, String employeeRole, long employeeSalary, String employeeDepartment) {
        this.employeeID = employeeID;
        this.employeeRole = employeeRole;
        this.employeeSalary = employeeSalary;
        this.employeeDepartment = employeeDepartment;
    }
    protected void getInfo () {
        System.out.println(employeeID);
        System.out.println(employeeRole);
        System.out.println(employeeDepartment);
        System.out.println(employeeSalary);
        System.out.println(super.getSex());
    }
    protected void setEmployeeSalary(int newSalary) {
        this.employeeSalary = newSalary;
    }
}


package inheritance;

public class Employee {
    
    private String employeeName;
    private String employeeId;
    private double baseSalary;
    
    

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeIdString) {
        this.employeeId = employeeIdString;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    public double totalSalary(){
        return baseSalary;
    }    

    
    
}

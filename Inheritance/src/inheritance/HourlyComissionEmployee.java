
package inheritance;


public class HourlyComissionEmployee  extends commissionEmployee{
    
    private double  totalHour;
    private double hourlyRate;

    public double getTotalHour() {
        return totalHour;
    }

    public void setTotalHour(double totalHour) {
        this.totalHour = totalHour;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
    


    @Override
    public double totalSalary() {
        double comissionAmount=(getCommissionRate()*getTotalSellAmount())/100;   
        double totalHourlySalary=totalHour*hourlyRate;
        return comissionAmount+totalHourlySalary; //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public void setBaseSalary(double baseSalary) {
        System.err.println("you can't ");
    }
    
    
}

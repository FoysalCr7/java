
package inheritance;


public class commissionEmployee extends Employee{
    
    private double commissionRate;
    private double totalSellAmount;

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public double getTotalSellAmount() {
        return totalSellAmount;
    }

    public void setTotalSellAmount(double totalSellAmount) {
        this.totalSellAmount = totalSellAmount;
    }

    @Override
    public double totalSalary() {
        
        double comissionAmount=(commissionRate*totalSellAmount)/100;   
        //return super.totalSalary(); //To change body of generated methods, choose Tools | Templates.
        return getBaseSalary()+ comissionAmount;
    }
    
   
    
}

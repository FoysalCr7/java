/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author Mobile App Develop
 */
public class CommitionEmployee extends Employe {
    private double commitionRate;
    private double totalSellAmount;

    public double getTotalSellAmount() {
        return totalSellAmount;
    }

    public void setTotalSellAmount(double totalSellAmount) {
        this.totalSellAmount = totalSellAmount;
    }
    
    

    public void setCommitionRate(double commitionRate) {
        this.commitionRate = commitionRate;
    }

    public double getCommitionRate() {
        return commitionRate;
    }

    @Override
    public double totalSalary() {
      double commissionAmount=(commitionRate*totalSellAmount)/100;
        return getBaseSalary()+commissionAmount;//To change body of generated methods, choose Tools | Templates.
    }

   

   
   
    
}

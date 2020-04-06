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
public class HourlyComission extends CommitionEmployee {
 private double  totalHour;
 private double hourlyRate;

    public double getTotalHour() {
        return totalHour;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setTotalHour(double totalHour) {
        this.totalHour = totalHour;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }


    
    
    @Override
    public double getTotalSellAmount() {
      double commissionAmount=(getCommitionRate()* getTotalSellAmount())/100;
        double totalhourlySalary=totalHour+hourlyRate;
        return commissionAmount+totalhourlySalary; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setBaseSalary(double baseSayualary) {
        System.err.println("you can't "); //To change body of generated methods, choose Tools | Templates.
    }

   

}

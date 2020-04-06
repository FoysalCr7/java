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
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
     CommitionEmployee ce=new CommitionEmployee();
     ce.setEmployeeID("em-001");
ce.setEmployeeName("sabbir");
ce.setBaseSalary(30000.0);
ce.setCommitionRate(2.5);
ce.setTotalSellAmount(10000.0);
//System.out.println (ce.totalSalary());

HourlyComission hc=new HourlyComission();
hc.setEmployeeName("rahim");
hc.setEmployeeID("em-002");
hc.setHourlyRate(200.0);
hc.setTotalHour(48.0);
hc.setCommitionRate(2.5);
hc.setSalary(5000.0);
hc.setTotalSellAmount(5000.0);

//System.out.println(hc.totalSalary());

Employe em1= ce;
Employe em2= hc;
System.out.println(em1.totalSalary());
System.out.println(em2.totalSalary());

ce=(CommitionEmployee )em1;
System.out.println("CE:"+ce.totalSalary());



    }
    
}

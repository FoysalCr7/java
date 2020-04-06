
package inheritance;


public class Inheritance {


    public static void main(String[] args) {
        
      /* commissionEmployee ce = new commissionEmployee();
        ce.setEmployeeName("Rahul");
        ce.setEmployeeId("111");
        ce.setBaseSalary(1500.0);
        ce.setCommissionRate(2.5);
        ce.setTotalSellAmount(10000.0);
        System.out.println(ce.totalSalary());*/
        
        HourlyComissionEmployee hce=new HourlyComissionEmployee();
        hce.setEmployeeName("kamal");
        hce.setEmployeeId("222");
        hce.setHourlyRate(200.0);
        hce.setTotalHour(48.0);
        hce.setCommissionRate(2.5);
        hce.setTotalSellAmount(5000.0);
        hce.setBaseSalary(5000);
        System.out.println(hce.totalSalary());
        
       // Employee employee1=ce;
        Employee employee2=hce;
        
       // System.out.println(employee1.totalSalary());
        System.out.println(employee2.totalSalary());
        
       // ce=(commissionEmployee)employee1;
        //System.out.println(ce.totalSalary());
        
    }
    
}

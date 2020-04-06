/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstcode;

/**
 *
 * @author USER
 */
public class Banka extends Bank {
 double belence=100;
    @Override
    public void getBelence() {
        
         System.out.println("Belence:$"+belence);
    }
    
}

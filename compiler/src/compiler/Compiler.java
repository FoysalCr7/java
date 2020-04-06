/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiler;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Compiler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

		int simulate,win=0;
		Scanner input = new Scanner(System.in);
 
		System.out.println("Enter number for simulate:");
		simulate= input.nextInt();
 
		for(int i=1;i<=simulate;i++) {
 
			int firstsum=0,newsum=0;
 
                        Random dice =new Random();
			int dice1= 1+dice.nextInt(6);
			int dice2= 1+dice.nextInt(6);
			firstsum = dice1+dice2;
 
			if(firstsum==7 || firstsum==11) {
				win++;
			}
			else if(firstsum==2 || firstsum==3 ||firstsum==12) {
			}else{
			
				newsum=firstsum;
				while(true) {
					dice1= 1+dice.nextInt(6);
				    dice2= 1+dice.nextInt(6);
 
				    firstsum= dice1+dice2;
 
				    if(firstsum==newsum) {
				    	win++;
				    	
				    	break;
				    }
				    else if(firstsum==7) {
				    	
				    	break;
				    }
				}
			}
 
 
		}
 
 
 
 
	String s1 = String.format("Win rate: %,d/%,d", win, simulate);
        
        double winPercent = (double) win / simulate * 100;
        String s2 = String.format("Winning percentage: %.3f%%", winPercent);
        
        String output = s1 + "\n" + s2;
        System.out.println(output);
 
 
	}
    
    
}


 
 
    
    


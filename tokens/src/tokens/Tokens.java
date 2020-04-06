/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokens;

import java.util.Scanner;

/**
 *
 * @author Foysal
 */
public class Tokens {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     String[] keyWord = new String[3];
        keyWord[0]  = ("void");
        keyWord[1] = ("int");
        keyWord[2] = ("main");
        String[] operator = new String[3];
        operator[0]  = ("+");
        operator[1] = ("-");
        operator[2] = ("/");
        Scanner userInput = new Scanner(System.in);

        String input = userInput.nextLine();
        for (int i = 0; i < keyWord.length; i++) {
        if (input.contains(keyWord[i])) {
            System.out.println(keyWord[i]+" is a Keyword");
        
         
        }
        
        
    }
        for (int i = 0; i < operator.length; i++) {
        if (input.contains(operator[i])) {
            System.out.println(operator[i]+" is a operator");
       
         
        }
        
        
  }
        for (int i = 0; i <3; i++) {
       if (input!=keyWord[i] && input!=operator[i]){
            System.out.println(input+" is a identifier");
        } 
        
        
  }
}
    }
    


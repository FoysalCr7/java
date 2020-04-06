/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package montesimulation;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author USER
 */
public class MonteSimulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ThreadLocalRandom rand = ThreadLocalRandom.current();

        // first roll
        int die1 = 1 + rand.nextInt(6);
        int die2 = 1 + rand.nextInt(6);
        final int firstSum = die1 + die2;
        System.out.printf("%d + %d = %d %n", die1, die2, firstSum);

        // Check if player wins or loses on first roll.
        if (firstSum == 7 || firstSum == 11) {
            System.out.println("You win.");
            return;
        }
        if (firstSum == 2 || firstSum == 3 || firstSum == 12) {
            System.out.println("You lose.");
            return;
        }

        // The player did not win or lose on the first roll, so keep rolling until getting
        // a new sum that matches the first one or is equal to 7.
        int newSum = 0;
        while (newSum != firstSum && newSum != 7) {
            die1 = 1 + rand.nextInt(6);
            die2 = 1 + rand.nextInt(6);
            newSum = die1 + die2;
            System.out.printf("%d + %d = %d %n", die1, die2, newSum);
        }
        
        if (newSum == firstSum) {
            System.out.println("You win.");
        } else {
            System.out.println("You lose.");
        }
    }
    
}

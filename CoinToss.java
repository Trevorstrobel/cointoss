/**
 * Created by:  Trevor Strobel on 3/8/15.
 * Class:       CISC122.N82
 * Project:     Lab 1
 */

import javax.swing.*;

public class CoinToss {
    public static void main(String[] args) {

        // Uses JOptionPane to ask the user if they'd like to toss a coin.
        if (JOptionPane.showConfirmDialog(null, "Do you want to toss a coin?",
                "Coin Toss", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

            Coin coin = new Coin(); // Creates an instance of the Coin Class

            coin.setSideUp(coin.toss());  // This line calls both the setSideUP and toss methods at the same time, taking care of all of the calculations.

            int counter = 0; // used as check for the if statement used for the secondary message.
            do
                if (JOptionPane.showConfirmDialog(null, "The result of the toss was " + coin.getSideUp() + "!\nWould you like to flip again?", "Coin Toss",
                        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                        coin.setSideUp(coin.toss());
                } else counter += 1;
            while (counter == 0);
        } else System.exit(1); //Terminates the program


    }
}
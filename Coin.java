/**
 * Created by:  Trevor Strobel on 3/8/15.
 * Class:       CISC122.N82
 * Project:     Lab 1
 */
import java.util.Random;

public class Coin {


    private String sideUP;      //Instance variable holding "heads" or "tails" indicating side up.


    //The following method
    public String toss(){
        Random rand = new Random();

        if(rand.nextInt(10) %2 == 0) {
            sideUP = "Heads";
        } else sideUP = "Tails";
        return getSideUp();
    }

    //setter for the sideUP
    public void setSideUp(String sideUP) {
        this.sideUP = sideUP;
   }

    public String getSideUp() {
        return sideUP;
    }




}


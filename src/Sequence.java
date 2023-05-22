import java.util.*;
public class Sequence {
    private int startingNum;
    private String Operation;
    private int numInSquence;
    private int amount;


    public Sequence (int startingNum, String Operation, int numInSquence, int amount) {
        this.startingNum = startingNum;
        this.Operation = Operation;
        this.numInSquence = numInSquence;
        this.amount = amount;

    }

    public double AlgAndGeoSequence() {
        double num = startingNum;
        if (Operation.equals("a")) {
            for (int i = 1; i < numInSquence; i++) {
               num += amount;
            }
            return num;
        } else if (Operation.equals("s")) {
            for (int i = 1; i < numInSquence; i++) {
                num -= amount;
            }
            return num;
        } else if (Operation.equals("m")) {
            for (int i = 1; i < numInSquence; i++) {
                num *= amount;
            }
            return num;
        } else if (Operation.equals("d")) {
            for (int i = 1; i < numInSquence; i++) {
                num /= amount;
            }
           return num;

        }
        return -9999999.0;
    }
   // public  ArrayList<Integer> printList() {

   // }
}

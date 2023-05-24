import java.util.*;
public class Sequence {
    private int startingNum;
    private String Operation;
    private final int numInSequence;
    private double amount;
    public ArrayList<Double> List = new ArrayList<>();


    public Sequence (int startingNum, String Operation, int numInSequence, double amount) {
        this.startingNum = startingNum;
        this.Operation = Operation;
        this.numInSequence = numInSequence;
        this.amount = amount;

        double num = startingNum;
        ArrayList<Double> L = new ArrayList<Double>();
        List.add((double) startingNum);
        if (Operation.equals("a")) {
            for (int i = 1; i < numInSequence; i++) {
                num += amount;
                List.add(num);
            }
        } else if (Operation.equals("g")) {
            for (int i = 1; i < numInSequence; i++) {
                num *= amount;
                List.add(num);
            }

        }
    }


    public double AlgAndGeoSequence() {
        double num = startingNum;
        ArrayList<Double> L = new ArrayList<Double>();
        List.add((double) startingNum);
        if (Operation.equals("a")) {
            for (int i = 1; i < numInSequence; i++) {
               num += amount;
            }
            return num;
        }  else if (Operation.equals("g")) {
            for (int i = 1; i < numInSequence; i++) {
                num *= amount;
            }
            return num;
        }
        return -9999999.0;
    }
     public double explicitVersion() {
        double num = startingNum;
        if (Operation.equals("a")) {
             num = num + (numInSequence - 1) * amount;
         } else if (Operation.equals("g")) {
            num = num*(Math.pow(amount, numInSequence -1));
         }
        return num;
    }


    public ArrayList<Double> getList() {
        return List;
    }
}

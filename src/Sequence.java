import java.util.*;
public class Sequence {
    private int startingNum;
    private String Operation;
    private final int numInSquence;
    private int amount;
    private ArrayList<Double> List;


    public Sequence (int startingNum, String Operation, int numInSquence, int amount) {
        this.startingNum = startingNum;
        this.Operation = Operation;
        this.numInSquence = numInSquence;
        this.amount = amount;
    }

    public double AlgAndGeoSequence() {
        double num = startingNum;
        ArrayList<Double> L = new ArrayList<Double>();
        L.add((double) startingNum);
        if (Operation.equals("a")) {
            for (int i = 1; i < numInSquence; i++) {
               num += amount;
               L.add(num);
            }
            List = L;
            return num;
        } else if (Operation.equals("s")) {
            for (int i = 1; i < numInSquence; i++) {
                num -= amount;
                L.add(num);
            }
            List = L;
            return num;
        } else if (Operation.equals("m")) {
            for (int i = 1; i < numInSquence; i++) {
                num *= amount;
                L.add(num);
            }
            List = L;
            return num;
        } else if (Operation.equals("d")) {
            for (int i = 1; i < numInSquence; i++) {
                num /= amount;
                L.add(num);
            }
            List = L;
           return num;

        }
        return -9999999.0;
    }

    public void setList(ArrayList<Double> K) {
        List.addAll(K);
    }
    public ArrayList<Double> getList() {
        return List;
    }
}

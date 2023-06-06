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


    public double ArithmeticSequenceA() {
        double num = startingNum;
        for (int i = 1; i < numInSequence; i++) {
            num += amount;
        }
        return num;

    }
    public double ArithmeticSequenceB() {
        double num = startingNum;
        for (int i = 1; i < numInSequence-1; i++) {
            num -= amount;
        }
        return num;

    }
        public double GeometricSequenceA() {
        double num = startingNum;
        for (int i = 1; i < numInSequence; i++) {
            num *= amount;
        }
        return num;
        }
    public double GeometricSequenceB() {
        double num = startingNum;
        for (int i = 1; i < numInSequence; i++) {
            num /= amount;
        }
        return num;
    }




     public double explicitVersion() {
        double num = startingNum;
        if (Operation.equals("a")) {
             num = num + (numInSequence - 1) * amount;
         } else if (Operation.equals("g")) {
            num = num*(Math.pow(amount, numInSequence -1));
         } else if (Operation.equals("s")) {
            num = num + (numInSequence - 1) * (-1 * amount);
        } else if (Operation.equals("d")) {
            num = num/(Math.pow(amount, numInSequence -1));
        }
        return num;
    }

    public double ArithmeticSeries() {
        double lastNum = explicitVersion();
        return numInSequence * ((startingNum + lastNum) / 2);
    }
    public double GeometricSeries() {
        double lastNum = explicitVersion();
        return startingNum * (((1-(Math.pow(amount,numInSequence))) /(1 - amount)));
    }


    public ArrayList<Double> getList() {
        return List;
    }


}

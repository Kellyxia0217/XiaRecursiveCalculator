import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Choose the Starting Number:");
        int startingNum = scan.nextInt();
        System.out.println("");
        System.out.print("Choose the Operation(a for arithmetic, g for geometric):");
        String Operation = scan.next().toLowerCase();
        System.out.println("");
        System.out.print("Choose Which Number in the Sequence you want to Find:");
        int numInSequence = scan.nextInt();
        System.out.println("");
        System.out.print("Choose a number that you want to apply to the Operation each Time(if you want to subtract enter a negative num, if you want to divide enter a decimal):");
        double amount = scan.nextDouble();



        Sequence s1 = new Sequence(startingNum,Operation,numInSequence,amount);
        System.out.println("");
        System.out.print("The List of all the numbers when using the recursive:");
        System.out.println(s1.getList());
        System.out.print("The number at the " + numInSequence + "th position according to the things inputted is(recursive version):");
        System.out.println(s1.AlgAndGeoSequence());
        System.out.print("The number at the " + numInSequence + "th position according to the things inputted is(explicit version):");
        System.out.println(s1.explicitVersion());

    }
}

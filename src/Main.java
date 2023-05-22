import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Choose the Starting Number:");
        int startingNum = scan.nextInt();
        System.out.println("");
        System.out.print("Choose the Operation(a for addition, s for subtraction, m for multiplication, d for division):");
        String Operation = scan.next().toLowerCase();
        System.out.println("");
        System.out.print("Choose Which Number in the Sequence you want to Find:");
        int numInSequence = scan.nextInt();
        System.out.println("");
        System.out.print("Choose a number that you want to apply to the Operation each Time:");
        int amount = scan.nextInt();


        Sequence s1 = new Sequence(startingNum,Operation,numInSequence,amount);
        System.out.println("");
        System.out.println(s1.AlgAndGeoSequence());
    }
}

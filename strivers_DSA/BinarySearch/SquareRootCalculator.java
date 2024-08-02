// TC constant
import java.util.*;

public class SquareRootCalculator {
    public static int SquareRoot (int n) {

        double sqrt = Math.sqrt(n);
        return (int) sqrt;

    }

    public static void main (String[] args) {
        int n = 15;

        double ans = SquareRoot(n);
        System.out.println(ans);
    }
}
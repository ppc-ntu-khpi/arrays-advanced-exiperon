import java.util.Arrays;

/**
 * The class provides functionality for testing the Calculation class
 */
public class Main {
    public static void main(String[] args) {
        int N = 5;
        int M = 3;

        int[][] array = Calculation.getMatrix(N,M);

        System.out.println(Arrays.deepToString(array));
    }
}
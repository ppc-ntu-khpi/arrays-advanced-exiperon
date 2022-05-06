/**
 * The class fills' matrix of size N x M with numbers,
 * each of which is equal to the sum of the two previous elements
 */
public class Calculation {
    /**
     * Fills' matrix of size N x M with numbers,
     * each of which is equal to the sum of the two previous elements
     * @param N rows
     * @param M columns
     * @return Returns two-dimensional array
     */
    public static int[][] getMatrix(int N, int M) {
        int[][] array = new int[N][];
        for(int i = 0; i < N; i++) {
            array[i] = new int[M];
        }
        array[0][1] = array[0][0] = 1;

        for(int i = 2; i < N * M; i++) {
            array[i / M][i % M] =
                    array[(i - 1) / M][(i - 1) % M] +
                            array[(i - 2) / M][(i - 2) % M];
        }

        return array;
    }
}

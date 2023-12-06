import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Result {

    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
        // Write your code here
        for (int i = n - 1; i >= 0; i--) {
            int numSpaces = i;
            int pounds = n - i;
            for (int j = numSpaces; j > 0; j--) {
                System.out.print(' ');
            }
            for (int k = pounds; k > 0; k--) {
                System.out.print('#');
            }
            System.out.println();
        }

    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.staircase(n);

        bufferedReader.close();
    }
}

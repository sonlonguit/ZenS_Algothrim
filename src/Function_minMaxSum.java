import java.util.Arrays;

public class Function_minMaxSum {
    public static void main(String[] args) {
        int[] ArrInteger = new int[]{1, 2, 3, 4, 5};
        minMaxSum(ArrInteger);
    }

    public static void minMaxSum(int[] ArrInteger) {
        long minSum = 0L;
        long maxSum = 0L;
        Arrays.sort(ArrInteger);

        int i;
        for(i = 0; i < 4; ++i) {
            minSum += (long)ArrInteger[i];
        }

        for(i = ArrInteger.length - 1; i >= ArrInteger.length - 4; --i) {
            maxSum += (long)ArrInteger[i];
        }

        System.out.println("" + minSum + " " + maxSum);
    }
}

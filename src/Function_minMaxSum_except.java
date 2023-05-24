
public class Function_minMaxSum_except {
    public static void main(String[] args) {
        int[] ArrInteger = new int[]{1, 2, 3, 4, 5};
        minMaxSum(ArrInteger);
    }

    public static void minMaxSum(int[] ArrInteger) {
        long minSum = Long.MAX_VALUE;
        long maxSum = Long.MIN_VALUE;
        long totalSum = 0L;

        int i;
        for(i = 0; i < ArrInteger.length; ++i) {
            totalSum += (long)ArrInteger[i];
        }

        for(i = 0; i < ArrInteger.length; ++i) {
            long sum = totalSum - (long)ArrInteger[i];
            minSum = Math.min(minSum, sum);
            maxSum = Math.max(maxSum, sum);
        }

        System.out.println("" + minSum + " " + maxSum);
    }
}

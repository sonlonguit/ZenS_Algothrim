import java.util.Arrays;

public class Min_Max_Sum {
    public static void main(String[] args) {
        int[] ArrInteger = new int[]{1, 3, 5, 7, 9};
        long sumMin = 0L;
        long sumMax = 0L;
        Arrays.sort(ArrInteger);

        int i;
        for(i = 0; i < 4; ++i) {
            sumMin += (long)ArrInteger[i];
        }

        for(i = ArrInteger.length - 1; i >= ArrInteger.length - 4; --i) {
            sumMax += (long)ArrInteger[i];
        }

        System.out.println("" + sumMin + " " + sumMax);
    }
}

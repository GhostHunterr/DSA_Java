
public class MaxSubArray {

    //O(n^3)
    public static int bruteSubArray(int[] arr) {
        int sum = Integer.MIN_VALUE;
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                sum = 0;

                for (int start = i; start <= j; start++) {
                    sum += arr[start];
                }

                if (sum > result) {
                    result = sum;
                }
            }
        }
        return result;
    }

    //O(n^2)
    public static int prefixSubArray(int[] arr) {

        int sum = Integer.MIN_VALUE;
        int result = 0;
        int[] prefix = new int[arr.length];

        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                sum = (i == 0 ? prefix[j] : prefix[j] - prefix[i - 1]);

                if (sum > result) {
                    result = sum;
                }
            }
        }
        return result;
    }

    //O(n)
    public static int kadanesAlgo(int[] arr) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            if (currSum > maxSum) {
                maxSum = currSum;
            }
            currSum = currSum < 0 ? 0 : currSum;
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {-1, -2, -3, -7, -9};
        System.out.println(kadanesAlgo(arr));
    }
}

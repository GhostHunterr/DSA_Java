
public class BinarySearch {

    public static int linearSearch(int[] var0, int var1) {
        for (int var2 = 0; var2 < var0.length; ++var2) {
            if (var0[var2] == var1) {
                return var2;
            }
        }

        return -1;
    }

    public static void main(String[] var0) {
        int[] var1 = new int[]{1, 2, 3, 4, 5, 6, 7};
        System.out.println(linearSearch(var1, 3));
    }
}

package bitManipulation;

public class RemoveLastSetBit {
    public static int removeLastBit(int num) {
        return num & num -1;
    }

    public static boolean isPowerOfTwo(int num) {
        return num > 0 && (num & (num - 1)) == 0;
    }

    public static void main(String[] args) {
        int num = 16;
        System.out.println(removeLastBit(num));

        System.out.println(isPowerOfTwo(num));
    }
}

package bitManipulation;

public class CheckIthBitSet {
    public static boolean checkIthBitSet(int a, int i) {
        return (a & (1 << i)) != 0 || ((a >> i) & 1) == 1;
    }

    public static void main(String[] args) {
        int num = 13;
        int i = 3;
        System.out.println(checkIthBitSet(num, i));
    }
}

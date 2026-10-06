package bitManipulation;

public class SetTheIthBit {
    public static int setIthBit(int a, int i) {
        return (1 << i) | a;
    }

    public static void main(String[] args) {
        int num = 9;
        System.out.println(setIthBit(num, 2));
    }
}

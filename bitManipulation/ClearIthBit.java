package bitManipulation;

public class ClearIthBit {
    public static int clearIthBit(int num, int i) {
        return ~(1 << i) & num;
    }

    public static void main(String[] args) {
        int num = 15;
        System.out.println(clearIthBit(num, 2));
    }
}

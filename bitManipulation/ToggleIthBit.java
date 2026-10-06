package bitManipulation;

public class ToggleIthBit {
    public static int toggleIthBit(int num, int i) {
        return (1 << i) ^ num;
    }

    public static void main(String[] args) {
        int num = 13;
        System.out.println(toggleIthBit(num, 1));
    }
}

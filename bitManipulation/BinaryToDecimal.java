package bitManipulation;

import java.util.Scanner;

public class BinaryToDecimal {
    public static int convertToDecimal(String binary) {
        int num = 0;
        int power = 1;
        int len = binary.length();
        for (int i = len - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                num = num + power;
                power *= 2;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.nextLine();
        int num = convertToDecimal(binary);
        System.out.println(num);
    }
}

package bitManipulation;

import java.util.Scanner;

public class DecimalToBinary {
    public static String convertDecimalToBinary(int num) {
        if (num == 0) return "0";
        StringBuilder ans = new StringBuilder();
        while (num > 0) {
            ans.append(num % 2);
            num = num / 2;
        }
        return ans.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(convertDecimalToBinary(num));
    }
}

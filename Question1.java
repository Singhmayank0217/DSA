// convert -8 to binary and then reverse

import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        if (n < 0) {
            n = Math.abs(n);
            StringBuilder sb = new StringBuilder();
            int pow = 1;
            int ans = 0;
            while (n > 0) {
                //handling negative number logic
                int rem = n % 2;
                n = n / 2;
                ans = ans + rem * pow;
                pow *= 10;
            }
            sb.append(ans);
            sb.insert(0, '0');
            System.out.println("Step 1 (Decimal to Binary): " + sb.toString());
            for (int i = 0; i < sb.length(); i++) {
                if (sb.charAt(i) == '0') {
                    sb.setCharAt(i, '1');
                } else if (sb.charAt(i) == '1') {
                    sb.setCharAt(i, '0');
                } else {
                    System.out.println("Invalid character detected: " + sb.charAt(i));
                    System.exit(1);
                }
            }
            System.out.println("Step 2 (Reversed Binary): " + sb.toString());
            int carry = 1;
            for (int i = sb.length() - 1; i >= 0; i--) {
                if (sb.charAt(i) == '0' && carry == 1) {
                    sb.setCharAt(i, '1');
                    carry = 0;
                } else if (sb.charAt(i) == '1' && carry == 1) {
                    sb.setCharAt(i, '0');
                }
            }
            System.out.println("Step 3 (Reversed Binary + 1): " + sb.toString());
            for (int i = 0; i < sb.length(); i++) {
                if (sb.charAt(i) == '0') {
                    sb.setCharAt(i, '1');
                } else if (sb.charAt(i) == '1') {
                    sb.setCharAt(i, '0');
                } else {
                    System.out.println("Invalid character detected: " + sb.charAt(i));
                    System.exit(1);
                }
            }
            System.out.println("Step 4 (Final Reversed Result): " + sb.toString());
            carry = 1;
            for (int i = sb.length() - 1; i >= 0; i--) {
                if (sb.charAt(i) == '0' && carry == 1) {
                    sb.setCharAt(i, '1');
                    carry = 0;
                } else if (sb.charAt(i) == '1' && carry == 1) {
                    sb.setCharAt(i, '0');
                }
            }
            System.out.println("Step 5 (Final Result + 1): " + sb.toString());
        } else {
            // Handling positive numbers logic
            int pow = 1;
            int ans = 0;
            while (n > 0) {
                int rem = n % 2;
                n = n / 2;
                ans = ans + rem * pow;
                pow *= 10;
            }
            System.out.println("Binary representation of positive number: " + ans);
        }
    }
}

import java.util.*;

// Decimal To Binary
// public class DecimalToBinary {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number");
//         int n = sc.nextInt();
//         int pow = 1;
//         int ans = 0;
//         while (n > 0) {
//             int rem = n % 2;
//             n = n / 2;
//             ans = ans + rem * pow;
//             pow *= 10;
//         }
//         System.out.println(ans);
//     }

//Binary To Decimal
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number");
        int n = sc.nextInt();
        int pow = 1;
        int ans = 0;
        while (n > 0) {
            int rem = n % 2;
            ans = ans + rem * pow;
            n = n / 10;
            pow *= 2;
        }
        System.out.println(ans);
    }
}

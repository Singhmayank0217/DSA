//to print all unique elemnet in array

//to print all unique elemnet in array
import java.util.*;

public class Question2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Unique elements are:");
        for (int i = 0; i < n; i++) {
            boolean isUnique = true;  
            for (int j = 0; j < n; j++) {
                if (i != j && arr[i] == arr[j]) {  
                    isUnique = false;
                    break;  
                }
            }
            if (isUnique) {
                System.out.println(arr[i]);  
            }
        }
    }
}

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


/*
// to print the intersection of two array
import java.util.*;
public class Intersection {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of first array:");
        int n = sc.nextInt();
        int arr1[] = new int[n];
        
        System.out.println("Enter the elements of first array:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        
        System.out.println("Enter the size of second array:");
        int m = sc.nextInt();
        int arr2[] = new int[m];
        
        System.out.println("Enter the elements of second array:");
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.println(arr1[i]);
                    break;
                }
            }
        }
    }
}
 */
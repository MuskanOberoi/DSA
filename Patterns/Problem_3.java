/*
 1 
 1 2
 1 2 3
 1 2 3 4 
 1 2 3 4 5
 */
package Patterns;
import java.util.Scanner;

public class Problem_3 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 
       System.out.println("Enter the num");
       int n = sc.nextInt();
       //outer loop for rows
       for(int i=1; i<n; i++){
        // inner loop for columns
        for(int j=1; j<=i; j++){
            System.out.print(j);
        }
        System.out.println();
       }
    }}
    


/*
 1
 2 2
 3 3 3
 4 4 4 4
 5 5 5 5 5 
 */

package Patterns;

import java.util.Scanner;

public class Problem_4 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 
       System.out.println("Enter the num");
       int n = sc.nextInt();
       //outer loop for rows
       for(int i=1; i<n; i++){
        // inner loop for columns
        for(int j=1; j<=i; j++){
            System.out.print(i);
        }
        System.out.println();
       }
    }}


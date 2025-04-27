/*
 * * * * *
 * * * *
 * * *
 * *
 * 
 */

package Patterns;

import java.util.Scanner;

public class Problem_5 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 
       System.out.println("Enter the num");
       int n = sc.nextInt();
       //outer loop for rows
       for(int i=1; i<=n; i++){
        // inner loop for columns
        for(int j=0; j<n-i+1;j++){
            System.out.print("*");
        }
        System.out.println();
       }
    }}


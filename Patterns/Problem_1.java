// print this pattern
// * * * *
// * * * *
// * * * *
// * * * *
package Patterns;
import java.util.Scanner;
class Problem_1{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 
       System.out.println("Enter the num");
       int n = sc.nextInt();
       //outer loop for rows
       for(int i=0; i<n; i++){
        // inner loop for columns
        for(int j=0; j<n; j++){
            System.out.print("* ");
        }
        System.out.println();
       }
    }
}

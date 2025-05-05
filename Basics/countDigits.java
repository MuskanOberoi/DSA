package Basics;
import java.util.Scanner;
public class countDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the num");
        int n = sc.nextInt();
        int count = 0;
        while(n>0){
            int last_digit = n%10;
            System.out.println(last_digit);
            n=n/10;
            count++;
            }
            System.out.println("Number of digits in the number is "+count);
        }
        
    
    


}

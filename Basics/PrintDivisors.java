//print all the divisors
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class PrintDivisors {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number:");
    int n = sc.nextInt();
    List<Integer> divisors = new ArrayList<>(); // we need to create a list and store the divisors in list so that we can sort them
    for(int i=1; i*i<n; i++){
        if(n%i==0){
            divisors.add(i);//for n=36-----1,2,3,4,6
            if((n/i)!=i){// so that 6 should not repeat
                divisors.add(n/i);//other factors like 18,12,9

            }
        }

    }
    Collections.sort(divisors);
    System.out.println("sorted divisors:"+ divisors);

  }
    
}

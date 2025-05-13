import java.util.Scanner;
public class armstrong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int sum = 0;
        int original = n;
        while(n>0){
            int last_digit = n % 10;
            sum = sum + (last_digit * last_digit * last_digit);
            n = n/10;
        }
        System.out.println("Sum: "+sum);
        if(sum == original){
            System.out.println("True!! it is an armstrong number");
        }
        else{
            System.out.println("False!! it is not an armstrong number");
        }
    }
    
}

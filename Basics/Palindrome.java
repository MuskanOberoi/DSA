import java.util.Scanner;
public class Palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();
        int dup = n;
        int revNum = 0;
        while(n>0){
            int lastdigit = n%10;
            revNum = (revNum*10) + lastdigit;
            n = n/10;
        }
        System.out.println("Reverse: " + revNum);
        if (revNum == dup){
            System.out.println("True");
        }
        else{
            System.out.println("false");
        }
        
    }
}
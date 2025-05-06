
public class reverseNum {
    {
         int n = 5678;
       int revNum = 0;
       while(n>0){
        int lastdigit = n%10;
        revNum = (revNum*10) + lastdigit;
        n = n/10;
       }
       System.out.println("Reverse Number is: "+revNum);
       }
}

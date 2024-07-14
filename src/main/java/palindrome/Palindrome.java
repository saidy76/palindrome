
package palindrome;
import java.util.Scanner;


public class Palindrome {

    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter a Number :");
        int n= sc.nextInt();
        
        if(is_palindrome(n)){
            System.out.println("The Number is Palindrome.");
        }else{
            System.out.println("The number is not palindrome");
        }
    }
          public static boolean is_palindrome(int n){
              int Num=n;
              int reverse=0;
              while(n!=0){
                     int remainder = n%10;
                reverse = reverse*10 + remainder; 
                n/=10;
                  
              }
        return Num==reverse;
        
    }
}

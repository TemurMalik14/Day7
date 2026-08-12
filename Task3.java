import java.util.Scanner;

public class Task3 {
    public static int reverse(int n){
        int result = 0;
        while(n !=0){
         int digit = n %10;
         result = result *10+digit;
         n=n/10;
        }
        return result;
    }
public static void main(String[] args){
    Scanner java = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = java.nextInt();
    int result = reverse(n);
    System.out.println(result);
    }
}

import java.util.Scanner;

public class Task5 {
    public static double multiply(int n){
        double result = 1;
        double mult = 1.1;
        for(int i = 1; i<= n; i++){
            result = result * mult;
            mult = mult +0.1;
        }
    return result;
    }
public static void main(String[] args){
    Scanner java = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = java.nextInt();
    double result = multiply(n);
    System.out.printf("%.2f",result);
    }
}

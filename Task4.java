import java.util.Scanner;

public class Task4 {
    public static String nn(int n) {
        String result = "";
        for (int i = 1; i <= n; i++) {
           result += n +" ";
        }
        return result;
    }
public static void main(String[] args){
    Scanner java = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = java.nextInt();
    String result = nn(n);
    System.out.println(result);
    }
}
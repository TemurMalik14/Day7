import java.util.Scanner;

public class Task2 {
    public static String aInb(int a, int b) {
        String result = "";
        for (int i = a + 1; i < b; i++) {
            for (int j = 1; j <= i; j++) {
                result += i + " ";
            }
        }
            return result;
    }
public static void main(String[] args){
    Scanner java = new Scanner(System.in);
    System.out.print("Enter a: ");
    int a = java.nextInt();
    System.out.print("Enter b: ");
    int b = java.nextInt();
    String result = aInb(a,b);
    System.out.println(result);
    }
}

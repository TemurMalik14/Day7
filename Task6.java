import java.util.Scanner;

public class Task6 {
    public static int negative(Scanner java) {
        int fivecount = 0;
        System.out.print("ENter numbers: ");
        int n = java.nextInt();
        while (n >= 0) {
            if (n > 0 && n % 5 == 0) {
                fivecount++;
            }
            n= java.nextInt();
        }
        return fivecount;
    }

    public static void main(String[] args) {
        Scanner java = new Scanner(System.in);
        int result = negative(java);
        System.out.println("amount of divisible by 5 is "+result);
    }
}

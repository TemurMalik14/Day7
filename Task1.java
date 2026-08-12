import java.util.Scanner;

public class Task1 {
    public static int digitCount(int n){
        int count = 0; // sanashga o'zgaruvchi olyabmiz
        while (n>0){ //while loopda n 0dan kattaligida sonlarni aylantirib chiqyabmiz
            n=(n/10); //sonlarni 10ga bo'lib sonlarni kesib chiqadi va 0ga teng bo'lib qolgandi to'xtaydi
            count++; // nechchi xonaligini sanab ketadi
        }
        return count;
    }
public static void main(String[] args){
    Scanner java = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = java.nextInt();
    int result = digitCount(n);
    System.out.println(result+" digit number");
    }
}

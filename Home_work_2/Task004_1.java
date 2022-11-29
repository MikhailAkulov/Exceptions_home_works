import java.util.Scanner;

/**
 * Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
 * Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */

public class Task004_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите данные: ");
        String str = sc.nextLine();
        if (str.length() == 0) {
            throw new RuntimeException("Пустые строки вводить нельзя!");
        }
        System.out.print("Введены данные: " + str);
        sc.close();
    }
}
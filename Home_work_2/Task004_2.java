import java.util.Scanner;

/**
 * Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
 * Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */

public class Task004_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean inputError = false;
        while (!inputError) {
            System.out.print("Введите данные: ");
            try {
                String str = sc.nextLine();
                if (str.length() != 0) {
                    System.out.print("Введены данные: " + str);
                    inputError = true;
                } else {
                    inputError = false;
                    throw new IllegalArgumentException("Пустые строки вводить нельзя!");
                }
            } catch (Exception e) {
                System.out.println("Exception : " + e);
                inputError = false;
            }
        }
        sc.close();
    }
}
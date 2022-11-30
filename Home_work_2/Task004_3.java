/**
 * Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
 * Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */

import java.util.Scanner;

public class Task004_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println(checkEmpty(sc));
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static String checkEmpty(Scanner sc) throws Exception {
        System.out.print("Введите данные: ");
        String str = sc.nextLine();
        if (str.length() == 0) {
            throw new Exception("Пустые строки вводить нельзя!");
        }
        System.out.print("Вы ввели: ");
        return str;
    }
}

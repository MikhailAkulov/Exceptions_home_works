//package Home_work_2;

/**
 * Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение. 
 * Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, 
 * необходимо повторно запросить у пользователя ввод данных.
 */

import java.util.Scanner;

public class Task001_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Введите дробное число (разделяющий символ целой части - ','): ");
        float num;
        while (!sc.hasNextFloat()) {
            System.out.print("Ошибка! Вы ввели не дробное число, попробуйте ещё разок: ");
            sc.next();
        }
        num = sc.nextFloat();
        System.out.println("Вы ввели число: " + num);
        sc.close();
    }
}

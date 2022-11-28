import java.util.Scanner;

public class Task001_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Введите дробное число: ");
        float number = sc.nextFloat();
        try {
            
            if (!sc.hasNextFloat()) {
                System.out.print("Ошибка! Вы ввели не число, попробуйте ещё разок: ");
                //sc.next();
            }
            else {
                System.out.println("Вы ввели число: " + number);
            }
        }
        catch (NumberFormatException e) {
            System.out.print("Ошибка! Вы ввели не число, попробуйте ещё разок: ");
            sc.next();
        }
        //sc.close();
    }
    
}

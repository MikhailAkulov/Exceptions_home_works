/**
 * Если необходимо, исправьте данный код:
 * try {
 *      int d = 0;
 *      double catchedRes1 = intArray[8] / d;
 *      System.out.println("catchedRes1 = " + catchedRes1);
 * } catch (ArithmeticException e) {
 *      System.out.println("Catching exception: " + e);
 * }
 */

public class Task002 {
    public static void main(String[] args) {
        Integer[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        }
        catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        }         
    } 
}

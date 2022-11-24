package Home_work_1;

public class Task003 {
    public static void main(String[] args) {
        System.out.println();
        System.out.print("Subtracting arrays of the same length: ");
        Integer[] array1 = { 2, 4, 6, 8, 10 };
        Integer[] array2 = { 1, 3, 5, 7, 9 };
        subtractingArrays(array1, array2);

        System.out.println();

        System.out.print("Subtracting arrays of different lengths: ");
        Integer[] array3 = { 2, 4, 6, 8 };
        Integer[] array4 = { 1, 3, 5, 7, 9 };
        subtractingArrays(array3, array4);
    }

    public static Integer[] subtractingArrays(Integer[] arr1, Integer[] arr2) {
        if (arr1.length != arr2.length) {
            System.out.println("Error! For subtraction, both arrays must have the same length");
            return null;
        }
        else {
            Integer[] resultArray = new Integer[arr1.length];
            for (int i = 0; i < resultArray.length; i++) {
                resultArray[i] = arr1[i] - arr2[i];
            }
            for (Integer i: resultArray) {
                System.out.print(i + " ");
            }
            System.out.println();
            return resultArray;
        }
    }
}
package Home_work_1;

public class Task004 {
    public static void main(String[] args) {
        System.out.println();
        System.out.print("Dividing arrays of the same length: ");
        Integer[] array1 = { 2, 4, 6, 8, 10 };
        Integer[] array2 = { 1, 3, 5, 7, 9 };
        dividingArrays(array1, array2);

        System.out.println();

        System.out.print("Dividing arrays if one contains zero: ");
        Integer[] array3 = { 2, 4, 6, 8, 10 };
        Integer[] array4 = { 1, 3, 0, 7, 9 };
        dividingArrays(array3, array4);

        System.out.println();

        System.out.print("Dividing arrays of different lengths: ");
        Integer[] array5 = { 2, 4, 6, 8 };
        Integer[] array6 = { 1, 3, 5, 7, 9 };
        dividingArrays(array5, array6);

        System.out.println();

        System.out.print("Dividing arrays if one is empty: ");
        Integer[] array7 = { 2, 4, 6, 8, 10 };
        Integer[] array8 = {};
        dividingArrays(array7, array8);
    }

    public static Integer[] dividingArrays(Integer[] arr1, Integer[] arr2) {
        if (arr1.length == 0 | arr2.length == 0) {
            System.out.println("Error! One of the arrays or both is empty");
            return null;
        }
        else if (arr1.length != arr2.length) {
            System.out.println("Error! To divide, both arrays must have the same length");
            return null;
        }
        else {
            Integer[] resultArray = new Integer[arr1.length];
            for (int i = 0; i < resultArray.length; i++) {
                if (arr2[i] == 0) {
                    System.out.println("Error! Dividing by zero");
                    return null;
                }
                else {
                    resultArray[i] = arr1[i] / arr2[i];
                }

            }
            for (Integer i: resultArray) {
                System.out.print(i + " ");
            }
            System.out.println();
            return resultArray;
        }
    }
}
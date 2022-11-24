package Home_work_1;

import java.io.*;

public class Task001 {
    public static void main(String[] args) {

        method1(1); // StackOverflowError
        /* Number: 1
        *  ...
        *  Number: 6056
        *  Exception in thread "main" java.lang.StackOverflowError
        */

        method2(); // FileNotFoundException
        /* FileNotFoundException caught!
        *  java.io.FileNotFoundException: test (�� ������� ����� ��������� ����)
	    *   at java.base/java.io.FileInputStream.open0(Native Method)
	    *   at java.base/java.io.FileInputStream.open(FileInputStream.java:216)
	    *   at java.base/java.io.FileInputStream.<init>(FileInputStream.java:157)
	    *   at java.base/java.io.FileReader.<init>(FileReader.java:75)
	    *   at Home_work_1.Task001.method2(Task001.java:37)
	    *   at Home_work_1.Task001.main(Task001.java:15)
	    * */


        method3(2); // IndexOutOfBoundsException
        /* Exception in thread "main" java.lang.IndexOutOfBoundsException
	    *   at Home_work_1.Task001.method3(Task001.java:56)
	    *   at Home_work_1.Task001.main(Task001.java:27)
	    */

    }
    public static void method1(int num) {
        System.out.println("Number: " + num);
        if (num == 0) {
            return;
        }
        else {
            method1(++num);
        }
    }

    public static void method2() {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(new File("test")));
        } catch (FileNotFoundException e) {
            System.err.println("FileNotFoundException caught!");
            e.printStackTrace();
        }
    }

    public static void method3(int index) {
        if (index != 0) {
            throw new IndexOutOfBoundsException();
        }
        return;
    }
}

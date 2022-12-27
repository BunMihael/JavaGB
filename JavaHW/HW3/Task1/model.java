package JavaHW.HW3.Task1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class model {
    public static HashMap<Integer, String> creatDict(Object[][] result1) {
        HashMap<Integer, String> map = new HashMap<>();
        for (int i = 1; i < result1.length; i++) {
            String x = Arrays.toString(result1[i]);
            map.put(i, x);
        }
        return map;
    }

    public static long[] calculation(int a, int b, int c, int d) {
        long[] array = new long[b + 1];
        array[a] = 1;

        for (int index = a + 1; index <= b; index++) {
            if ((index % c == 0) && (index - d >= 0)) {
                array[index] = array[index - d] + array[index / c];
            } else if (index - d >= 0) {
                array[index] = array[index - d];
            } else if (index % c == 0)
                array[index] = array[index / c];
        }

        return array;
    }

    public static String minPath(int a, int b, int c, int d, long[] arr) {
        StringBuilder newArr = new StringBuilder();
        if (arr[b] == 0)
            return newArr.toString();
        else {
            while (b > a) {
                if ((b % c == 0) && (arr[b / c] != 0)) {
                    b = b / c;
                    newArr.insert(0, "k1 ");
                } else if (b - d >= a) {
                    b = b - d;
                    newArr.insert(0, "k2 ");
                }
            }
            return newArr.toString();
        }
    }

    public static String middlePath(int a, int b, int c, int d, long[] arr) {
        StringBuilder newArr = new StringBuilder();
        if (arr[b] == 0)
            return newArr.toString();
        else {
            while (b > a) {
                if ((b % c == 0) && (arr[b / c] != 0) && a * 3 <= b) {
                    b = b / c;
                    newArr.insert(0, "k1 ");
                } else if (a * 3 >= b) {
                    b = b - d;
                    newArr.insert(0, "k2 ");
                }
            }
            return newArr.toString();
        }
    }

    public static int NaturalNumber(String string, Scanner input) {
        int number = 0;
        boolean check = false;

        while (!check) {
            System.out.printf("Please enter a natural number: %s: ", string);
            while (!input.hasNextInt()) {
                System.out.println("You didn't enter a number, please try again!");
                input.next();
            }

            number = input.nextInt();

            if (number <= 0) {
                System.out.println("You didn't enter a number, please try again!");
            } else {
                check = true;
            }
        }

        return number;
    }
}
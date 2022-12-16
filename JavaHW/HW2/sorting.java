package JavaHW.HW2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * sorting
 */
public class sorting {

    public static void main(String[] args) {
        Controller.app();

    }
}

class Controller {
    public static void app() {
        System.out.print("You have entered the merge sort algorithm. ");
        // int min = view.minimum();
        // int max = view.maximum();
        // int num = view.size();
        // int[] size = model.createArray(num);
        // int[] array = model.fillRandom(size, min, max);
        // System.out.println(size);

        int[] array1 = { 9, 1, -3, 0, 6, 9, 8, -4, 2, -110, 43 };
        int[] result = model.mergesort(array1);
        System.out.println(Arrays.toString(result));

    }
}

class model {
    public static int[] createArray(int count) {
        return new int[count];
    }

    public static int[] fillRandom(int[] array, int min, int max) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(min, max + 1);
        }
        return array;
    }

    public static int[] mergesort(int[] array1) {
        int[] buffer1 = Arrays.copyOf(array1, array1.length);
        int[] buffer2 = new int[array1.length];
        int[] result = mergesortInner(buffer1, buffer2, 0, array1.length);
        return result;
    }

    /**
     * 
     * @param buffer1    Массив для сортировки.
     * @param buffer2    Буфер. Размер должен быть равен размеру buffer1.
     * @param startIndex Начальный индекс в buffer1 для сортировки.
     * @param endIndex   Конечный индекс в buffer1 для сортировки.
     * @return
     */
    public static int[] mergesortInner(int[] buffer1, int[] buffer2,
            int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return buffer1;
        }

        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = mergesortInner(buffer1, buffer2, startIndex, middle);
        int[] sorted2 = mergesortInner(buffer1, buffer2, middle, endIndex);

        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = sorted1 == buffer1 ? buffer2 : buffer1;
        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++]
                    : sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }

}

class view {
    /**
     * 
     * @return Возвращает максимальное число для рандома.
     */
    public static int maximum() {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter maximum number for algorithm: ");
        if (in.hasNextInt()) {
            int max = in.nextInt();
            return max;
        } else {
            System.out.print("Error: write integer");
        }
        return 0;

    }

    /**
     * 
     * @return Возвращает минимальное число для рандома.
     */
    public static int minimum() {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter maximum number for algorithm: ");
        if (in.hasNextInt()) {
            int min = in.nextInt();
            return min;
        } else {
            System.out.print("Error: write integer");
            return 0;
        }
    }

    /**
     * 
     * @return Задает размер массиву.
     */
    public static int size() {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter volume of the array: ");
        if (in.hasNextInt()) {
            int size = in.nextInt();
            return size;
        } else {
            System.out.print("Error: write integer");
            return 0;
        }

    }
}
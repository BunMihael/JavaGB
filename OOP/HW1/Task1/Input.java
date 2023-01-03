package OOP.HW1.Task1;

import java.util.Scanner;

public class Input {
    public static int getInputData(Scanner input) {
        int number = 0;
        boolean check = false;

        while (!check) {
            while (!input.hasNextInt()) {
                System.out.println("Вы ввели не число, повторите ввод!");
                input.next();
            }
            number = input.nextInt();

            if (number <= 0)
                System.out.println("Вы ввели не натуральное число или число вне диапазона, повторите ввод!");
            else
                check = true;
        }

        return number;
    }
}
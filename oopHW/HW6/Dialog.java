package oopHW.HW6;

import java.util.Scanner;

public class Dialog {
    public Integer menu() {
        int answer = 0;
        boolean check = false;
        System.out.println("\nCalculator menu");
        System.out.println("\t1 - a + b");
        System.out.println("\t2 - a - b");
        System.out.println("\t3 - a / b");
        System.out.println("\t4 - a * b");
        System.out.println("\t5 - Exit");
        System.out.println("Please choose the desired item: ");
        Scanner input = new Scanner(System.in);
        while (!check) {
            while (!input.hasNextInt()) {
                System.out.println("You didn't enter a number, please try again!");
                input.next();
                input.close();
            }
            answer = input.nextInt();

            if (answer <= 0 && answer > 8)
                System.out.println("You entered a non-natural number or a number out of range, please re-enter!");
            else
                check = true;
        }

        return answer;
    }
    }



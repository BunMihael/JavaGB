package JavaHW.HW5;

import java.util.Scanner;

public class triangle {
    public static int getInputData(String string, Scanner in) {
        int number = 0;
        boolean check = false;

        while (!check) {
            System.out.printf("Введите натуральное число %s: ", string);

            while (!in.hasNextInt()) {
                System.out.println("Вы ввели не число, повторите ввод!");
                in.next();
            }

            number = in.nextInt();

            if (number < 0)
                System.out.println("Вы ввели не натуральное число, повторите ввод!");
            else
                check = true;
        }

        return number;
    }


    public static int getTriangleNumber(int number) {
        int sum = 0;

        if (number == 0){
        return 0;

        } else if (number == 1){
            return 1;

        }else{
            for(int i = 0; i <= number; i++){
                    sum += i;
                }

            return sum;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = getInputData("n (для определения треугольного числа)", input);
        input.close();

        System.out.printf("\nТреугольное число для n = %d равно %d\n", number, getTriangleNumber(number));
        System.out.println();

        for (int i = 0; i <= number; i++){
            for (int j = number; j > i; j--){
                System.out.print(" ");
            }
  
            for (int j1 = 0; j1 <= i; j1++){
                System.out.print("*");
            }
  
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
  
            for (int j = number; j > i; j--){
                System.out.print(" ");
            }

            System.out.println("  "+i);
        }
    }
}

package JavaHW.HW3.Task1;

import java.util.Scanner;

public class controller {
    public static void control() {
        view.greetings();
        Scanner input = new Scanner(System.in);
        int a = model.NaturalNumber("a", input);
        // view.invitation("a");
        int b = model.NaturalNumber("b", input);
        // view.invitation("b");
        int c = model.NaturalNumber("c", input);
        // view.invitation("c");
        int d = model.NaturalNumber("d", input);
        // view.invitation("d");
        input.close();

        if (b < a)
            System.out.println("There is no solution!");
        else {
            int[] arraySize = new int[b + 1];

            System.out.println("\nRoute map:\n");
            long[] routes = model.calculation(a, b, c, d);

            int index = 0;

            while (index < arraySize.length - 1) {
                index++;
            }
            System.out.printf("From number 7 %d -> to %d routes\n", index, routes[index]);

            String chars = model.minPath(a, b, c, d, routes);
            // String chars2 = model.middlePath(a, b, c, d, routes);
            // char[] chars2 = model.middlePath(a, b, c, d, routes).toCharArray();
            // // char[] chars = routeString1.toCharArray();
            // // char[] chars = routeString1.toCharArray();
            // Object[][] amount = {{chars},{chars2}};
            // HashMap<Integer, String> result = model.creatDict(amount);

            System.out.printf("\nMinimum number of steps \n%s", chars);
        }
    }
}

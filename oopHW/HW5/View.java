package oopHW.HW5;

import java.util.Scanner;
import java.util.ListIterator;
import java.util.Arrays;
import java.util.List;

public class View {

    public static int showMenu() {
        int answer = 0;
        boolean check = false;
        System.out.println("\nMenu");
        System.out.println("\t1 - Read data:");
        System.out.println("\t2 - Create new record:");
        System.out.println("\t3 - Delete data:");
        System.out.println("\t4 - Change telephone");
        System.out.println("\t5 - import data in txt-file");
        System.out.println("\t6 - Exit");
        System.out.println("Please choose the desired item: ");
        Scanner input = new Scanner(System.in);
        while (!check) {
            while (!input.hasNextInt()) {
                System.out.println("You didn't enter a number, please try again!");
                input.next();
            }
            answer = input.nextInt();

            if (answer <= 0 && answer > 8)
                System.out.println("You entered a non-natural number or a number out of range, please re-enter!");
            else
                check = true;
        }

        return answer;
    }

    public static int delete() {
        System.out.println("Enter ID to delete: ");
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    public static int index() {
        // int changeTel = 0;
        System.out.println("Enter ID to delete: ");
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        return i;
    }
    // public static char[] changeTel() {
    // char[] changeTel = new char[2];
    // System.out.println("Enter ID to delete: ");
    // Scanner input = new Scanner(System.in);
    // changeTel[0] = (char) input.nextInt();
    // System.out.println("Enter full name(ФИО), phone number, grade, status
    // separated by a space: ");
    // Scanner input2 = new Scanner(System.in);
    // changeTel[1] = (string) input2.nextLong();
    // return changeTel;
    // }

    public int[] changeGrade() {
        int[] changeGrade = new int[2];
        System.out.println("Enter ID to delete: ");
        Scanner input = new Scanner(System.in);
        changeGrade[0] = input.nextInt();
        System.out.println("Enter new telephone: ");
        Scanner input2 = new Scanner(System.in);
        changeGrade[1] = input2.nextInt();
        return changeGrade;
    }

    public static int[] changeStatus() {
        int[] changeStatus = new int[2];
        System.out.println("Enter ID to delete: ");
        Scanner input = new Scanner(System.in);
        changeStatus[0] = input.nextInt();
        System.out.println("Enter full name(ФИО), phone number, grade, status separated by a space:");
        Scanner input2 = new Scanner(System.in);
        changeStatus[1] = input2.nextInt();
        return changeStatus;
    }

    public static void showRES(String[] info) {
        List<String> numbers = Arrays.asList(info);
        ListIterator<String> it = numbers.listIterator();
        while (it.hasNext()) {
            System.out.println(it.nextIndex() + " " + it.next());
        }
    }

    public static String[] addInfo() {
        System.out.println("Enter full name(ФИО), phone number, grade, status separated by a space: ");
        Scanner input = new Scanner(System.in);
        String[] inInfo = input.nextLine().split(" ");
        return inInfo;
    }

    public static int newInfo() {
        System.out.println("Do you need to add new information: ");
        System.out.println("Enter 1 - no or 2 - yes: ");
        Scanner input = new Scanner(System.in);
        int newInfo = input.nextInt();
        return newInfo;
    }

    public static void showExportTxt() {
        System.out.println("The file has been exported to txt format. ");
    }

}

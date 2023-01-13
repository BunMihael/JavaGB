package oopHW.HW2.FirstV;

import java.util.Scanner;
import java.util.Set;

public class View {
    public static int showMenu() {
        System.out.println("\nMenu");
        System.out.println("\t1 - Show family tree (if already written).");
        System.out.println("\t2 - Write family tree.");
        System.out.println("\t3 - Find a person and his parents.");
        System.out.println("\t4 - Find a person and his children.");
        System.out.println("\t5 - Family tree printout to text file.");
        System.out.println("\t6 - Show family tree(example).");
        System.out.println("\t7 - Exit.");
        System.out.println("Please choose the desired item: ");
        return choice();
    }

    public int familyAmount() {
        System.out.println("Please write a number how many people will be recorded in the genealogical tree.");
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    public String[] setParents(int amount) {
        String[] names = new String[amount];
        int count = 1;
        System.out.println("Now you will write down the genealogical tree of the family one by one.");
        Scanner input = new Scanner(System.in);
        System.out.println("First write the name, surname and date of birth of the youngest in the family.");
        System.out.println("in the family, separated by a space:\n");
        names[0] = input.nextLine();
        if (amount < 8) {
            for (int i = 1; i < amount; i = i + 2) {
                father(names[i - count]);
                names[i] = input.nextLine();
                mother(names[i - count]);
                names[i + 1] = input.nextLine();
                count++;
            }
        } else {
            System.out.print("This program is not yet able to record such a number of relatives.");
            return null;
        }
        return names;
    }

    private void father(String names) {
        System.out.printf("Please enter the first and last name of %s father separated by a space.", names);
        System.out.print("If you do not know the first or last name, write: unknown.\n");
    }

    private void mother(String names) {
        System.out.printf("Please enter the first and last name of %s mother separated by a space.", names);
        System.out.print("If you do not know the first or last name, write: unknown.\n");
    }

    public void printTree(String[] tree, int amount) {
        if (amount < 4) {
            System.out.printf("\t\t\t\t\t|%s (child)|\n", tree[0]);
            System.out.printf("\t\t\t\t\t\t/                       \\\n");
            System.out.printf("\t\t|%s (father)|                  |%s (mother)|\n", tree[1], tree[2]);
            System.out.println("\t\t-----------------------------------\n");
        } else {
            System.out.printf("\t\t\t\t\t|%s (child)|\n", tree[0]);
            System.out.printf("\t\t\t\t\t\t/                       \\\n");
            System.out.printf("\t\t|%s (father)|            |%s (mother)|\n", tree[1], tree[2]);
            System.out.printf("\t\t\t/                  \\                              /                        \\\n");
            System.out.printf("|%s (grandfather)|     |%s (grandmother)|" +
                    "   |%s (grandfather)|     |%s (grandmother)|\n", tree[3], tree[4], tree[5], tree[6]);
            System.out.println("-----------------------------------------------\n");
        }
    }

    public static int choiceTree() {
        System.out.println("Do you want to print what you have written or do you want to print an example?");
        System.out.println("1 - To print your family tree.\n2 - To print a family tree example");
        int answer = choice();
        if (answer < 3) {
            return answer;
        } else {
            System.out.println("Error, please enter number from 1 to 2");
        }
        return answer;

    }

    protected static int choice() {
        int answer = 0;
        boolean check = false;
        Scanner input = new Scanner(System.in);
        while (!check) {
            while (!input.hasNextInt()) {
                System.out.println("You didn't enter a number, please try again!");
                input.next();
            }
            answer = input.nextInt();

            if (answer <= 0 && answer > 7)
                System.out.println("You entered a non-natural number or a number out of range, please re-enter!");
            else
                check = true;
        }

        return answer;

    }

    public void name() {
        System.out.println("Please write the number you need:");
    }

    public void printNames(String[] array) {
        int count = 1;
        for (String string : array) {
            System.out.println(count + ": " + string);
            count++;
        }
    }

    public void showChildren(String[] family) {
        int answer = (choice() - 1);
        if (answer == 0) {
            System.out.printf("The %s has no children.", family[0]);
        } else if (answer == 1) {
            System.out.printf("%s has a child: %s", family[1], family[0]);
        } else if (answer == 2) {
            System.out.printf("%s has a child: %s", family[2], family[0]);
        } else if (answer > 2 && answer < 5) {
            if (answer != 0) {
                System.out.printf("%s has a child: %s", family[answer], family[answer - 2]);
            } else {
                System.out.printf("%s has a child: %s", family[answer], family[answer - 3]);
            }
        } else if (answer > 4) {
            if (answer != 0) {
                System.out.printf("%s has a child: %s", family[answer], family[answer - 3]);
            } else {
                System.out.printf("%s has a child: %s", family[answer], family[answer - 4]);
            }
        }
    }

    public void showParents(String[] family) {
        int answer = (choice() - 1);
        if (answer > 2) {
            System.out.printf("Nothing is known about %s parents.", family[answer]);
        } else if (answer == 0) {
            System.out.printf("%s and %s are %s parents. %s", family[1], family[2], family[0]);
        } else if (answer == 1) {
            System.out.printf("%s and %s are %s parents. %s", family[3], family[4], family[1]);
        } else if (answer == 2) {
            System.out.printf("%s and %s are %s parents. %s", family[4], family[5], family[1]);
        }
    }

}
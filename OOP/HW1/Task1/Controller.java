package OOP.HW1.Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Controller {
    public static void runPhonebook() throws IOException {
        Model m = new Model();
        View v = new View();

        System.out.println("Выберите цифру: подкючить файл 1.phone.txt или 2.phone2.txt");
        Scanner input = new Scanner(System.in);

        m.loadPhoneBook(Input.getInputData(input));

        v.printPhonebook(m.getMap());

        System.out.println(
                "Выбор действия(выберите цифру): 1.Добавить данные, 2.Удалить данные, 3.Найти номера по фамилии, 4.Найти фамилию, "
                        +
                        "5.Сохранить, 6.Показать справочник , 7.Выход");

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String string = bf.readLine();

        while (!string.equals("7")) {
            if (string.equals("1")) {
                m.addContact(v.printTelefon(bf), v.printName(bf));
            } else {
                if (string.equals("2")) {
                    m.deleteContact(v.printTelefon(bf));
                } else {
                    if (string.equals("3")) {
                        String[] numbers = m.getNumberPhone(v.printName(bf));
                        for (String number : numbers) {
                            System.out.println(number);
                        }
                    } else {
                        if (string.equals("4")) {
                            System.out.println(m.getSurname(v.printTelefon(bf)));
                        } else if (string.equals("5")) {
                            m.saveContact(Input.getInputData(input));
                        } else {
                            if (string.equals("6")) {
                                v.printPhonebook(m.getMap());
                            }
                        }
                    }
                }
            }

            System.out.println(
                    "Выбор действия(выберите цифру):  1.Добавить данные, 2.Удалить данные, 3.Найти номера по фамилии, 4.Найти фамилию, 5.Сохранить, 6.Показать справочник , 7.Выход");
            string = bf.readLine();
        }
    }
}
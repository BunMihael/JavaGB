package OOP.HW1.Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class View {
    public void printPhonebook(HashMap<String, String> pb) {
        System.out.println("Телефонный справочник: ");
        for (Map.Entry<String, String> k : pb.entrySet()) {
            System.out.println( "Телефон: " + k.getKey() + ";  Фамилия: " + k.getValue());
        }

        System.out.println();
    }

    public String printName(BufferedReader bf) throws IOException {
        System.out.println("Введите фамилию:");
        return bf.readLine();
    }

    public String printTelefon(BufferedReader bf) throws IOException {
        System.out.println("Введите телефон:");
        return bf.readLine();
    }
}
package OOP.HW1.Task1;

import java.io.*;
import java.util.*;

public class Model {
    private static final HashMap<String, String> pb = new HashMap<>();

    public void addContact(String phone, String name) {
        pb.put(phone, name);
    }

    public void deleteContact(String phone) {
        pb.remove(phone);
    }

    public void saveContact(int number) throws IOException {
        String path1 = "phone.txt";
        String path2 = "phone2.txt";
        String path;

        if (number == 1) {
            path = path1;
        } else {
            path = path2;
        }
        BufferedWriter writer = new BufferedWriter(new FileWriter(path));
        for (Map.Entry<String, String> k : pb.entrySet()) {
            writer.write(k.getKey() + " " + k.getValue() + System.lineSeparator());
        }

        writer.close();
    }

    public void loadPhoneBook(int numberInt) throws IOException {
        ArrayList<String> ar = new ArrayList<>();
        String path1 = "phone.txt";
        String path2 = "phone2.txt";
        String path;

        if (numberInt == 1) {
            path = path1;
        } else {
            path = path2;
        }

        File file = new File(path);

        if (file.exists()) {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String string;
            while ((string = reader.readLine()) != null) {
                String[] stringsArray = string.split(";");
                if (numberInt == 1) {
                    pb.put(stringsArray[0], stringsArray[1]);

                } else {
                    if (stringsArray[0].equals("")) {
                        continue;
                    }
                    ar.add(stringsArray[0]);
                }
            }

            System.out.println(ar);
            int count = 0;

            for (int i = 0; i < ar.size() - count; i++) {
                pb.put(ar.get(i + count), ar.get(i + 1 + count));
                count++;
            }

            reader.close();
        }
    }

    public String getSurname(String number) {
        String result = pb.get(number);

        if (result == null)
            return "абонент с таким номером не найдей";

        return result;
    }

    public String[] getNumberPhone(String surname) {
        List<String> result = new ArrayList<>();

        for (Map.Entry entry : pb.entrySet()) {
            if (surname.equalsIgnoreCase((String) entry.getValue())) {
                result.add((String) entry.getKey());
            }
        }
        if (result.size() == 0)
            result.add("абонент с такой фамилией не найден");

        return result.toArray(new String[0]);
    }

    public HashMap<String, String> getMap() {
        return pb;
    }
}
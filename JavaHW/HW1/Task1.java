package JavaHW.HW1;

import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {

        inputData();
        String data = readData();
        try (Scanner in = new Scanner(data)) {
            String firstLine = in.nextLine();
            String secondLine = in.nextLine();

            int aWordFirstLine = firstLine.indexOf("a");
            String a = "";
            String b = "";
            if (aWordFirstLine == -1) {
                b = firstLine.replaceAll("\\s+", "").replaceAll("b", "");
                a = secondLine.replaceAll("\\s+", "").replaceAll("a", "");
            } else {
                a = firstLine.replaceAll("\\s+", "").replaceAll("a", "");
                b = secondLine.replaceAll("\\s+", "").replaceAll("b", "");
            }
            int result = exponentiation(a, b);
            outputData(result);
            System.out.println(result);
        }
    }

    public static String readData() {

        File file = new File("input.txt");

        try (FileReader fr = new FileReader(file)) {
            char[] chars = new char[(int) file.length()];
            fr.read(chars);

            String fileContent = new String(chars);
            return fileContent;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void inputData() {
        try {
            File file = new File("input.txt");

            if (!file.exists())
                file.createNewFile();

            PrintWriter pw = new PrintWriter(file);
            try (Scanner in = new Scanner(System.in)) {
                System.out.print("Введите первую строку(прим.'b 3'): ");
                String str = in.nextLine();
                pw.println(str);
                System.out.print("Введите вторую строку(прим.'a 4'): ");
                String strTwo = in.nextLine();
                pw.println(strTwo);
            }
            pw.close();

        } catch (Exception e) {
            System.out.println("Error" + e);
        }
    }

    public static void outputData(int solution) {
        try {
            File file = new File("output.txt");

            if (!file.exists())
                file.createNewFile();

            PrintWriter pw = new PrintWriter(file);
            pw.println(solution);
            pw.close();

        } catch (Exception e) {
            System.out.println("Error" + e);
        }

    }

    public static int exponentiation(String first, String second) {
        Integer a = Integer.valueOf(first);
        Integer b = Integer.valueOf(second);
        return (int) Math.pow(a, b);
    }
}

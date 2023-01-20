package oopHW.HW5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;

public class Model {

    public static String[] csvOpenData() throws IOException {
        String filename = "data.csv";
        try (BufferedReader fp = new BufferedReader(new FileReader(filename))) {
            String[] hdr = fp.readLine().split(";");
            return hdr;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.out.println("There was no CSV file at " + filename);
            return null;
        }
    }

    // public List<String> getRecordFromLine(String line) {
    // List<String> values = new ArrayList<String>();
    // try (Scanner rowScanner = new Scanner(line)) {
    // rowScanner.useDelimiter(";");
    // while (rowScanner.hasNext()) {
    // values.add(rowScanner.next());
    // }
    // }
    // return values;
    // }

    // public void addInfo(String line) {
    // try (PrintWriter writer = new PrintWriter(new File("data.csv"))) {

    // StringBuilder sb = new StringBuilder();
    // sb.append(line.toString());
    // writer.write(sb.toString());
    // writer.close();
    // System.out.println("done!");

    // } catch (FileNotFoundException e) {
    // System.out.println(e.getMessage());
    // }
    // }

    public void addInfo(String[] data) throws IOException {
        try (CSVWriter writer = new CSVWriter(new FileWriter("data.csv"))) {
            writer.writeNext(data);
        }
    }

    public static void delInfo(int number) throws IOException, CsvException {
        CSVReader reader2 = new CSVReader(new FileReader("data.csv"));
        List<String[]> allElements = reader2.readAll();
        allElements.remove(number);
        FileWriter sw = new FileWriter("data.csv");
        CSVWriter writer = new CSVWriter(sw);
        writer.writeAll(allElements);
        writer.close();
    }

    public static void updateTel(int index, String[] strings) throws IOException, CsvException {
        String[] listCSV = csvOpenData();
        listCSV[index] = strings.toString();
        String csv = String.join(";", listCSV);
        try (PrintWriter writer = new PrintWriter(new File("data.csv"))) {

            // StringBuilder sb = new StringBuilder();
            // sb.append(csv);
            writer.write(csv);
            writer.close();
            System.out.println("done!");

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    // public static void intoTXT(String[] data) throws IOException {
    // FileOutputStream fos = new FileOutputStream("example.txt");
    // fos.write(data.getBytes());
    // fos.flush();
    // fos.close();
    // }

    public static void intoTXT() throws IOException {
        String path = "data.csv";
        File file = new File(path);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line = "";

        String[] tempArr;
        FileWriter writer = new FileWriter("data.txt");
        while ((line = br.readLine()) != null) {
            tempArr = line.split(";");
            for (String str : tempArr) {
                writer.write(str + " ");
            }
            writer.write("\n");
        }
        writer.close();

    }
}

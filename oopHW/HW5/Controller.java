package oopHW.HW5;

import java.io.IOException;

import com.opencsv.exceptions.CsvException;

import JavaHW.HW3.Task1.model;

public class Controller {
    static void startProgram() throws IOException, CsvException {
        while (true) {
            int start = View.showMenu();
            if (start == 1) {
                String[] info = Model.csvOpenData();
                View.showRES(info);
            } else if (start == 2) {
                int addAgain = 0;
                while (addAgain != 1) {
                    String[] inInfo = View.addInfo();
                    model.addInfo(inInfo);
                    addAgain = View.newInfo();
                }
            } else if (start == 3) {
                View.showRES(Model.csvOpenData());
                int id = View.delete();
                Model.delInfo(id);
            }

            else if (start == 4) {
                View.showRES(Model.csvOpenData());
                int index = View.index();
                Model.updateTel(index, View.addInfo());
            } else if (start == 5) {
                Model.intoTXT();
                View.showExportTxt();
            } else if (start == 6) {
                System.out.println("See you later.");
                break;
            }

            else {
                System.out.println("Unknown choice.");
            }
        }

    }
}
package oopHW.HW2.FirstV;

import java.io.FileWriter;
import java.io.IOException;

public class Txt {
    public void saveTXT(String[] doc) {
        try (FileWriter writer = new FileWriter("Example.txt", false)) {
            writer.write("                       |" + doc[0] + "(child)|\n");
            writer.write("                                   /                    \\\n");
            writer.write("      | (father)" + doc[1]+ "           " + doc[2] + " (mother)|\n");
            writer.write("          /                  \\                              /                        \\\n");
            writer.write(doc[3]+ "               " + doc[4] + "          " + doc[5] + "            " + doc[6]);
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

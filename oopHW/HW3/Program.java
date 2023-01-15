package oopHW.HW3;

public class Program {

  public static void main(String[] args) {

    Word doc1 = new Word();
    doc1.setModel(new StringFormat());
    doc1.appendData("Раз два ");

    doc1.setFormat(new FunnyFormat());
    doc1.click();

    doc1.appendData("три четыре");
    doc1.setFormat(new SadFormat());
    doc1.click();

    doc1.setFormat(new NewFormat());
    doc1.click();

  }
}








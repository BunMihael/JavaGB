package oopHW.HW3;

class SadFormat implements TitleFormat {

    @Override
    public void print(String text) {
        System.out.println("😔" + " " + text);
    }

}
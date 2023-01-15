package oopHW.HW3;

class FunnyFormat implements TitleFormat {

    @Override
    public void print(String text) {
        System.out.println("😄" + " " + text);
    }

}
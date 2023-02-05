package oopHW.HW6;

public class Program {
    public static void main(String[] args) {
        Dialog d = new Dialog();
        Integer answer = d.menu();
        switch(answer){
            case 1:
                Presenter sum = new Presenter(new SumModel(), new View(), answer);
                sum.buttonClick();
                break;
            case 2:
                Presenter sub = new Presenter(new SubstractionModel(), new View(), answer);
                sub.buttonClick();
                break;
            case 3:
                Presenter div = new Presenter(new DivModel(), new View(), answer);
                div.buttonClick();
                break;
            case 4:
                Presenter mult = new Presenter(new MultModel(), new View(), answer);
                mult.buttonClick();
                break;
        }

    }
}

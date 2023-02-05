package oopHW.HW6;

public class Presenter {
    View view;
    Model model;
    Integer sign;

    public Presenter(Model m, View v, Integer s) {
        model = m;
        view = v;
        sign = s;
    }

    public void buttonClick(){
        int a = view.getValue("a: ");
        int b = view.getValue("b: ");
        model.setX(a);
        model.setY(b);
        int result = model.result();
        switch(sign){
            case 1:
                view.print(result, "sum: ");
            case 2:
                view.print(result, "substract: ");
            case 3:
                view.print(result, "divide: ");
            case 4:
                view.print(result, "multiplication: ");
            default:
                break;
        }
        
    }
}
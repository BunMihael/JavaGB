package oopHW.HW6;

public class PresenterOfT<T extends CalcModel> {
 

    View view;
    Model model;
    Integer sign;

    public PresenterOfT(T m, View v, Integer s) {
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
                break;
            case 2:
                view.print(result, "substract: ");
                break;
            case 3:
                view.print(result, "divide: ");
                break;
            case 4:
                view.print(result, "multiplication: ");
                break;
                
        }
        
    }
}

package oopHW.HW6;

public class SubstractionModel extends CalcModel {

    public SubstractionModel() {
        
    }
    // do_it
    @Override
    public int result() {
        return x - y;
    }

    @Override
    public void setX(int value) {
        super.x = value;
    }

    @Override
    public void setY(int value) {
        super.y = value;
    }

}

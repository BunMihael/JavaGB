package oopHW.HW3;

class StringFormat extends Model {

    String text = "";
  
    @Override
    protected
    String getRawData() {
      return text;
    }
  
    @Override
    void appendRawData(String t) {
      text += t;
    }
  
  }
package oopHW.HW3;

class Word {
    Model model;
  
    public void setModel(Model model) {
      this.model = model;
    }
  
    TitleFormat format;
  
    public void appendData(String text) {
      model.appendRawData(text);
    }
  
    public void setFormat(TitleFormat f) {
      format = f;
    }
  
    void click() {
      format.print(model.getRawData());
    }
  }
  
  interface TitleFormat {
    void print(String text);
  }
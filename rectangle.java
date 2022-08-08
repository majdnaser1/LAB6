package week2;

public abstract class rectangle extends shape {
    double width=1.0;
    double length=1.0;


  public rectangle() {

  }

  public rectangle(double width,double length){
      this.width=width;
      this.length=length;
  }
    public rectangle(double width,double length,String color , boolean filled){
        super(color,filled);
        this.width=width;
        this.length=length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
      return width*length;
    }
    public double getperimeter(){
      return length+width;
    }

    @Override
    public String toString() {
        return "rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}

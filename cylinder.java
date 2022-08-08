package week2;

public abstract class cylinder extends circle {
    private  double height=1.0;

    public cylinder(){

    }
    public cylinder(double radius){
        super(radius);
    }
    public cylinder(double radius, double height){
        super(radius);
        this.height=height;
    }
    public cylinder(double radius, double height,String color ){
        super(radius,color);
        this.height=height;
    }
    public double getVolume() {
        return getRadius()*height;
    }


    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

}

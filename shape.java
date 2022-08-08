package week2;

public abstract class shape {
    protected String color="red";
    protected boolean filled=true;

    public  shape(){

    }
    public shape(String color,boolean filled){
        this.color=color;
        this.filled=filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
    abstract double getArea();
    abstract double getPerimeter();

}

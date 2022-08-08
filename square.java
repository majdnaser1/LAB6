package week2;

public  abstract class square extends rectangle {
    public double side=1.0;
    public square(){

    }
    public square(double side){
        this.side=side;
    }
    public square(double side, String color, boolean filled){
        this.color=color;
        this.filled=filled;
        this.side=side;

    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public void setwidth (double side){

    }
    public void setlenghth(double length ){

    }

    @Override
    public String toString() {
        return "square{" +
                "side=" + side +
                '}';
    }
}

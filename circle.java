package week2;

import java.util.ArrayList;

public  abstract class circle extends shape implements GeometricObject {

        protected double radius=1.0;
        private int id;
        private String color;
        private double Area;

        private ArrayList<String> classList;


        public circle (double radius){
            this.radius=radius;
            this.classList=new ArrayList<>();

        }

        public circle (double radius, String color) {
            this.radius = radius;
            this.color=color;
            this.classList = new ArrayList<>();
        }
        public circle (double radius, String color,boolean filled) {
        this.radius = radius;
        this.color=color;
        this.filled=filled;
        this.classList = new ArrayList<>();
       }

        public circle() {
            this.classList=new ArrayList<>();

        }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea() {
        return Area;
    }
    public double getperimeter(){
            return getperimeter();
    }

    @Override
    public String toString() {
        return "circle{" +
                "radius=" + radius +
                ", id=" + id +
                ", color='" + color + '\'' +
                ", Area=" + Area +
                ", classList=" + classList +
                '}';
    }

}

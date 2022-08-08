package week2;

public class resizabecircle extends circle{


    public void resizabecircle(double radius){

    }

    @Override
    public String toString() {
        return "resizabecircle{" +
                "radius=" + radius +
                '}';
    }
    public void resize(int precent){
        radius*=precent/100;
    }

    @Override
    double getPerimeter() {
        return 0;
    }

}

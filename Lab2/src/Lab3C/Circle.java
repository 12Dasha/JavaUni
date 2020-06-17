package Lab3C;
import Lab3C.Rational;
import java.lang.Math;
import static java.lang.Math.PI;
public class Circle {
    private double radius;
    private Rational coor1, coor2;
    public void Circle(double r, Rational x, Rational y){
        if (r > 0) {
            radius = r;
        } else {
            System.out.println("Отрицательный диаметр!");
        }
        coor1 = x;
        coor2 = y;
    }
    public double getRadius() {
        return radius;
    }
    public Rational getCoor1(){
        return coor1;
    }
    public Rational getCoor2() {
        return coor2;
    }
    public void getEverything(){
        System.out.println("Окружность радиуса = "+radius+" с центром в точках "+"("+ coor1.toString()+"," + coor2.toString() +")");
    }
}

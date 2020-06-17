package Lab3C;

import java.util.ArrayList;
import java.util.List;

import static Lab3C.Rational.*;

public class Values {
    public double ValuesPerimeter(Circle value){
        double result;
        result = 2 * Math.PI * value.getRadius();
        return result;
    }
    public double ValuesSquare(Circle value){
        double result;
        result = Math.PI * value.getRadius() * value.getRadius();
        return result;
    }
    public Circle minSquare(Circle[] value){
        Circle mins = new Circle();
        double minsq = 0;
        for(Circle s: value){
            if(ValuesSquare(s)<minsq || minsq==0){
                minsq = ValuesSquare(s);
                mins = s;
            }
        }
        return mins;
    }
    public Circle maxSquare(Circle[] value){
        Circle maxs = new Circle();
        double maxsq = 0;
        for(Circle s : value){
            if(ValuesSquare(s)>maxsq || maxsq==0){
                maxsq = ValuesSquare(s);
                maxs = s;
            }
        }
        return maxs;
    }
    public Circle maxPerimetr(Circle[] value){
        Circle maxs = new Circle();
        double maxsp = 0;
        for(Circle s:value){
            if(ValuesPerimeter(s)>maxsp || maxsp==0){
                maxsp = ValuesPerimeter(s);
                maxs = s;
            }
        }
        return maxs;
    }
    public Circle minPerimetr(Circle[] value){
        Circle mins = new Circle();
        double minsp = 0;
        for(Circle s : value){
            if(ValuesPerimeter(s)<minsp || minsp==0){
                minsp = ValuesSquare(s);
                mins = s;
            }
        }
        return mins;
    }
    public Rational getK(Circle a, Circle b){
        Rational k;
        Rational coor11 = a.getCoor2();
        Rational coor12 = b.getCoor2();
        Rational coor21 = a.getCoor1();
        Rational coor22 = b.getCoor1();
        Rational r1 = sub(coor11, coor12);
        Rational r2 = sub(coor21, coor22);
        k = div(r1,r2);
        return k;
    }
   /* public Rational getB(Circle a, Circle b){
        Rational bk;
        Rational k = getK(a,b);
        Rational coory = a.getCoor2();
        Rational coorx = a.getCoor1();
        Rational kx = mul(k,coorx);
        bk = sub(coory,kx);
        return bk;
    }*/
    public List<Circle> lieOnLine(Circle[] value, int n){
        List<Circle> result =new ArrayList<Circle>();
        Circle current = new Circle();
        Circle prenext =new Circle();
        Circle next = new Circle();
        for(int i=0; i<n-2; i++){
            current = value[i];
            prenext = value[i+1];
            next = value[i+2];
            Rational k1 = getK(current, prenext);
            Rational k2 = getK(prenext, next);
            if(equalsR(k1,k2)) {
                result.add(current);
                result.add(prenext);
                result.add(next);
            }
        }
        return result;
    }
    public void testing(){
        Rational x = new Rational(1,2);
        Rational y = new Rational(1,2);
        Rational x1 = new Rational(1,1);
        Rational y1 = new Rational(3,2);
        Rational x2 = new Rational(3,2);
        Rational y2 = new Rational(5,2);
        Rational x3 = new Rational(6,2);
        Rational y3 = new Rational(7,5);
        Circle one = new Circle();
        Circle two = new Circle();
        Circle three = new Circle();
        Circle four = new Circle();
        one.Circle(2,x,y);
        two.Circle(3, x1, y1);
        three.Circle(4,x2,y2);
        four.Circle(1,x3,y3);
        Circle[] array = {one, two,three,four};
        System.out.println("Все окружности ");
        for(Circle s:array){
            s.getEverything();
        }
        System.out.println("");
        System.out.println("Наибольшая и наименьшая площадь");
        {minSquare(array).getEverything();
        System.out.println("Наименьшая площадь среди всех окружностей " + ValuesSquare(minSquare(array)));
        maxSquare(array).getEverything();
        System.out.println("Наибольшая площадь среди всех окружностей " + ValuesSquare(maxSquare(array)));
        }
        System.out.println("");
        System.out.println("Наибольший и наименьший периметр");
        {minPerimetr(array).getEverything();
        System.out.println("Наименьший периметр среди всех окружностей " + ValuesPerimeter(minPerimetr(array)));
        maxPerimetr(array).getEverything();
        System.out.println("Наибольший периметр среди всех окружностей " + ValuesPerimeter(maxPerimetr(array)));
        }
        System.out.println("");
        System.out.println("Окружности, которые лежат на одной прямой ");
        for(Circle s : lieOnLine(array,4)) s.getEverything();
    }
}

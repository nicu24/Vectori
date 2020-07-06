import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;

@Log4j
@AllArgsConstructor
@Getter
@Setter
public class Vector{
    Point p1;
    Point p2;

    static Vector add(Vector v1,Vector v2)
    {

        Point p1x = new Point(v1.getP1().getX()+v2.p1.getX(),v1.getP1().getY()+v2.getP1().getY());
        Point p2x = new Point(v1.getP2().getX()+v2.getP2().getX(),v1.getP2().getY()+v2.getP2().getY());

        Vector v3 = new Vector(p1x,p2x);


        return v3;
    }

    static Vector diff(Vector v1,Vector v2)
    {

        Point p1x = new Point(v1.getP1().getX()-v2.getP1().getX(),v1.getP1().getY()-v2.getP1().getY());
        Point p2x = new Point(v1.p2.getX()-v2.p2.getX(),v1.p2.getY()-v2.p2.getY());

        Vector v3 = new Vector(p1x,p2x);


        return v3;
    }

    static double mod(Vector v1)
    {
        double a = v1.getP1().getX()-v1.getP2().getX();
        double b =v1.getP1().getY()-v1.getP2().getY();
        a=a*a;
        b=b*b;

        double rez = Math.sqrt(a+b);

        return rez;
    }

    public double grad(Vector v1){
       double a=Math.pow((v1.getP1().getX()-v1.getP2().getX()),2);
       double b=Math.pow((v1.getP1().getY()-v1.getP2().getY()),2);
       double ipotenuza=Math.sqrt(a+b);
       double radian = Math.cos(  (v1.getP1().getX()-v1.getP2().getX())/ipotenuza);
       double grade = Math.toDegrees(radian);
        return grade;
    }


}



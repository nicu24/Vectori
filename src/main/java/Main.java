import lombok.extern.log4j.Log4j;


import java.util.logging.Logger;

@Log4j
public class Main {
   final static Logger logger = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
        double resultModule;
        double grade;
        Point p1 = new Point(2,5);
        Point p2 = new Point(2,3);

        Point p3 = new Point(0,0);
        Point p4 = new Point(4,4);

        Vector v1 = new Vector(p1,p2);
        Vector v2 = new Vector(p3,p4);

        Vector v3 = Vector.add(v1,v2);
        Vector v4 = Vector.diff(v1,v2);
        resultModule = Vector.mod(v2);
        grade = v2.grad(v2);

        logger.info(" Add:" +" x1: " +v3.p1.getX()+" y1: "+v3.p1.getY());
        logger.info(" Add:" +" x2: " +v3.p2.getX()+" y2: "+v3.p2.getY());

        logger.info(" Diff:" +" x1: " +v4.p1.getX()+" y1: "+v4.p1.getY());
        logger.info(" Diff:" +" x2: " +v4.p2.getX()+" y2: "+v4.p2.getY());

        logger.info(" Resul Module: "+resultModule);

        logger.info("Grade: "+ grade );
        

    }
}

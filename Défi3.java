import java.util.Scanner;
import java.util.Calendar;
public class Défi3 {

        public static void faitUnBeauCercle(){
        StdDraw.setPenRadius(0.005);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.filledCircle(0, 0, 1.1);
        StdDraw.setPenColor(StdDraw.BLUE);
        double n = 12;
        double indice = 0;
        while(indice != 12){
            double a = ((2*Math.PI)/n)*indice ;
            indice +=1;
            double x = Math.cos(a);
            double y = Math.sin(a);
            StdDraw.filledCircle(x,y,0.05);
        }
    }

    public static void AiguilleDesSecondes(){
        int sec = Calendar.getInstance().get(Calendar.SECOND) ;
        double n = 60;
        double a3 = -((2*Math.PI)/n)*sec;
        double x3 = Math.cos(a3);
        double y3 = Math.sin(a3);
        StdDraw.setPenColor(StdDraw.YELLOW);
        StdDraw.line(0, 0, x3, y3); 
        StdDraw.pause(1000);;
    }

    public static void AiguilleDesMinutes(){
        int min = Calendar.getInstance().get(Calendar.MINUTE) ;
        double n =90;
        double a2 = -((2*Math.PI)/n)*min;
        double x2 = Math.cos(a2);
        double y2 = Math.sin(a2);
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.line(0, 0, x2/1.5, y2/1.5); 
    }

    public static void AiguilleDesHeures(){
        int hours = Calendar.getInstance().get(Calendar.HOUR) ;
        double n = 15;
        double a1 = -((2*Math.PI)/n)*hours;
        double x1 = Math.cos(a1);
        double y1 = Math.sin(a1);
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.line(0, 0, x1/2, y1/2); 
    }

    public static void main(String[] args) {
        StdDraw.setYscale(-1.25, 1.25);
        StdDraw.setXscale(-1.25, 1.25);
        faitUnBeauCercle();
        while(true){
            faitUnBeauCercle();
            AiguilleDesMinutes();
            AiguilleDesHeures();
            AiguilleDesSecondes();
        }
    }

}
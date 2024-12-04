import java.util.Scanner;
public class Défi2 {
    public static void main(String[] args) {
        StdDraw.setYscale(-1.25, 1.25);
        StdDraw.setXscale(-1.25, 1.25);
        StdDraw.setPenRadius(0.005);
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.circle(0, 0, 1);

        faitUnBeauCercle();
        faitDesBellesLignes();
    }

    public static void faitUnBeauCercle(){
        StdDraw.setPenColor(StdDraw.BLACK);
        double n = 20;
        double indice = 0;
        while(n != 0){
            double a = ((2*Math.PI)/n)*indice ;
            indice +=1;
            double x = Math.cos(a);
            double y = Math.sin(a);
            StdDraw.filledCircle(x,y,0.03);
        }
    }

    public static void faitDesBellesLignes(){
        double indice = 0;
        double indice2 = 0;
        double n = 20;

        while (0 < n-1) {
            double a1 = ((2*Math.PI)/n)*indice ;
            double x1 = Math.cos(a1);
            double y1 = Math.sin(a1);
            indice -=1;
            double p = 20;
            while (0 < p-1){
                double a2 = ((2*Math.PI)/n)*indice2 ;
                double x2 = Math.cos(a2);
                double y2 = Math.sin(a2);
                indice2 -=1;
                tireProba();
                if (BtireProba == true){
                    StdDraw.line​(x1, y1, x2, y2);
                }
            }
        }

        boolean tireProba(double p){
            double p = 50;
            double proba = Math.random() * 100;
            boolean BtireProba = false ;
            if (proba <= p){
                System.out.println("Plus petit que " + proba);
                BtireProba = false;
                return BtireProba;
            }
            else{
                System.out.println("Plus grand que " + proba);
                BtireProba = true;
                return BtireProba;
            }
        }
    }
}
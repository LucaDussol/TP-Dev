public class Defi4 {

    public static void main(String[] args) {
        StdDraw.setXscale(-2,2);
        StdDraw.setYscale(-2,2);
        int n = 200;
        int i=1;
        double tt=1;
        double pa = 0.1;
        int limite = 200;
        int limiteT = 60;

        while (true) {
            StdDraw.clear();             //raytracer

            StdDraw.circle(0, 0, 1);
            n=animTT(n,limite);           //raytracer
            tt=animTTtt(tt,limiteT, pa);  //raytracer

            double[][] co = new double [2][n];
            
            calc(n, co);
            drawTT(n,tt,co);             //raytracer

            // raytracer(n,co,i);              //sphere
            i += 1;

            if (n<40) {
                repPoints(n);
            }
            

            StdDraw.show();
            StdDraw.pause(32);
            StdDraw.enableDoubleBuffering();
        }
        
    }


        public static void repPoints(int n) {
            for (int i = 0; i < n; i++) {
                double c = ((2 * Math.PI) / n) * i;
                double x = Math.cos(c);
                double y = Math.sin(c);
    
                if (n < 40) {
                    StdDraw.filledCircle(x, y, 0.02);
                    StdDraw.text(x * 1.2, y * 1.2, "" + i);
                }
            }
        }

        static void afficherTab(int[] tab){
            for (double i : tab){
                System.out.print(i);
                System.out.print(" ");
            }
            System.out.println();
        }


        static void afficherTab2D(double[][] tab) {
            for (double[] ligne : tab) { 
                for (double valeur : ligne) { 
                    System.out.print(valeur);
                    System.out.print(" ");
                }
                System.out.println(); 
            }
        }

        public static double[][] calc(int n, double[][] co){
            for (int i = 0; i < n; i++) {
                double c = ((2*Math.PI)/n)*i;
                double x = Math.cos(c);
                double y = Math.sin(c);
                co[0][i]= x;
                co[1][i]= y;
            }
            // afficherTab2D(co);
            return(co);
        }

        public static void drawTT(int n, double tt, double[][] co) {
            for (int i = 0; i < n; i++) {
                int val = (int) (i * tt) % n;
                StdDraw.line(co[0][i], co[1][i], co[0][val], co[1][val]);
            }
        }

        public static int animTT(int n, int limite){
            if (n<limite) {
                n += 1;
            }
            return n;
        }
            
        public static double animTTtt(double tt, int limiteT,double pa){
            if (tt<limiteT) {
                tt += pa;
            }
            StdDraw.text(1.5,1.5, "tt = " + Math.round(tt*100)/100.0 );
            return tt;
        }

        public static void raytracer(int n,double[][] co,int i){
            StdDraw.line(co[0][0], co[1][0], co[0][i], co[1][i]);
            int val = (int) (i*2)%n;
            StdDraw.line(co[0][i], co[1][i], co[0][val], co[1][val]);
        }
}
           


    

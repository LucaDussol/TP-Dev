class Defi1{
    public static void main(String[] args) {
        StdDraw.setYscale(-1.25, 1.25);
        StdDraw.setXscale(-1.25, 1.25);
        preCalc();
        StdDraw.circle(0,0,1);
    }

    public static void preCalc(){
        int i = 0;
        int j = 0;
        double[][] tableau = new double[16][16];
        StdDraw.setPenColor(StdDraw.BLACK);
        double n = 15;
        double indice = 0;
        while(indice != 15){
            double a = ((2*Math.PI)/n)*indice ;
            indice +=1;
            double x = Math.cos(a);
            double y = Math.sin(a);
            i += 1;
            j += 1 ;
            tableau[i][j] = x;
            StdDraw.filledCircle(x,y,0.03);
        }
    }    
}

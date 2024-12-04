class defi1{
    public static void main(String[] args) {
        StdDraw.setYscale(-2.25, 2.25);
        StdDraw.setXscale(-2.25, 2.25);

        int t=0;

        while(true){
            trace(t);
            cercle(t);
            t++;
        }
    }
    

    static void trace(int t){
        double x1 = 1*Math.cos(2*Math.PI*1*t/300+0.75);
        double y1 = 1*Math.sin(2*Math.PI*1*t/300+0.75);
        double x2 = x1+0.5*Math.cos(2*Math.PI*4*t/300+1.5);
        double y2 = y1+0.5*Math.sin(2*Math.PI*4*t/300+1.5);
    }


    static void cercle(int t){

        StdDraw.clear();
        StdDraw.filledCircle(0,0,0.03); //Petit point au milieu
        StdDraw.circle(0,0,1); //Cercle grand


        double x1 = 1*Math.cos(2*Math.PI*1*t/300+0.75);
        double y1 = 1*Math.sin(2*Math.PI*1*t/300+0.75);
        StdDraw.filledCircle(x1,y1,0.03);

            
        StdDraw.circle(x1,y1,0.5); 

        double x2 = x1+0.5*Math.cos(2*Math.PI*4*t/300+1.5);
        double y2 = y1+0.5*Math.sin(2*Math.PI*4*t/300+1.5);

        StdDraw.filledCircle(x2,y2,0.03);


        StdDraw.show();
        StdDraw.pause(32);
        StdDraw.enableDoubleBuffering();
    }
}
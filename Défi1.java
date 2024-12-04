public class Défi1 {
    public static void main(String[] args) {
        int c = 0;
        double halfWidth = 0.04;
        double x = 0;
        while (x <= 1){
            double y = 0;
            x = x + 0.04;
            while (y <= 1){
                if (c == 0){
                    StdDraw.setPenColor(255,0,0);
                    c = 1;
                }
                else{
                    StdDraw.setPenColor(0,0,0); 
                    c = 0;              
                }
                StdDraw.filledSquare(x,y,halfWidth);
                y = y + 0.04;
            }
        }



    }
}
public class Rebond {
    public static void main(String[] args) {
        StdDraw.setYscale(-1.25, 1.25);
        StdDraw.setXscale(-1.25, 1.25);
        double y = 0;
        double x=0;
        int départ = 0;
        int relache = 0;
        while(true){
            //mettre avant le dessin

            double dx = 0;
            double dy = 0;

            while (StdDraw.isMousePressed() == true){
                StdDraw.clear();
                StdDraw.line(0.0, 0.0, StdDraw.mouseX(), StdDraw.mouseY());
                StdDraw.filledCircle(x, y, 0.05);
                relache = 1;
                StdDraw.show();
                StdDraw.pause(32);
                StdDraw.enableDoubleBuffering();
            }
            if (relache == 1){
                    dx = -StdDraw.mouseX() /10;
                    dy = -StdDraw.mouseY() /10;
                    départ = 1;
            }
            StdDraw.show();
            StdDraw.pause(30);
            StdDraw.enableDoubleBuffering();

            StdDraw.filledCircle(x, y, 0.05);
            while (départ == 1){

                StdDraw.clear();

                StdDraw.filledCircle(x, y, 0.05);
                



            //Modification Y

                y = y + dy;
                //Rebond plafond et sol
                if( y > 1.20 ){
                    dy = dy - 2*dy;
                }
                if( y < -1.20 ){
                    dy = dy - 2*dy;
                }

                //Ne pas disparaitre dans le sol
                if (dy < 0.002){
                    if(y < -1.20){
                        y = -1.20;
                    }
                }

                //Ralentir air
                if(dy > 0){
                    dy = dy -0.002;
                }

                if(dy < 0){
                    dy = dy -0.001;
                }


            //Modification X

                x= x + dx;
                //Rebondir Mur
                if( x > 1.20 ){
                    dx = -0.05;
                }

                if( x < -1.20 ){
                    dx = 0.05;
                }
                //Ralentir Air
                if(dx > 0){
                    dx = dx -0.00005;
                }

                if(dx < 0){
                    dx = dx +0.00005;
                }
            
                if (y==-1.20){
                    if(dx > 0){
                    dx = dx -0.001;
                }

                if(dx < 0){
                    dx = dx +0.001;
                }
                }
                StdDraw.show();
                StdDraw.pause(32);
                StdDraw.enableDoubleBuffering();
            }

        }
    }
}
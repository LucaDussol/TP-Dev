class Koch {

    static void vonKoch(int n,         
                        float xa, float ya, 
                        float xb, float yb)   
    {
        if (n == 0) {
            StdDraw.line(Math.round(xa), Math.round(ya),
			 Math.round(xb), Math.round(yb));
        } else {
            float xc = (2 * xa + xb) / 3;
            float yc = (2 * ya + yb) / 3;
            float xd = (xa + 2 * xb) / 3;
            float yd = (ya + 2 * yb) / 3;

            float xm = (xa + xb)/2;
            float ym = (ya + yb)/2;
            float xe = xm - (yb - ya)/(2*(float)Math.sqrt(3));
            float ye = ym + (xb - xa)/(2*(float)Math.sqrt(3));
            vonKoch(n - 1, xa, ya, xc, yc);
            vonKoch(n - 1, xc, yc, xe, ye);
			vonKoch(n - 1, xe, ye, xd, yd);
			vonKoch(n - 1, xd, yd, xb, yb);
        }
    }


    public static void main(String[] args) {

	int rec = 2 ;
	int flocon = 1 ;
	final int width = 600 ;
	final int  height = 300 ;

	float xa, ya, xb, yb ;

	StdDraw.setCanvasSize(width, height);
	StdDraw.setXscale(0.0, (double)width) ;
	StdDraw.setYscale(0.0, (double)height) ;


	switch(flocon){
	case 3:
	    float c = (float)Math.min(width - 4,
				      (height - 4) * Math.sqrt(3) / 2);
	    xa = width / 2f;
	    ya = (float)(height - 2 * c / Math.sqrt(3)) / 2f;
	    xb = (width - c) / 2f;
	    yb = (float)(ya + c * Math.sqrt(3) / 2);
	    float xc = xb + c;
	    float yc = yb;
	    vonKoch(rec, xa, ya, xb, yb);
	    vonKoch(rec, xb, yb, xc, yc);
	    vonKoch(rec, xc, yc, xa, ya);
	    break ;
	default:
	    xa = 0.0f ;
	    ya = 10.0f;
	    xb = (float)width ;
	    yb = 10.0f;
	    vonKoch(rec, xa, ya, xb, yb);
	    break ;
        }
    }
}
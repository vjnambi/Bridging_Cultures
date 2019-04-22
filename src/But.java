public class But extends Pic {
    int targ;

    public But(double x, double y, String src, double w, double h, int targ){
        this.x=x;
        this.y=y;
        this.src=src;
        this.w=w;
        this.h=h;
        this.targ=targ;
    }

    public boolean checkClick(){
        return 2*Math.abs(x-StdDraw.mouseX())<w && 2*Math.abs(y-StdDraw.mouseY())<h;
    }

}

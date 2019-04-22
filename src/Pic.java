public class Pic extends Obj {
    double w;
    double h;

    public Pic(double x, double y, String src, double w, double h){
        this.x=x;
        this.y=y;
        this.src=src;
        this.w=w;
        this.h=h;
    }

    public Pic(){

    }

    public void draw(){
        StdDraw.picture(x,y,src,w,h);
    }
}

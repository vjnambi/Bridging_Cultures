import java.awt.*;
import java.util.ArrayList;

public class Text extends Pic {
    int size;
    int w;

    public Text(double x, double y, String src,int size, int w){
        this.x=x;
        this.y=y;
        this.src=src;
        this.size=size;
        this.w=w;
    }

    public void draw(){
        StdDraw.setFont(new Font(Font.MONOSPACED, Font.PLAIN, (int)(size*Page.scaling)));
        if(w == -1){
            StdDraw.text(x,y,src);
        } else {
            ArrayList<String> lines = new ArrayList<String>();
            int width = w;
            String boop = src + " ";
            while (!boop.isEmpty()) {
                int cutoff = boop.indexOf(' ');
                while (boop.indexOf(' ', cutoff + 1) < width && boop.indexOf(' ', cutoff + 1) != -1) {
                    cutoff = boop.indexOf(' ', cutoff + 1);
                }
                lines.add(boop.substring(0, cutoff));
                boop = boop.substring(cutoff + 1);
            }
            for (int i = 0; i < lines.size(); i++) {
                StdDraw.text(x + (lines.get(i).length()) * size * 0.00019, y - (i * 0.001 * size), lines.get(i));
            }
        }
    }

}

import java.awt.*;
import java.util.ArrayList;

public class Page {
    ArrayList<Obj> objs = new ArrayList<Obj>();
    static ArrayList<Page> pages = new ArrayList<Page>();
    static double scaling = 1;

    public static void main(String[] args){
        StdDraw.setCanvasSize((int)((2048+1144)*scaling),(int)((1150+470)*scaling));
        StdDraw.setXscale(-1,1);
        StdDraw.setYscale(-1,1);

        Pic pause = new Pic(-.97,.94,"Button.png",.05,.1);
        Pic bars = new Pic(-.97,.95,"pause.png",.05,.08);

        Pic Title = new Pic(0,0,"Title.png",2,2);
        But Start = new But(0,-0.5,"Button.png",1,0.5,1);
        Text Go = new Text(0,-0.5,"Start",144,-1);

        Pic Viewer = new Pic(0,0,"Viewer.png",2,2);
        Pic BG = new Pic(-0.25,0,"Background.png",1.375,1.75);
        Text text1 = new Text(0.54,0.875,"You have been deployed to a foreign country to distribute nutrition packages to the hungry.",72,16);
        But button10 = new But(.75,-.35,"Button.png",.45,.225,2);
        Text text10 = new Text(0.75,0.-.35,"Next",72,-1);

        Pic Kirbo = new Pic(-0.25,-0.5,"Man.png",0.5,1);
        Text text2 = new Text(0.54,0.875,"Someone approaches you and stares at you.",72,16);
        But button20 = new But(.75,-.35,"Button.png",.45,.225,3);
        But button21 = new But(.75,-.6,"Button.png",.45,.225,4);
        But button22 = new But(.75,-.85,"Button.png",.45,.225,4);
        Text text20 = new Text(0.75,0.-.35,"Say \"Hi\"",72,-1);
        Text text21 = new Text(0.75,0.-.6,"Ignore him",72,-1);
        Text text22 = new Text(0.75,0.-.85,"Give him food",72,-1);

        Text text3 = new Text(0.54,0.875,"He replies \"Hi! Can you help me with my Lyme disease?\" ",72,16);
        But button30 = new But(.75,-.35,"Button.png",.45,.225,5);
        Text text30 = new Text(0.75,0.-.35,"\"Certainly!\"",72,-1);


        Text text4 = new Text(0.54,0.875,"He seems upset by what you did.",72,16);
        But button40 = new But(.75,-.35,"Button.png",.45,.225,6);
        Text text40 = new Text(0.75,0.-.35,"Next",72,-1);

        Pic popup = new Pic(0,0,"popup.png",1,1.5);
        Text pass = new Text(0,.6,"Success",144,-1);
        Text fake = new Text(0,0,"Try listening to him",72,-1);
        Text fakeo = new Text(0,-.072,"before judging him",72,-1);
        But mmmhmm = new But(0,-.6,"Button.png",.45,.225,0);
        Text exit = new Text(0,-.6,"Exit",72,-1);
        Text fail = new Text(0,.6,"Failure",144,-1);
        Text real = new Text(0,0,"You have demonstrated cultural",72,-1);
        Text realo = new Text(0,-.072,"humility well and helped the man",72,-1);
        But noway = new But(0,-.6,"Button.png",.45,.225,2);
        Text retry = new Text(0,-.6,"Retry",72,-1);
        Text paused = new Text(0,.6,"Paused",144,-1);
        But huh = new But(0,-.6,"Button.png",.45,.225,2);
        Text cont = new Text(0,-.6,"Continue",72,-1);







        Obj[] objs0 = {Title,Start,Go};

        Obj[] objs1 = {BG,Viewer,button10,text10,text1,pause,bars};

        Obj[] objs2 = {BG,Kirbo,Viewer,button20,button21,button22,text20,text21,text22,text2,pause,bars};

        Obj[] objs3 = {BG,Kirbo,Viewer,text3,button30,text30,pause,bars};

        Obj[] objs4 = {BG,Kirbo,Viewer,text4,button40,text40,pause,bars};

        Obj[] objs5 = {BG,Kirbo,Viewer,popup,pass,mmmhmm,exit,real,realo,pause,bars};

        Obj[] objs6 = {BG,Kirbo,Viewer,popup,fail,noway,retry,fake,fakeo,pause,bars};

        Obj[] objs7 = {BG,Kirbo,Viewer,button20,button21,button22,text20,text21,text22,text2,pause,bars,popup,paused,huh,cont};




        new Page(objs0);
        new Page(objs1);
        new Page(objs2);
        new Page(objs3);
        new Page(objs4);
        new Page(objs5);
        new Page(objs6);
        new Page(objs7);

        int currentPageNo = 0;
        boolean prevMouse = false;
        while(true) {
            Page currentPage = pages.get(currentPageNo);
            for (int i = 0; i < currentPage.objs.size(); i++) {
                Obj j = currentPage.objs.get(i);
                j.draw();
            }
            if(StdDraw.mousePressed()){
                if(!prevMouse) {
                    for (int i = 0; i < currentPage.objs.size(); i++) {
                        Obj j = currentPage.objs.get(i);
                        if(j instanceof But){
                            But k = (But)j;
                            if(k.checkClick()){
                                currentPageNo=k.targ;
                                i=currentPage.objs.size();
                            }
                        }
                    }
                }
                prevMouse=true;
            } else {
                prevMouse=false;
            }
            StdDraw.show(5);
            StdDraw.clear();
        }
    }

    public Page(){

    }

    public Page(Obj[] objs){
        for(int i=0;i<objs.length;i++){
            this.objs.add(objs[i]);
        }
        pages.add(this);
    }





}

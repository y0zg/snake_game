package com;
//
//
//
public class Display{

    private String lines[][] = new String[4][20];
    private String hWalls = "+--------------------+";
    private String vWalls = "|";
    private int linepos, pos;


    public Display(int linepos, int pos){
        this.pos = pos - 1;
        this.linepos = linepos - 1;
    }
    public void drawImage(){

        for(int d1=0;d1<lines.length;d1++){
            for(int d2=0;d2<lines[d1].length;d2++){
                lines[d1][d2]="#";
            }
        }
        lines[linepos][pos]="Q";

        System.out.println(hWalls);
        for(int x2=0;x2<lines.length;x2++){
            System.out.print(vWalls);
            for(int x3=0;x3<lines[x2].length;x3++){
                System.out.print(lines[x2][x3]);
            }

            System.out.println(vWalls);
        }
        System.out.println(hWalls);
    }
}



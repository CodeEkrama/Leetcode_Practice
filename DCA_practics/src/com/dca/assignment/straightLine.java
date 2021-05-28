package com.dca.assignment;

public class straightLine {
	public static boolean checkStraightLine(int[][] coordinates) {
        int len=coordinates.length;
        //y=mx+c
        //y=mx
        int p1[]=coordinates[0];
        int p2[]=coordinates[1];
        double m= (double) (p2[1]-p1[1])/(p2[0]-p1[0]);
        //c=y-mx;
        int count=0;
        double y=p2[1];
        double x=p2[0];
        double c=y-(m*x);
        for(int i=0;i<len;i++){
            
            int p[]=coordinates[i];
            //check if this point satisfies y=mx+c
            if(p[1]==((m*p[0])+c)){
               count++; 
            }
        }
        if(count==len)
            return true;
        else
            return false;
    }
	public static void main(String[] args) {
		int a[][]=new int[][] {{0,0},{1,0},{2,0}};
		System.out.println(checkStraightLine(a));
	}
}

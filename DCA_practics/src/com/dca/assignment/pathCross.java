package com.dca.assignment;
import java.util.*;
public class pathCross {
	public static boolean isPathCrossing(String path) {
        int x=0,y=0;
        Map<Integer,Point> co=new HashMap<>();
        String p="";
        co.put(0, new Point(0,0));
        p="00@#";
        String dir[]=path.split("");
        for(int i=0;i<dir.length;i++){
            if(dir[i].equals("E")){ 
                //add to y but keep x same
                x++;
                co.put(i+1, new Point(x,y));
//                if(p.contains(x+""+y+"@#"))
//                    return true;
//                p+=x+""+y+"@#";
            }
            if(dir[i].equals("N")){
                y++;
                co.put(i+1, new Point(x,y));
//                if(p.contains(x+""+y+"@#"))
//                    return true;
//                p+=x+""+y+"@#";
            }
            if(dir[i].equals("W")){
                x--;
                co.put(i+1, new Point(x,y));
//                if(p.contains(x+""+y+"@#"))
//                    return true;
//                p+=x+""+y+"@#";
            }
            if(dir[i].equals("S")){
                y--;
                co.put(i+1, new Point(x,y));
//                if(p.contains(x+""+y+"@#"))
//                    return true;
//                p+=x+""+y+"@#";
            }
        }
        for(int i=0;i<co.size()-1;i++) {
        	Point p1=co.get(i);
        	for(int j=0;j<co.size();j++) {
        		if(i!=j) {
        		Point p2=co.get(j);
        		if(p1.x==p2.x && p1.y==p2.y)
        			return true;
        		}
        	}
        }
        	

        return false;
    }
	/*
	 * "NES"
"NESWW"
"NNEWSSNW"
"WNEEEESWSEESWWWNWWSWWSWW"
	 */
	public static void main(String[] args) {
		System.out.println(isPathCrossing("NNEWSSNW"));
	}
}
class Point{
	int x;
	int y;
	Point(){
	}
	Point(int x,int y){
		this.x=x;
		this.y=y;
	}
}

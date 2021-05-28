package com.dca.assignment;
import java.util.*;
public class tiktaktoe {
	public static String tictactoe(int[][] moves) {
        String[][] res=new String[3][3];
        int countA=0;
        int countB=0;
        for(int i=0;i<moves.length;i++){
            int a[]=moves[i];
            if(i%2==0){
                //As turn
                res[a[0]][a[1]]="X";
                countA++;
            }
            else{
                //Bs turn
                res[a[0]][a[1]]="O";
                countB++;
            }
            
        }
        for(int i=0;i<res.length;i++) {
        	for(int j=0;j<res[0].length;j++)
        		System.out.print(res[i][j]+"\t");
        	System.out.println();
        }
        
        for(int i=0;i<res.length;i++){
            String row[]=res[i]; //each row 
            if(isTriplet(row)){
                if(row[0].equals("X")) return "A";
                else if(row[0].equals("O")) return "B";
            }
        }
                //col check
            for(int j=0;j<res.length;j++){
            String col[]=new String[3];
            for(int k=0;k<3;k++){
                col[k]=res[k][j];
            }
            if(isTriplet(col) && col.length!=0){
                if(col[0].equals("X")) return "A";
                else if(col[0].equals("O")) return "B";
            }
            }
                //diagonal check
        String diag1="";
        String diag2="";
        int c1=0;
        int c2=0;
        Set<String> sd1=new HashSet<>();
        Set<String> sd2=new HashSet<>();
        for(int x=0;x<3;x++){
            if(res[x][x]!=""){
                sd1.add(res[x][x]);
                c1++;
            }
            if(res[x][2-x]!=""){
                sd2.add(res[x][2-x]);
                c2++;
            }
            }
        
        if(sd1.size()==1){
            if(c1==3 && sd1.contains("X")) return "A";
            else 
            if(c1==3 && sd1.contains("O")) return "B";
        }
        if(sd2.size()==1){
            if(c2==3 && sd2.contains("X")) return "A";
            else 
            if(c2==3 && sd2.contains("O")) return "B";
        }
                //Pending or Draw
            if(countA+countB<9) return "Pending";
            else
                return "Draw"; 
    }
    static boolean isTriplet(String s[]){
        if(s.length<3)
            return false;
        else if(s.length==3 && (Arrays.asList(s).contains("X") || Arrays.asList(s).contains("O"))){
        int count=0;
        for(int i=0;i<s.length;i++){
            if(i+1<s.length && s[i]==s[i+1])
                count++;
                
        }
        if(count==s.length-1)
            return true;
        else
            return false;
        }
        else return false;
    }
    /*
     * {{0,0},{2,0},{1,1},{2,1},{2,2}}
{{0,0},{1,1},{0,1},{0,2},{1,0},{2,0}}
{{0,0},{1,1},{2,0},{1,0},{1,2},{2,1},{0,1},{0,2},{2,2}}
{{0,0},{1,1}}
{{2,0},{1,1},{0,2},{2,1},{1,2},{1,0},{0,0},{0,1}}
[[1,1]]
     */
    public static void main(String[] args) {
    	int a[][]=new int[][]{{2,0},{1,1},{0,2},{2,1},{1,2},{1,0},{0,0},{0,1}};
		System.out.println(tictactoe(a));
	}
}

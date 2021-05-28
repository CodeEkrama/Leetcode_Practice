package com.dca.assignment;

public class Chess {
	public static int numRookCaptures(String[][] board) {
        //'R'  --- rook
        //'B' white bishop
        // 'p' black pawns 
        //'.' empty
        int kill=0;
        String right="";
        String down="";
        String left="";
        String up="";
        int x,y;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j]=="R"){
                    x=i; //2
                    y=j; //3
                    //check right
                    for(int p=y+1;p<8;p++)
                    {
                        if(board[x][p]!="."){
                            right+=board[x][p];
                        }
                    }
                    //right string stored
                    //check down
                    for(int p=x+1;p<8;p++)
                    {
                        if(board[p][y]!="."){
                            down+=board[p][y];
                        }
                    }
                    //check left
                    for(int p=y-1;p>=0;p--)
                    {
                        if(board[x][p]!="."){
                            left+=board[x][p];
                        }
                    }
                    //check up
                    for(int p=x-1;p>=0;p--)
                    {
                        if(board[p][y]!="."){
                            up+=board[p][y];
                        }
                    }
                    //all strings created
                    if(right.indexOf("p")!=-1 && right.indexOf("p")<right.indexOf("B"))
                        kill++;
                    else if(!right.contains("B") && right.contains("p"))
                    	kill++;
                    
                    if(up.indexOf("p")!=-1 && up.indexOf("p")<up.indexOf("B"))
                        kill++;
                    else if(!up.contains("B") && up.contains("p"))
                    	kill++;
                    
                    if(down.indexOf("p")!=-1 && down.indexOf("p")<down.indexOf("B"))
                        kill++;
                    else if(!down.contains("B") && down.contains("p"))
                    	kill++;
                    
                    if(left.indexOf("p")!=-1 && left.indexOf("p")<left.indexOf("B"))
                        kill++;
                    else if(!left.contains("B") && left.contains("p"))
                    	kill++;
                    
                    i=board.length;
                    break;
                }
            }
        }
        return kill;
    }
	public static void main(String[] args) {
		String[][] board=new String[][] {{".",".",".",".",".",".",".","."},{".",".",".","p",".",".",".","."},{".",".",".","R",".",".",".","p"},{".",".",".",".",".",".",".","."},{".",".",".",".",".",".",".","."},{".",".",".","p",".",".",".","."},{".",".",".",".",".",".",".","."},{".",".",".",".",".",".",".","."}};
		String[][] second=new String[][]{{".",".",".",".",".",".",".","."},{".","p","p","p","p","p",".","."},{".","p","p","B","p","p",".","."},{".","p","B","R","B","p",".","."},{".","p","p","B","p","p",".","."},{".","p","p","p","p","p",".","."},{".",".",".",".",".",".",".","."},{".",".",".",".",".",".",".","."}};
		String[][] third=new String[][]{{".",".",".",".",".",".",".","."},{".",".",".","p",".",".",".","."},{".",".",".","p",".",".",".","."},{"p","p",".","R",".","p","B","."},{".",".",".",".",".",".",".","."},{".",".",".","B",".",".",".","."},{".",".",".","p",".",".",".","."},{".",".",".",".",".",".",".","."}};
		String[][] fourth=new String[][]{{".",".",".",".",".",".",".","."},{".",".","B","B","B","B","B","."},{".",".","B",".",".",".","B","."},{".",".","B",".","R",".","B","."},{".",".","B",".",".",".","B","."},{".",".","B","B","B","B","B","."},{".",".",".",".",".",".",".","."},{".",".",".",".",".",".",".","."}};
		for(int i=0;i<8;i++) {
			for(int j=0;j<8;j++) {
				System.out.print(fourth[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println(numRookCaptures(fourth));
	
	}
}

import java.util.Arrays;
public class Solution {
	public int rownum=0;
	public int colnum=0;
	public void solve(char [][] board){
		if(board == null||board.length<=0||board[0].length<=0) return;//bug:	if(rownum<=0||colnum<=0||board == null) return;
		rownum=board.length;
		colnum=board[0].length;
		for(int i=0;i<colnum;i++){
			dfs(board,0,i);
		}
		for(int i=0;i<colnum;i++){
			dfs(board,rownum-1,i);
		}
		for(int j=1;j<rownum-1;j++){
			dfs(board,j,0);
		}
		for(int j=1;j<rownum-1;j++){
			dfs(board,j,colnum-1);
		}
		//this.matrixprint(board);
		for(int i=0;i<rownum-1;i++){
			for(int j=0;j<colnum-1;j++){
				if(board[i][j]=='O') board[i][j]='X';
			}
		}
		//this.matrixprint(board);
		for(int i=0;i<rownum;i++){
			for(int j=0;j<colnum;j++){
				if(board[i][j]=='*') board[i][j]='O';
			}
		}
	}
	public void dfs(char [][] board,int row,int col){
		if(board[row][col]=='O'){
			board[row][col]='*';
			if(row>1){
				dfs(board,row-1,col);}
			if(col>1) dfs(board,row,col-1);
			if(row<rownum-1) dfs(board,row+1,col);
			if(col<colnum-1) dfs(board,row,col+1);
		}
	}
	public void matrixprint(char [][]board){
		int rownum=board.length;
		int colnum=board[0].length;
		for(int i=0;i<rownum;i++){
			for(int j=0;j<colnum;j++){
				System.out.print(board[i][j]);;
			}
			System.out.println();
		}

	}
	public static void main(String[] args){
		char [][] board={
//				{'X','X','X','X'},
//				{'X','O','O','X'},
//				{'X','X','O','X'},
//				{'X','O','X','X'}
				{'X','X','X'},
				{'X','O','X'},
				{'X','X','X'},
		};
		Solution s=new Solution();
		s.solve(board);
		s.matrixprint(board);

		
	}
}

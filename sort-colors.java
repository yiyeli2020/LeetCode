import java.util.Arrays;
public class Solution {
	public void sortColores(int [] A){
	//ºÉÀ¼¹úÆìÎÊÌâ
		int begin=0;
		int end=A.length-1;
		int current=0;
		while(current<=end){
			if(A[current]==0){
				A[current]=A[begin];
				A[begin]=0;
				begin++;
				current++;
			}
			else if(A[current]==1){
				current++;}
			else if(A[current]==2){
				A[current]=A[end];
				A[end]=2;
				end--;
			}
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
	public void arrayprint(int []A){
		for(int i=0;i<A.length;i++){
			System.out.print(+A[i]+" ");
		}
	}
	public static void main(String[] args){
		int []A={1,2,0,0,2,2,1,1,0};
		Solution s=new Solution();
		s.sortColores(A);
		s.arrayprint(A);

		
	}
}

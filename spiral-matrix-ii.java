import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
public class Solution {
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
	public void matrixprint(int [][]board){
		int rownum=board.length;
		int colnum=board[0].length;
		for(int i=0;i<rownum;i++){
			for(int j=0;j<colnum;j++){
				System.out.print(board[i][j]);
				System.out.print(' ');
			}
			System.out.println();
		}

	}
	public void arrayprint(int []A){
		for(int i=0;i<A.length;i++){
			System.out.print(+A[i]+" ");
		}
	}
    public void arrayprint(ArrayList<Integer> A){
    	for(int i=0;i<A.size();i++){
			System.out.print(+A.get(i)+" ");
		}
    }
  	public void swap(int [][]a,int i,int j,int k,int m){
    	int temp;
    	temp=a[i][j];
    	a[i][j]=a[k][m];
    	a[k][m]=temp;
    }
  	 public int[][] generateMatrix(int n) {
  		int res[][]=new int[n][n];
  		 if(n==0){
  		 return res;
  		 }
         int x=0,y=0,a=1,N=n-1;
         while(x<=N&&y<=N){
        	 for(int i=x;i<=N;i++){
        		 res[x][i]=a++;
        	 }
        	 for(int j=y+1;j<=N;j++){
        		 res[j][N]=a++;
        	 }
        	 for(int i=N-1;i>=y;i--){
        		 res[N][i]=a++;
        	 }
        	 for(int j=N-1;j>x;j--){
        		 res[j][x]=a++;
        	 }
        	 x++;
        	 y++;
        	 N--;
         }
         return res;
  	 }
  	public static void main(String[] args){
//		int [][] matrix={
//				{ 1, 2, 3, 4},
//				{ 5, 6 , 7, 8},
//				{ 9,10,11,12},
//				{13,14,15,16}
//				{3},
//				{2}
//				{ 1, 2, 3 },
//				{ 4, 5, 6 },
//				{ 7, 8, 9 }
//				{1,2,3,4,5,6,7,8,9,10},
//				{11,12,13,14,15,16,17,18,19,20}
//		};
//		int A[]={1,3,4,6,7,9,11};
//		int B[]={2,4,8};
//		Interval i=new Interval();
		Solution s=new Solution();
//		System.out.print(matrix[0][0]);
//		System.out.println();
//		s.matrixprint(matrix);
//		System.out.println();
//		s.matrixprint(s.rotate(matrix));
		s.matrixprint(s.generateMatrix(2));
	}
}

import java.util.ArrayList;
import java.util.Arrays;
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
    public int[][] rotate(int[][] matrix) {
            int n=matrix.length;

            for(int i=0;i<n;i++){
            	for(int j=0;j<n-i;j++){
            		swap(matrix,i,j,n-1-j,n-1-i);
            		
            	}
            }
//            this.matrixprint(matrix);
//            System.out.println();
            for(int i=0;i<n/2;i++){
            	for(int j=0;j<n;j++){
            		swap(matrix,i,j,n-i-1,j);
            		}
            }
//            this.matrixprint(matrix);
            return matrix;
        }
	public static void main(String[] args){
		int [][] matrix={
//				{ 1, 2, 3, 4},
//				{ 5, 6 , 7, 8},
//				{ 9,10,11,12},
//				{13,14,15,16}
//				{3},
//				{2}
				{ 1, 2, 3 },
				{ 4, 5, 6 },
				{ 7, 8, 9 }
//				{1,2,3,4,5,6,7,8,9,10},
//				{11,12,13,14,15,16,17,18,19,20}
		};
		Solution s=new Solution();
//		System.out.print(matrix[0][0]);
//		System.out.println();
//		s.matrixprint(matrix);
//		System.out.println();
		s.matrixprint(s.rotate(matrix));
	}
}

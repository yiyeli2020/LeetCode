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
	public void arrayprint(int []A){
		for(int i=0;i<A.length;i++){
			System.out.print(+A[i]+" ");
		}
	}
	public int[] plusOne(int[] digits){
		//the favorite question of google because it can expand a lot
		if(digits==null||digits.length==0)
			return digits;
		int add=0;
		int n=digits.length;
		digits[n-1]=digits[n-1]+1;
		for(int i=n-1;i>=0;i--){
			digits[i]=digits[i]+add;
			add=digits[i]/10;
			digits[i]=digits[i]%10;
			if(add==0) break;
		}
		if(digits[0]==0){
				int []newdigits=new int[n+1];
				System.arraycopy(digits, 0, newdigits, 1, n);
				newdigits[0]=1;
				return newdigits;
			} 
		return digits; 

	}
	
	public static void main(String[] args){
		int []digits={9,9};
		Solution s=new Solution();
		
		s.arrayprint(s.plusOne(digits));

		
	}
}

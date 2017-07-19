import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
	public static void arrayprint(int []dp){
		for(int i=0;i<dp.length;i++){
			System.out.print(dp[i]);
		}
		System.out.println();
	}
	public static int jump(int[] A){
	  int []dp=new int[A.length];
  	  for(int i=0;i<A.length;i++){
  		  int maxPosition=Math.min(A[i]+i, A.length-1);
  		  for(int j=i+1;j<=maxPosition;j++){
  			  if(dp[j]==0) dp[j]=dp[i]+1;
  		  }
  		  arrayprint(dp);
  		  System.out.println(maxPosition);
  		  System.out.println("i="+i);
  		  if(dp[A.length-1]!=0) break;
  		  
  	  }
  	  return dp[A.length-1];
	}
	public static void main(String[] args){
    	  int A[]={2,3,1,1,4};
    	  Main main=new Main();
    	  System.out.println(main.jump(A));
    	  
    	  
    }
}
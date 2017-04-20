public class Merge_sort {
	public void arraylistprint(int []arraylist){
		for(int i=0;i<arraylist.length;i++){
			System.out.print(arraylist[i]);
			System.out.print(' ');
		}
	}
	public int [] memrarray(int a[],int n,int b[],int m){
		int i,j,k;
		i=j=k=0;
		int c[]=new int[m+n];
		while(i<n&&j<m){
			if(a[i]<b[j]){
				c[k]=a[i];
				k++;
				i++;
			}
			else {
			c[k]=b[j];
			k++;
			j++;
			}
		}
		while(i<n){c[k++]=a[i++];}
		while(j<m){c[k++]=b[j++];}
		return c;
	}
	public int [] merge(int A[],int m,int B[],int n){
		if(m==0){
			for(int i=0;i<n;i++){
				A[i]=B[i];
			}
		}
		else{
			int i=m-1;
			int j=n-1;
			int k=m+n-1;
			while(i>=0&&j>=0){
				if(A[i]>B[j]){A[k--]=A[i--];}
				else if(B[j]>=A[i]){A[k--]=B[j--];
				}
			}
//			this.arraylistprint(A);
//			System.out.println();
			while(i>=0){A[k--]=A[i--];}
			while(j>=0){A[k--]=B[j--];}
		}
		
		return A;
	}
	public static void main(String args[]){
		int a[]={3,5,7,9,0,0,0,0,0};
		int b[]={1,2,4,6,8};
		int m=4;
		int n=b.length;
//		System.out.println(m);
		Merge_sort merge=new Merge_sort();
//		merge.arraylistprint(merge.memrarray(a, n, b, m));
		merge.arraylistprint(merge.merge(a, m, b, n));
	}
}

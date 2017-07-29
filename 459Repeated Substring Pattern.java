import java.util.Hashtable;


public class Solution {
    public String addBinary(String a, String b) {
        if(a==null) return b;
        else if(b==null) return a;
        int i=a.length()-1;
        int j=b.length()-1;
        StringBuilder c=new StringBuilder();

        int carry=0;
//        System.out.println("i="+j);
//        System.out.println("j="+j);
        while(i>=0&&j>=0){
//            System.out.println(a.charAt(i));
//            System.out.println(b.charAt(j));
            int temp=(a.charAt(i)-'0'+b.charAt(j)-'0'+carry);
            carry=temp/2;
            temp=temp%2;
            c.append(temp);
            i--;
            j--;    
        }
       System.out.println("c="+c);
       System.out.println("i="+i);
       System.out.println("j="+j);
        while(i>=0){
            int temp=(a.charAt(i)-'0'+carry);
            carry=temp/2;
            temp=temp%2;
            c.append(temp);
            i--;
        }
        while(j>=0){
            int temp=(b.charAt(j)-'0'+carry);
            carry=temp/2;
            temp=temp%2;
            c.append(temp);
        	j--;
        }
        if(carry==1){
        c.append(carry);
        }
        return c.reverse().toString();
    }
    public String convert(String s, int nRows) {
        //Time O(n^2)
        //Space O(n)
        int size=2*nRows-2;
        int len=s.length();
        //if(s==null||s.length==0||nRows<=0) return "";
         if(nRows==1){ return s;}
        StringBuilder res=new StringBuilder();

        for(int i=0;i<nRows;i++){
            for(int j=i;j<len;j=j+size){
                res=res.append(s.charAt(j));
                if(i!=0&&i!=nRows-1){
                    int temp=j+size-2*i;
                    if(temp<len)
                    res=res.append(s.charAt(temp));
                }
            }
        }
        
        return res.toString();
    }
    public String longestCommonPrefix(String[] strs){
    	if(strs==null||strs.length==0) return "";
    	String pre=strs[0];
    	int i=1;
    	int len=0;
    	while(i<strs.length){
    		while(strs[i].indexOf(pre)!=0)// pre is not the prefix of strs[i]
    		{
    			//this while means if the pre is not the substring 
    			//the while will go on until the pre is the substring 
    			//of the strs[i]
    			len=pre.length();
    			pre=pre.substring(0,pre.length()-1);
    			//cut the substring between 0 and length()-1
    			
    		}   
    		i++;
    	}
    	return pre;
    }
    public boolean repeatedSubstringPattern(String str){
    	int l=str.length();
    	for(int i=l/2;i>=1;i--){
    		if(l%i==0){
    			int m=l/i;
    			String subS=str.substring(0,i);
    			StringBuilder sb=new StringBuilder();
    			for(int j=0;j<m;j++){
    				sb.append(subS);
    			}
    			if(sb.toString().equals(str)) return true;
    			}
    		}
    	
    	return false;
    }
    public boolean repeatedSubstringPattern2(String s){
    	//检测首字母法会出现错误若"abaababaab"
    	char[] ca= s.toCharArray();
    	int f=s.lastIndexOf(ca[0]);
    	String str=s.substring(f, s.length());
    	if(s.length()%str.length()==0){
    		StringBuilder ss=new StringBuilder();
    		for(int j=s.length()/str.length();j>0;j--){
    			ss.append(str);
    		}
    		if(ss.equals(s)) return true;
    	}
    	System.out.println(str);
    	System.out.println(s.lastIndexOf(ca[0]));
    	return false;
    }
    public static void main(String[] args){
//    	String s1="abcdefghijklmn";
//    	String s2="abcdefghijklmn";
//    	System.out.println(s1.equals(s2));
//    	String [] s={"eac","eb","ebcdes"};
    	Hashtable<Char,Integer> hash= Hashtable();
    	String s="abab";
  		Solution solution=new Solution();
		//System.out.println(solution.longestCommonPrefix(s) );
//    	System.out.println(s[3].indexOf(s[0]));
    	//s.indexOf(str) if str is the substring and is the prefix string 
//    	//it will return 0 else it will return -1
//		System.out.println(s[0].substring(0,1));
		if(solution.repeatedSubstringPattern2(s)) {
			System.out.println("True");
		}
		else System.out.println("False");
		
    }
}

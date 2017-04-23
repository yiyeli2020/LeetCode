import java.util.ArrayList;

public class merge_intervals {
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
    	int n;
		if(intervals == null||intervals.size()<=1)
    	n=intervals.size();
    	
    	return intervals;
        
    }
    public static ArrayList<Interval> initialize(){
		Interval i1=new Interval(1,3);
		Interval i2=new Interval(2,6);
		Interval i3=new Interval(8,10);
		Interval i4=new Interval(15,18);
//		i1.start=1;
//		i1.end=3;
//		i2.start=2;
//		i2.end=6;
//		i3.start=8;
//		i3.end=10;
//		i4.start=15;
//		i4.end=18;
		ArrayList<Interval> intervals=new ArrayList<Interval>();
		intervals.add(i1);
		intervals.add(i2);
		intervals.add(i3);
		intervals.add(i4);
    	return intervals;
    	
    	
    }
    public static void main(String args[]){
    	merge_intervals mer=new merge_intervals();
    	ArrayList<Interval> intervals=mer.initialize();
    	int n=intervals.size();
//    	System.out.println(intervals.get(n-1).start);
    	mer.merge(intervals);
    	
    	
    } 
}
package prasad.interviewbit.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MergeIntervals {
	class Interval {
		int start;
		int end;

		Interval() {
			start = 0;
			end = 0;
		}

		Interval(int s, int e) {
			start = s;
			end = e;
		}

		@Override
		public String toString() {
			return "("+ start + " " + end + ")";
		}
	}
	
	public static void main(String[] args) {
		MergeIntervals mi = new MergeIntervals();
		ArrayList<Interval> intervals = new ArrayList<Interval>();
		intervals.add(mi.new Interval(4, 100));
		intervals.add(mi.new Interval(48, 94));
		intervals.add(mi.new Interval(21, 35));
		intervals.add(mi.new Interval(1, 32));
		System.out.println(mi.merge(intervals));
	}

	public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
		Interval current = newInterval;
        int i = 0;
        while(i < intervals.size()){
            Interval in = intervals.get(i);
            if(in.end < current.start){
                i++;
            }else if(in.start > current.end){
                intervals.add(i, current);
                break;
            }else{
                current.start = Math.min(in.start, current.start);
                current.end = Math.max(in.end, current.end);
                intervals.remove(i);
            }
        }
        if(i == intervals.size()){
            intervals.add(current);
        }
        return intervals;
    
	}
	
	public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start > o2.start ? 1 : o1.start < o2.start ? -1 : o1.end > o2.end ? 1 : -11;
            }
        });
        for(int i = 1; i < intervals.size(); i++){
            if(intervals.get(i-1).end >= intervals.get(i).start){
                intervals.get(i-1).end = intervals.get(i).end;
                intervals.remove(i--);
            }
        }
        return intervals;
        
    }
}

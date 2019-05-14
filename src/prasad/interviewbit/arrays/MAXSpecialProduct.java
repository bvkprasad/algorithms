package prasad.interviewbit.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class MAXSpecialProduct {
	
	public static void main(String[] args) {
		List<Integer> A = new ArrayList<>(Arrays.asList(new Integer[]{5, 9, 6, 8, 6, 4, 6, 9, 5, 4, 9}));
		System.out.println(A);
		A.set(2, 100);
		System.out.println(A);
		//System.out.println(maxSpecialProduct((ArrayList<Integer>) A));
	}
	
	public static int maxSpecialProduct(ArrayList<Integer> A) {
		ArrayList<Integer> a = rsv(A);
		ArrayList<Integer> b = lsv(A);
		
		int max = 0;
		for(int i = 0; i < A.size(); i++) {
			int p = 0;
			if(a.get(i) != -1 && b.get(i) != -1) {
				p = a.get(i) * b.get(i);
			}
			if (p > max) {
				max = p;
			}
		}
		return max%1000000007;		
	}

	public static ArrayList<Integer> lsv(ArrayList<Integer> A) {
		ArrayList<Integer> r = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<A.size();i++){
            while(!s.empty() && A.get(s.peek()) <= A.get(i)){
                s.pop();
            }

            if(s.empty()){
                r.add(0);
            }
            else{
                r.add(s.peek());
            }
            s.push(i);
        }

        return r;
	}

	public static ArrayList<Integer> rsv(ArrayList<Integer> A) {
		ArrayList<Integer> r = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        for(int i=A.size()-1;i>=0;i--){
            while(!s.empty() && A.get(s.peek()) <= A.get(i)){
                s.pop();
            }

            if(s.empty()){
                r.add(0,0);
            }
            else{
                r.add(0,s.peek());
            }
            s.push(i);
        }

        return r;
	}
}

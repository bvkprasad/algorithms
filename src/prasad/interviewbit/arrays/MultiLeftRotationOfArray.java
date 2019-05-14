package prasad.interviewbit.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class MultiLeftRotationOfArray {

	public ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<ArrayList<Integer>> main = new ArrayList<ArrayList<Integer>>(B.size());
        for (int i = 0; i < B.size(); i++) {
            ArrayList<Integer> inner = new ArrayList<Integer>(A);
            int p = B.get(i);
            while(p >= A.size()){
                p = p%A.size();
            }
            if(p < A.size()/2){
                for (int j = 0; j < p; j++) {
                    inner.add(A.get(j));
                    inner.remove(0);
                }
            }else{
                int j = A.size()-1;
                while(j >= p) {
                    inner.add(0,A.get(j--));
                    inner.remove(inner.size()-1);
                }
            }
        main.add(inner);
        }
        return main;
    }

	public static void main(String[] args) {
		/*
		 * Integer[] ar = new Integer[] { 6, 31, 33, 13, 82, 66, 9, 12, 69, 21, 17, 2,
		 * 50, 69, 90, 71, 31, 1, 13, 70, 94, 46, 89, 13, 55, 54, 67, 97, 28, 27, 62,
		 * 34, 41, 18, 15, 35, 13, 84, 93, 27, 89, 23, 6, 56, 94, 40, 54, 95, 47 };
		 * Integer[] ar2 = new Integer[] { 88, 85, 98, 36, 66, 40, 30, 26, 51, 77, 62,
		 * 60, 92, 64, 53, 86, 24, 53, 85, 49, 57, 29, 32, 60, 75, 82, 17, 23, 67, 51,
		 * 23, 11, 70, 59 };
		 */
		Integer[] ar = new Integer[] { 1, 2, 3, 4, 5 };
		Integer[] ar2 = new Integer[] { 8};
		ArrayList<Integer> a1 = new ArrayList<Integer>(Arrays.asList(ar));
		ArrayList<Integer> a2 = new ArrayList<Integer>(Arrays.asList(ar2));
		MultiLeftRotationOfArray ob = new MultiLeftRotationOfArray();
		System.out.println(ob.solve(a1, a2));

	}
}

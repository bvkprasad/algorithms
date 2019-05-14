package prasad.interviewbit.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetMatrixZeros {

	public static void main(String[] args) {
		SetMatrixZeros sm = new SetMatrixZeros();
		ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(0);a.add(0);
		al.add(a);
		a = new ArrayList<Integer>();
		a.add(1);a.add(0);
		al.add(a);
		sm.setZeroes(al);
		System.out.println(al);
	}
	
	public void setZeroes(ArrayList<ArrayList<Integer>> a) {
		int rows = a.size();
        int cols = a.get(0).size();
        
        Set<Integer> zeroRows = new HashSet<>();
        Set<Integer> zeroCols = new HashSet<>();
        
        for(int row=0; row<rows; row++) {
            for(int col=0; col<cols; col++) {
                if (a.get(row).get(col) == 0) {
                    zeroRows.add(row);
                    zeroCols.add(col);
                }
            }
        }
        
        for(int row=0; row<rows; row++) {
            for(int col=0; col<cols; col++) {
                if (zeroRows.contains(row) || zeroCols.contains(col))
                    a.get(row).set(col, 0);
            }
        }
    }

}

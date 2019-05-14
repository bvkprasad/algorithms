package prasad;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class QuickSort {

	public static void main(String[] args) {
		List<Integer> a = Arrays.asList(new Integer[] {6,7,4,5,8,2,1});
		long t1 = System.currentTimeMillis();
		System.out.println(t1);
		Collections.sort(a);
		//threeWayQuickSort(a, 0, a.size() - 1);
		long t2 = System.currentTimeMillis();
		System.out.println(t2);
		System.out.println(t2-t1);
		System.out.println(a);
	}

	public static void threeWayQuickSort(List<Integer> ar, int l, int h) {
		if(l >= h) return;
		int lt = l;
		int gt = h;
		int pivot = ar.get(l);
		int i = l+1;
		while(i <= gt) {
			if(ar.get(i) < pivot) 
				swap(ar,i++,lt++);
			else if(ar.get(i) > pivot) 
				swap(ar,i,gt--);
			else i++;
		}
		threeWayQuickSort(ar,l,lt-1);
		threeWayQuickSort(ar,lt+1,h);
	}
	public static void quickSort(List<Integer> ar, int l, int h) {
		if (l < h) {
			int i = generalPartition(ar, l, h);
			quickSort(ar, l, i - 1);
			quickSort(ar, i + 1, h);
		}
	}

	public static int geeksForGeeksPartition(List<Integer> ar, int s, int h) {
		int l = s - 1;
		int i = ar.get(h);
		while (s <= h - 1) {
			System.out.println("comp " + ar.get(s) + " less than " + i);
			if (ar.get(s) < i) {
				System.out.println("valu of l " + l + " - " + ar.get(l));
				swap(ar, s, ++l);
			}
			s++;
		}
		swap(ar, l + 1, h);
		return l + 1;
	}

	public static int generalPartition(List<Integer> ar, int s, int h) {
		int i = s - 1;
		int j = h;
		int p = ar.get(h);
		while (true) {
			while (ar.get(++i) < p) {
				if (i == h)
					break;
			}
			while (ar.get(--j) > p) {
				if (j == s)
					break;
			}
			if(i >= j) break;
			
			swap(ar, i, j);
		}
		swap(ar,i,h);
		return i;
	}

	public static void swap(List<Integer> ar, int i, int j) {
		if (i >= 0 && j >= 0) {
			int a = ar.get(i);
			ar.set(i, ar.get(j));
			ar.set(j, a);
		}
	}
}

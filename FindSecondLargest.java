package week3.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {
	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		Set <Integer> set = new TreeSet<Integer>();
		for (int i = 0; i < data.length; i++) {
			set.add(data[i]);
		}
		 List<Integer> arr = new ArrayList<Integer>(set);
		 Collections.sort(arr);
		  int s = arr.size();
        System.out.println(arr.get(s-2));
	}
}
 
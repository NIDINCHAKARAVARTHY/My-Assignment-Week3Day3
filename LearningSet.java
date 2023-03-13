package week3.day3;

import java.util.LinkedHashSet;
import java.util.Set;

public class LearningSet {
	public static void main(String[] args) {
		String companyName = "GOOGLE";
		char[]charArray = companyName.toCharArray();
		Set<Character> name = new LinkedHashSet<Character>();
		for (char  ch : charArray) {
			name.add(ch);
			
		}
		System.out.println(name);
}
}



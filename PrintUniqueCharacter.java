package week3.day3;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class PrintUniqueCharacter {
	public static void main(String[] args) {
		String  s = "NIDIN";
		char[]ch = s.toCharArray();
		Set<Character> set = new HashSet<Character>();
		for (int i = 0; i < ch.length; i++) {
			set.add(ch[i]);
		}
	List<Character> list =  new LinkedList<Character>(set);
	for (int i = 0; i < list.size(); i++) {
		int a = 0;
		for (int j = 0; j < ch.length; j++) {
			if(list.get(i)==ch[j]) {
				a++;
			}
	     }
		if(a==1) {
			System.out.println(list.get(i));
		}
		
	}
		
	}

}
/*
 * Psuedocode
 * 
 * a) Convert String to Character array
 * b) Create a new Set -> HashSet
 * c) Add each character to the Set and if it is already there, remove it
 * d) Finally, print the set
 * 
 */
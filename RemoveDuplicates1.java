package week3.day3;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates1 {
	
	public static void main(String[] args) {
		String str = "We learn java basics as part of java sessions in java week1";  	        
		 
		  String[] strArray = null;
		  strArray = str.split("");
			 
			 Set<String> str1 = new HashSet<String>();
			 
			 for (int i = 0; i < strArray.length; i++) {
				if(!str1.add(strArray[i])) {
					
				}
			}
			 System.out.println(str1);
		}
	}


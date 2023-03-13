package week3.day3;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicatesWords {
	public static void main(String[] args) {
		
	        
		String text = "We learn java basics as part of java sessions in java week1";
	          
	      
	        
	        String[] str = text.split("\\s+");
	   LinkedHashSet<String> set= new LinkedHashSet<String>( Arrays.asList(str) );
	        
	        StringBuilder builder = new StringBuilder();
	        int index = 0;
	        
	        for(String s : set){
	            
	            if(index > 0)
	            	builder.append(" ");
	                builder.append(s);
	                index++;
	        }
	        
	        text = builder.toString();
	        
	        System.out.println("String after removing duplicate words: ");
	        System.out.println(text);
	 
		}
}

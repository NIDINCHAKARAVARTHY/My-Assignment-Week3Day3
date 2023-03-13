package week3.day3;

import java.util.LinkedHashMap;
import java.util.Map;

public class LearningMap {

	public static void main(String[] args) {
		
		String name = "amazon development Center";
		char[] ch=name.toCharArray();
		Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
		for (int i = 0; i < ch.length; i++) {
			if(map.containsKey(ch[i])) {
				Integer add = map.get(ch[i]);
				map.put(ch[i], add+1);
				
			}else {
				map.put(ch[i], 1);
			}
			
		}System.out.println(map);
	}
}

package week3.day3;

public class MissingNumber {
	public static void main(String[] args) {
		
		int[]a= {1,2,3,5,6,9,10};
		int count = 1;
		for (int i = 0; i <=a.length-1; i++) {
			if(a[i]!=i+count) {
				System.out.println(i+count);
				count++;
			}
			
		}
	}

}

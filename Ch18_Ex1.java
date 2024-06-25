package Academy2;

import java.util.Random;

public class Ch18_Ex1 {

	public static void main(String[] args) {
			Random r = new Random();
			int[] num = new int[10];
			int[] count = new int[10];
			
			for(int i=0; i<num.length; i++) {
					num[i] = r.nextInt(9); 
					count[num[i]]++;
					
			}
			for(int i=0; i<count.length; i++) {
					System.out.printf("%d 의 개수 : %d\n" , i, count[i]);
			}
	}

}

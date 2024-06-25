package Academy2;
import java.util.Scanner;
public class Ch05_ArrayEx2 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int total = 0;
			double average = 0.0;
			int[] score = new int [5];
			
			for(int i=0; i<score.length; i++) {
					System.out.print("학생" + (i+1) + "입력");
					score[i] = sc.nextInt();
					total = score[0] + score[1] + score[2] + score[3] + score[4];
			}
			System.out.printf("총점 : %d" , total);
			average = (double)total / score.length;
			System.out.printf("\n평균 : %.2f" , average);
	}

}

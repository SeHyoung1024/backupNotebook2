package Academy2;
import java.util.Scanner;
public class Ch06_ArrayEx3 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int num[] = new int[5];
			
			for(int i=0; i<num.length; i++) {
					System.out.print("숫자" + (i+1) + " 입력");
					num[i] = sc.nextInt();
					
			}
			
			int max = num[0];
			for(int i=0; i<num.length; i++) {
					if(num[i]>num[0]) {
							max = num[i];
					}
					
			}
			System.out.println("입력된 값 : " + num[0] + " " + num[1] + " " + num[2] + " " + num[3] + " " + num[4]);
			System.out.printf("최대값 : %d" , max);

	}

}

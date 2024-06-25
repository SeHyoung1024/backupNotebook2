package Academy2;

import java.util.Random;

public class Ch07_ArrayEx4 {

	public static void main(String[] args) {
			// 로또 번호 생성기
			
			int num[] = new int[6];
			Random r = new Random();
			
			// 로또 생성 반복문
			for(int i=0; i<num.length; i++) {
					num[i]= r.nextInt(45) +1;
					// 난수의 중복여부 확인 후 중복이면 난수 제외(1--) , 다시 생성
					for(int j=0; j<i; j++) { // i 번째 이전의 값들과 하나씩 비교
							if(num[i]==num[j]) { // 중복된 값이 있으면
									i--; // 현재 i idx 값이 중복되어서 사용 불가
									break;
							}
					}
							
					
			}
			System.out.println("로또번호 : ");
			for(int z=0; z<num.length; z++) {
					System.out.printf("%d ",num[z]);
			}

	}

}

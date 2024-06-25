package Academy2;

public class Ch_Array2D {

	public static void main(String[] args) {
			// 2차원 배열 정리
			// 2차원 배열 선언 + 초기화
		
			int [][] score = { 
					{100,100,100},
					{20,20,20},
					{30,30,30},
					{40,40,40},
					{50,50,50}
			};
			
			int [][] scores = new int[5][3];
			
			for(int i=0; i<scores.length; i++) {
					//각 행의 원소 수 만큼 반복
					for(int j=0; j<scores[i].length; j++) {
							System.out.printf("score[%d][%d] = %d\n" ,i ,j ,score[i][j] );
					}
			}
			// 2차원 테이블 형태로 원소 값 출력
			for(int i=0; i<scores.length; i++) {
				//각 행의 원소 수 만큼 반복
				for(int j=0; j<scores[i].length; j++) {
						System.out.print(score[i][j] + "\t");
				}
				System.out.println();
			}
			
			// 2차원 배열의 length 값
			System.out.println("score.length (행의 수) : " + score.length);
			System.out.println("score[0].length (0행의 원소 수) : " + score[0].length);
			
			System.out.println();
			
			// 배열명 출력 : 가상 주소 출력
			System.out.println(score);
			System.out.println(score[0]);
			
	}
	

}

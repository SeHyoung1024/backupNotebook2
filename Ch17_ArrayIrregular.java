package Academy2;

public class Ch17_ArrayIrregular {

	public static void main(String[] args) {
			// 가변 배열 : 행 고정 , 원소수는 행마다 다르게 설정
			// 가변 배열 선언 + 메모리 할당
		
			int[][] ar = new int[4][];
			
			ar[0] = new int[1];
			ar[1] = new int[2];
			ar[2] = new int[3];
			ar[3] = new int[4];
			
			// 가변 배열 초기화 + 배열 생성
			
			char[][] br = {
					{'a'},
					{'b','c'},
					{'d','e','f'}
			}; // << 3행 가변 배열 생성 + 초기화
			
			String[][] student = {
					{"홍길동" , "학생"},
					{"성춘향" , "3학년" , "영어과"},
					{"이몽룡" , "4학년" , "물리학과" , "A"}
			};
			
			for(int i=0; i<ar.length; i++) {
					for(int j=0; j<ar[i].length; j++) {
							System.out.print(ar[i][j]+ " " );
					}
			System.out.println();
			}
			
			//가변 배열 ar 에 값 저장
			int count = 1;
			for(int i=0; i<ar.length; i++) {
				for(int j=0; j<ar[i].length; j++) {
						ar[i][j]= count++;  
				}
				
			}
			
			for(int i=0; i<ar.length; i++) {
				for(int j=0; j<ar[i].length; j++) {
						System.out.print(ar[i][j]+ " " );
				}
			System.out.println();	
			}
			
			for(int i=0; i<br.length; i++) {
				for(int j=0; j<br[i].length; j++) {
						System.out.print(br[i][j]+ " " );
				}
			System.out.println();	
			}
	}

}

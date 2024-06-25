package Academy2;

public class Ch05_ArrayInitialize {

	public static void main(String[] args) {
			// 배결 초기화
			// 1. 자동 초기화 : 선언하고 메모리 할당(new)
			
			int[] ar = new int[5] ; // 선언 + 메모리 할당 , 값은 아직 저장 x
			
			for(int i=0; i<ar.length; i++) {
					System.out.print(ar[i] + " ");
			}
			System.out.println();
			
			// 2. 명시적 초기화 : 선언 + 메모리할당 + 값 저장
			String[] flowers = {"헤바라기" ,"장미" , "진달래"};
			
			for(int i=0; i<flowers.length; i++) {
					System.out.print(flowers[i]+ " " );
			}
			

	}

}

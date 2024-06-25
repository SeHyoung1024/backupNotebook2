package Academy2;

import javax.annotation.processing.SupportedAnnotationTypes;

public class Ch31_NestedForEx3 {

	public static void main(String[] args) {
			
			for(int i=1; i<=9; i++) {
				
					for(int dan=2; dan<=9; dan++) {
							System.out.printf("%d X %d = %d \t" , dan , i , (dan*i));
					}
					System.out.println();
			}

	}

}

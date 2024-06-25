package Academy2;

public class Ch16_Array2DEx1 {

	public static void main(String[] args) {
				
				int[][] num = {
							{5,9,3},
							{7,4,8},
							{9,5,7},
							{7,8,9},
							{6,9,4}
				};
				
				for(int i=0; i<num.length; i++) {
						int sum = 0;
						for(int j=0; j<num[0].length; j++) {
								sum += num[i][j]; 
								
						}
						System.out.println(i + "행의 합 : " +sum);
				}
					//num[0][0] + num[0][1] + num[0][2];
	}

}

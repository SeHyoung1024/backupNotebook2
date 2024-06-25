package Academy2;

public class Ch03_ArrayEx1 {

	public static void main(String[] args) {
			int[] scores = {83,95,88};
			
			for(int i=0; i<scores.length; i++) {
					System.out.println(scores[i]);
					
			}
			double totalscore = scores[0] + scores[1] + scores[2];
			System.out.println("합계 : " + (int)totalscore);
			System.out.printf("평균 : %.2f" , (totalscore/3) );
	}

}
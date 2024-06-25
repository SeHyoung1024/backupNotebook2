package Academy2;

import java.util.function.IntPredicate;

public class Ch45_Ex3 {

	public static void main(String[] args) {
			
			
			
			String value = "1234";
			char ch = ' ';
			boolean isNumber = true;
			
			// 주어진 문자열이 숫자형인지 확인해서 숫자가 아니면 false 출력
			// charAt(idx) 사용해서 0~9 범위인지 검사 = 반복문
			
			for(int i=0; i<value.length(); i++) {
					ch = value.charAt(i); // 문자열에서 idx별로 한 문자씩 추출
					//if(ch<'0' || ch>'9') { // 숫자형이 아니면 
					if(!(ch>='0' && ch<='9')) {
							isNumber = false;
							break; 
					}
			}
			
			if(isNumber) {
					System.out.println(value + " 는 숫자입니다");
			}else {
					System.out.println(value + " 는 숫자가 아닙니다");
			}

	}

}

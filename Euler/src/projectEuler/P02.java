package projectEuler;

import java.util.ArrayList;
import java.util.List;

// 3. 피보나치 수열에서 짝수 항만 뽑아서 관찰 
// 	    답안에 나와있는 1번 코드(피보나치 가장 기본 코드) 이용해서 작성
public class P02 {

	public static void main(String args[]) {
	
		int limit = 4000000;
		int fsum = 2;
		int f1 = 2;
		int f2 = 8;
		int tf = 0;
		
		while(f2 < 4000000) {
			fsum += f2;
			tf = 4 * f2 + f1;
			f1 = f2;
			f2 = tf;
		}
		System.out.println(fsum);
	}
}

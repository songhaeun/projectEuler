package projectEuler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 600851475143의 소인수 중에서 가장 큰 수 

// 1 가장 단순하게 생각해낼 수 있는 방법(소인수 분해 이용)
// 주어진 숫자를 n이라고하고 k = 2, 3, 4, 5 ... 
// k가 n의 인수일 때
// -> n을 k로 나누고 k를 완전히 쪼개버린 후에 다음 k로 이동하면
// -> k는 소수가 되고 
// -> 결과적으로 n은 1이됨
public class P03 {

	public static void main(String args[]) {
		
		long  evilBigNum = 600851475143L;
		int fac = 2;
		int lFac = 0;
		
		while(evilBigNum>1) {
			if(evilBigNum % fac == 0) {
				lFac = fac;
				evilBigNum /= fac;
				while(evilBigNum % fac == 0) {
					evilBigNum /= fac;
				}
			}
			fac++;
		}
		System.out.println(lFac);	
	}
}	


























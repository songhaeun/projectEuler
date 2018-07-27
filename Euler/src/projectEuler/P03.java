package projectEuler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 600851475143의 소인수 중에서 가장 큰 수 

// 2
// 1을 업데이트 해보자
// -> 2는 유일하게 짝수인 소수
// -> 2만 따로 빼내서 다루면 fac을 한번에  +2 할 수 있음(다른 짝수를 무시할 수 있으니까)
public class P03 {

	public static void main(String args[]) {
		
		long  evilBigNum = 600851475143L;
		int fac = 3; // 이걸 사용하게 된다는 건 인수로 2만 갖는게 아니라는 뜻이되니까(2 이후의 숫자들에 대해서만 조사하면 되니까)
		int lFac = 0;
		
		if (evilBigNum % 2 == 0) {
			evilBigNum /= 2;
			lFac = 2;
			while(evilBigNum % 2 == 0)
				evilBigNum /= 2;
		}
		
		while(evilBigNum > 1) {
			if(evilBigNum % fac == 0) {
				evilBigNum /= fac;
				lFac = fac;
				while(evilBigNum % fac == 0)
					evilBigNum /= fac;
			}
			fac +=2;
		}
		System.out.println(lFac);	
	}
} 
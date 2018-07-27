package projectEuler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 3 더 큰 숫자가 주어졌을 경우?
// -> 모든 숫자 n은  n의 제곱근 보다 큰 소인수를 최대 한개 갖는다!

// -> 한 소인수로 나눈 후의 n의 제곱근을 구해서 fac의 한계점으로 쓸 수 있음
// -> fac이 이 한계점을 넘으면 남은 n이 소수임을 알 수 있음
public class P03 {

	public static void main(String args[]) {
		
		long  moreEvilBigNum = 600851475143L;
		int fac = 3; // 이걸 사용하게 된다는 건 인수로 2만 갖는게 아니라는 뜻이되니까(2 이후의 숫자들에 대해서만 조사하면 되니까)
		int lFac = 0;
		double mFac = 0;

		if(moreEvilBigNum % 2 == 0) {
			lFac = 2;
			moreEvilBigNum /= 2;
			while(moreEvilBigNum % 2 == 0)
				moreEvilBigNum /= 2;
		}
		else
			lFac = 1;
		
		mFac = Math.sqrt(moreEvilBigNum);
		
		while(moreEvilBigNum > 1 && fac <= mFac) {
			if(moreEvilBigNum % fac == 0) {
				lFac = fac;
				moreEvilBigNum /= fac;
				while(moreEvilBigNum % fac == 0)
					moreEvilBigNum /= fac;
				mFac = Math.sqrt(moreEvilBigNum);			
			}
			fac += 2;
		}
		
		if(moreEvilBigNum == 1)
			System.out.println(lFac);
		else
			System.out.println(moreEvilBigNum);
	}
} 
package projectEuler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 3 �� ū ���ڰ� �־����� ���?
// -> ��� ���� n��  n�� ������ ���� ū ���μ��� �ִ� �Ѱ� ���´�!

// -> �� ���μ��� ���� ���� n�� �������� ���ؼ� fac�� �Ѱ������� �� �� ����
// -> fac�� �� �Ѱ����� ������ ���� n�� �Ҽ����� �� �� ����
public class P03 {

	public static void main(String args[]) {
		
		long  moreEvilBigNum = 600851475143L;
		int fac = 3; // �̰� ����ϰ� �ȴٴ� �� �μ��� 2�� ���°� �ƴ϶�� ���̵Ǵϱ�(2 ������ ���ڵ鿡 ���ؼ��� �����ϸ� �Ǵϱ�)
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
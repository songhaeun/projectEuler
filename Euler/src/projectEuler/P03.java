package projectEuler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 600851475143�� ���μ� �߿��� ���� ū �� 

// 2
// 1�� ������Ʈ �غ���
// -> 2�� �����ϰ� ¦���� �Ҽ�
// -> 2�� ���� ������ �ٷ�� fac�� �ѹ���  +2 �� �� ����(�ٸ� ¦���� ������ �� �����ϱ�)
public class P03 {

	public static void main(String args[]) {
		
		long  evilBigNum = 600851475143L;
		int fac = 3; // �̰� ����ϰ� �ȴٴ� �� �μ��� 2�� ���°� �ƴ϶�� ���̵Ǵϱ�(2 ������ ���ڵ鿡 ���ؼ��� �����ϸ� �Ǵϱ�)
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
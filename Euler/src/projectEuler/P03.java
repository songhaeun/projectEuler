package projectEuler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 600851475143�� ���μ� �߿��� ���� ū �� 

// 1 ���� �ܼ��ϰ� �����س� �� �ִ� ���(���μ� ���� �̿�)
// �־��� ���ڸ� n�̶���ϰ� k = 2, 3, 4, 5 ... 
// k�� n�� �μ��� ��
// -> n�� k�� ������ k�� ������ �ɰ����� �Ŀ� ���� k�� �̵��ϸ�
// -> k�� �Ҽ��� �ǰ� 
// -> ��������� n�� 1�̵�
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


























package projectEuler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 600851475143�� ���μ� �߿��� ���� ū �� 
public class P03 {

	public static void main(String args[]) {
		
		// 60085147513���� ���� �Է¹޾Ƽ� ó���Ѵٰ� ����
		// �� �Է¹ޱ�
		Scanner scan = new Scanner(System.in);
		double su = scan.nextDouble();
		/*
		// 1 ���� �μ��� ���ϰ� ��׵��� �Ҽ����� Ȯ���ϴ� ���-> �ð��� �ʹ� ���� �ɸ�!
		// ���μ��� ����Ʈ �����???
		List<Double> insu = new ArrayList<Double>();
		
		double l = 2;
		while(l <= su) {
			// ���� 60085147513�� �μ�����
			if(su % l == 0) {
				Check c1 = new Check(l);
				// �Ҽ��ΰ� Ȯ�ε����� ����Ʈ�� �ְ�
				if(c1.getAns() == 0)
					insu.add(l);
				l++;
			}else {
				l++;
			}
				
		}
		System.out.println(insu);
		*/
		
		
		// 2 ���μ� ���� �̿�
		// -> 2���� �����ؼ� ���������� ���� 1�� �ɶ����� ��� ������
		// -> �־��� ���� 1�� �� �� ���� ���� ���� ū ���μ�!
		double j = 2;
		while(su != 1) {
			
			if(su % j == 0)
				su = su / j;
			else
				j++;
		}
		System.out.println(j);
		
		
	}
}

// �Ҽ����� Ȯ��
class Check {
	
	private double l;
	private int ans;
	
	public Check() {
		
	}
	public Check(double l) {
		this.l = l;
	}
	public double getL() {
		return l;
	}
	public void setL(double l) {
		this.l = l;
	}
	public int getAns() {
		setAns(ans);
		return ans;
	}
	
	// �Ҽ��� 0 �ƴϸ� 1 -> �Ҽ����� Ȯ���ϴ� �ڵ�
	public void setAns(int ans) {
		this.ans = 0;
		for(int i = 2; i*i < l; i++) {
			if(l % i == 0 && l != i) {
				this.ans = 1;
				break;
			}
			else
				continue;
		}
		
	}
		
}
		


























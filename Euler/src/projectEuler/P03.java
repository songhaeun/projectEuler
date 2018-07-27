package projectEuler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 600851475143의 소인수 중에서 가장 큰 수 
public class P03 {

	public static void main(String args[]) {
		
		// 60085147513말고 수를 입력받아서 처리한다고 생각
		// 수 입력받기
		Scanner scan = new Scanner(System.in);
		double su = scan.nextDouble();
		/*
		// 1 먼저 인수를 구하고 얘네들이 소수인지 확인하는 방법-> 시간이 너무 오래 걸림!
		// 소인수들 리스트 만들기???
		List<Double> insu = new ArrayList<Double>();
		
		double l = 2;
		while(l <= su) {
			// 먼저 60085147513의 인수인지
			if(su % l == 0) {
				Check c1 = new Check(l);
				// 소수인거 확인됐으면 리스트에 넣고
				if(c1.getAns() == 0)
					insu.add(l);
				l++;
			}else {
				l++;
			}
				
		}
		System.out.println(insu);
		*/
		
		
		// 2 소인수 분해 이용
		// -> 2부터 시작해서 나누어지는 수가 1이 될때까지 계속 나누기
		// -> 주어진 수가 1이 될 때 나눈 수가 가장 큰 소인수!
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

// 소수인지 확인
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
	
	// 소수면 0 아니면 1 -> 소수인지 확인하는 코드
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
		


























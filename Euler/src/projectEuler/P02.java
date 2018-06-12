package projectEuler;

import java.util.ArrayList;
import java.util.List;

// 피보나치 수열에서 짝수이면서 400만 이하인 항들의 합
// -> 일단 피보나치 수열을 구하고
// -> 거기서 짝수인 애들만 더한다
public class P02 {

	public static void main(String args[]) {
		
		// 일단 400만까지 피보나치 수열을 구하는 코드
		List<Integer> fibo = new ArrayList<Integer>();
		fibo.add(1);
		fibo.add(2);
		
		int p = 0;
		int tp = 0;
		
		while(true) {
			tp = fibo.get(p)+fibo.get(p+1);
			if( tp > 4000000)
				break;
			else
				fibo.add(tp);
			p++;
		}
		//System.out.println(fibo);
		
		// 이제 리스트에서 짝수인 애들만 뽑아내서 합 구하기
		int psum = 0;
		for(Integer check : fibo) {
			if(check % 2 == 0)
				psum += check;
		}
		System.out.println(psum);
	}
}

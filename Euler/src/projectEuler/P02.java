package projectEuler;

import java.util.ArrayList;
import java.util.List;

// 3. 피보나치 수열에서 짝수 항만 뽑아서 관찰 
// 	  List 이용해서 작성해 본 것
public class P02 {

	public static void main(String args[]) {
	
		List<Integer> fibo = new ArrayList<Integer>();
		fibo.add(2);
		fibo.add(8);
		
		int p = 0; 
		int tp = 0;
		int fsum = 0;
		
		while(true) {
			tp = 4 * fibo.get(p+1) + fibo.get(p);
			if(tp > 4000000)
				break;
			else
				fibo.add(tp);
			p++;
		}
		
		for(Integer i : fibo) {
			fsum += i;
		}
		System.out.println(fsum);
	}
}

package projectEuler;

import java.util.ArrayList;
import java.util.List;

// 3. 피보나치 수열에서 짝수 항만 뽑아서 관찰
public class P02 {

	public static void main(String args[]) {
	
		// 2 8 34 144 610 ...
		// -> EF(n) = 4EF(n-1) + EF(n-2)
		
		// -> 피보나치 수열에서 F(n) = 4F(n-3) + F(n-6)이라는 것을 증명해낸다면
		// -> 위의 EF에 관한 식도 증명할 수 있다
		
		// F식 증명하기
		// F(n) = F(n-1) + F(n-2)
		//      = F(n-2) + F(n-3) + F(n-2)
		//      = 2(F(n-3) + F(n-4)) + F(n-3)
		//      = 3F(n-3) + 2F(n-4)
		//     	= 3F(n-3) + F(n-4) + F(n-5) + F(n-6)
		//      = 4F(n-3) + F(n-6)
		//      -> 피보나치 수열에서 세칸씩 떨어진 항들 간에 존재하는 관계식이 증명되었음
		//      -> 따라서 위의 EF식을 활용할 수 있다는 것
		
		int limit = 4000000;
		int fsum = 0; 
		int f1 = 2;
		int f2 = 8;
		int f3 = 4 * f2 + f1;
		
		while(f3 < 4000000) {
			fsum += f1 + f2 + f3;
			f1 = 4 * f3 + f2;
			f2 = 4 * f1 + f3;
			f3 = 4 * f2 + f3;
			System.out.println(f1 + "-" + f2 + "-" + f3);
		}
		System.out.println(fsum);
		// 이렇게짜면 문제가 생기는 이유
		// 1 f3이 4000000을 넘었어도 f1과 f2는 그렇지 않을 수 있는데 fsum에 더해지지 못함
		// 2 2번 풀이 방식에서는 세번째 수 f3만 더하는 코드여서 f3만 4000000이하인지 검사하는 것이 괜찮았지만
		// 3 3번 풀이에서는 f1 f2 f3이 피보나치 수열에서 3번마다 돌아오는 숫자들을 넣어놓은 것이기 떄문에 f3만 검사해서 판단하면 안됨
		//   f1 f2도 다 더해질 애들이기 때문에!
		
	}
}

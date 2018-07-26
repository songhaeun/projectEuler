package projectEuler;

// 1000보다 작은 자연수 중에서 3 또는 5의 배수 모두 더하기
// -> 3의 배수 다 구해서 더하고
// -> 5의 배수 다 구해서 더한 다음에
// -> 15의 배수 다 구해서 더하고 빼주기
public class P01{
	
	public static void main(String args[]) {
		
		int rsum = 0;
		
		for(int i = 0; i < 1000; i++) {
			if(i % 3 == 0)
				rsum += i;
			else if(i % 5 == 0)
				rsum += i;
		}
		// 근데 이렇게 하면 15의 배수들은 if에서 sum3에 더해지니까
		// else if를 그냥 통과하게 되고
		// 그럼 굳이 15의 배수들의 합을 따로 구해서 빼주는 작업을 안해도 되는거 아닌가
		
		System.out.println(rsum);
		
	}
}
// 그런데 이렇게 하나하나 확인하는 작업은 시간이 많이 필요함!(숫자의 범위가 늘어날수록)
// -> 더 효율적인 코드를 짜보자
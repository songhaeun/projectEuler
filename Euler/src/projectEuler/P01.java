package projectEuler;

// �� ȿ������ �ڵ带 ¥����!
public class P01{
	
	static int target = 999;

	// sumDivisibleBy�޼ҵ� ����
	static int sumDivisibleBy(int i) {
		// 3 + 6 + 9 + ... + 999 = 3 * (1 + 2 + 3 + ... + 333)
		// 5 + 10 + 15 + ... + 995 = 5 * (1 + 2 + 3 + ... + 199)
		
		int j = 0;
		j = target / i;
		
		return i * j * (j + 1) / 2; 
	}
	
	public static void main(String args[]) {
		
		System.out.println(sumDivisibleBy(3) + sumDivisibleBy(5) - sumDivisibleBy(15));
		
	}
}

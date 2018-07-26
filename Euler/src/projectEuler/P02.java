package projectEuler;

import java.util.ArrayList;
import java.util.List;

// 2. �Ǻ���ġ �������� ¦���� 3�� ������ ���ƿ� 
//-> 1 1 [2] 3 5 [8] 13 21 [34] 55 89 [144] ...
public class P02 {

	public static void main(String args[]) {
	
		int limit = 4000000;
		int fsum = 0;
		int f1 = 1;
		int f2 = 1;
		int f3 = f1 + f2;
		
		while(f3 < limit) {
			fsum += f3;
			f1 = f2 + f3;
			f2 = f3 + f1;
			f3 = f1 + f2;
		}
		System.out.println(fsum);
		
	}
}

package projectEuler;

import java.util.ArrayList;
import java.util.List;

// 3. �Ǻ���ġ �������� ¦�� �׸� �̾Ƽ� ���� 
// 	    ��ȿ� �����ִ� 1�� �ڵ�(�Ǻ���ġ ���� �⺻ �ڵ�) �̿��ؼ� �ۼ�
public class P02 {

	public static void main(String args[]) {
	
		int limit = 4000000;
		int fsum = 2;
		int f1 = 2;
		int f2 = 8;
		int tf = 0;
		
		while(f2 < 4000000) {
			fsum += f2;
			tf = 4 * f2 + f1;
			f1 = f2;
			f2 = tf;
		}
		System.out.println(fsum);
	}
}

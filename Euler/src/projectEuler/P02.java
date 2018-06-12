package projectEuler;

import java.util.ArrayList;
import java.util.List;

// �Ǻ���ġ �������� ¦���̸鼭 400�� ������ �׵��� ��
// -> �ϴ� �Ǻ���ġ ������ ���ϰ�
// -> �ű⼭ ¦���� �ֵ鸸 ���Ѵ�
public class P02 {

	public static void main(String args[]) {
		
		// �ϴ� 400������ �Ǻ���ġ ������ ���ϴ� �ڵ�
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
		
		// ���� ����Ʈ���� ¦���� �ֵ鸸 �̾Ƴ��� �� ���ϱ�
		int psum = 0;
		for(Integer check : fibo) {
			if(check % 2 == 0)
				psum += check;
		}
		System.out.println(psum);
	}
}

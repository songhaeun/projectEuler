package projectEuler;

import java.util.ArrayList;
import java.util.List;

// 세자리 수를 곱해서 만들 수 있는 가장 큰 대칭수PALINDROME
public class P04 {

	public static void main(String[] args) {
		
		int p1 = 999;
		int p2 = 999;
		int cp = 0;
		
		while(p2 > 100) {
			cp = p1 * p2;
			Palin pal = new Palin(cp);
			pal.divide();
			pal.setFl(2);
			if(pal.getFl() == 1) {
				p2 -= 1;
			}
			else {
				System.out.println(cp);
				break;
			}
		}
	}
}

class Palin{

	private int cp;
	private int fl;
	private int size;
	
	List<Integer> check = new ArrayList<Integer>();
	
	public Palin() {
	
	}
	public Palin(int cp) {
		this.cp = cp;
	}
	
	public void divide() {
		while(cp > 9) {
			check.add(cp % 10);
			cp /= 10;
		}
		check.add(cp);
		setSize(size);
	}
	
	public int getCp() {
		return cp;
	}
	public void setCp(int cp) {
		this.cp = cp;
	}
	// 대칭수면 0 아니면 1
	public int getFl() {
		return fl;
	}
	public void setFl(int fl) {
		for(int l = 0; l < size / 2; l++) {
			if(check.get(l) != check.get(size -l -1)) {
				this.fl = 1;
				break;
			}
			else {
				this.fl = 0;
			}
				
		}

	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = check.size();
	}
		
}


package projectEuler;

import java.util.ArrayList;
import java.util.List;

// ���ڸ� ���� ���ؼ� ���� �� �ִ� ���� ū ��Ī��PALINDROME
public class P04 {

	public static void main(String[] args) {
		
		int p1 = 999;
		int p2 = 999;
		int cp = 0;
		
		while(p2 > 100) {
			cp = p1 * p2;
			Palin pal = new Palin(cp);
			pal.divide();
			if(pal.getFl() == 1) {
				System.out.println(pal.getFl());
				p2 -= 1;
			}
			else {
				System.out.println(pal.getFl());
				System.out.println(cp);
				break;
			}
		}
	}
}

class Palin{

	private int cp;
	private int fl = 1;
	private int size;
	
	List<Integer> check = new ArrayList<Integer>();
	
	public Palin() {
	
	}
	public Palin(int cp) {
		this.cp = cp;
	}
	
	public void divide() {
		while(cp > 10) {
			check.add(cp % 10);
			cp = cp / 10;
		}
		check.add(cp);
		setSize(size);
		System.out.println(check);
	}
	
	public int getCp() {
		return cp;
	}
	public void setCp(int cp) {
		this.cp = cp;
	}
	// ��Ī���� 0 �ƴϸ� 1
	public int getFl() {
		setFl(fl);
		return fl;
	}
	public void setFl(int fl) {
		for(int l = 0; l < size; l++) {
			if(check.get(l) != check.get(size -l -1)) {
				System.out.println(l+" "+size+"����");
				break;
			}
			else {
				this.fl = 0;
				System.out.println(l+" "+size+"������");
				continue;
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

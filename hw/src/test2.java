import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class test2 {
	/*
	 * 
	 *  [TEST2]
[����1]
�� 8���� ����ڰ� ���ڸ� �Է� �մϴ�. �ش� ���ڸ� �Է��ϴ� Scanner�� userinput�̶�� �޼ҵ� ���� ó���� �ؾ� �ϸ�
�ش� ��� ���� ���� ���� �����  result���� ���� ��� �ǵ��� �ϴ� ���α׷��� �����Ͻÿ�.
��Ʈ (�ܺ�Ŭ�������� �޼ҵ�2�� ����)

[����2]
�˻��� ����� �̸��� �˻��ϰ� �˴ϴ�. (���� �޼ҵ忡�� ����)

����� ����Ʈ�� ������ �����ϴ�.  (�ܺ� Ŭ���� �� �ܺ� �޼ҵ忡�� ����)
������, �ǿ�ȯ, �ݻ���, �赿��, �����, ������, ����ȣ, ����

�ش� ����Ʈ ������ ������ �޼ҵ� ���� �����ؾ� �մϴ�.
����ڰ� �Էµ� �̸��� ���� ��� "�ش� ����ڰ� �ֽ��ϴ�." ��� ����ϰ�
���� ��� "�ش� ����ڴ� ���� ���� �ʾҽ��ϴ�." ��� ����մϴ�.

��Ʈ : ���θ޼ҵ忡�� Scanner �۵� �ϸ�, ������ �˻��� �ܺ� Class �� �ܺ� �޼ҵ忡�� ó��
	 */
	public static void main(String[] args) {

		out1 o1 = new out1();
		o1.userinput();
		
		Scanner s = new Scanner(System.in);
		System.out.println("����� �Է�: ");
		String name = s.next();
		s.close();
		out2 o2 = new out2();
		o2.se(name);
		
	}

}

class out1{
	Scanner sc = null;
	int tot=0;
	public void userinput() {
		
		this.sc = new Scanner(System.in);
		int n =0;
		int w=0;
		do {
			System.out.println("���� �Է�: ");
			n = this.sc.nextInt();
			this.tot += n;
			w++;
		}while(w<8);
		this.sc.close();
		this.result();
	}
	public void result() {
		System.out.println(this.tot);
	}
	
}

class out2{
	String arr[] = {"������", "�ǿ�ȯ", "�ݻ���", "�赿��", "�����", "������", "����ȣ", "����"};
	ArrayList<String> al = null;
	public void se(String n) {
		this.al = new ArrayList<>(Arrays.asList(this.arr));
		int w=0;
		int l = this.al.size();
		boolean ck = false;
		do {
			if(n.intern()==this.al.get(w).intern()) {
				System.out.println("�ش� ����ڰ� �ֽ��ϴ�.");
				ck=true;
				break;
			}
			w++;
		}while(w<l);
		if(ck==false) {
			System.out.println("�ش� ����ڴ� ���� ���� �ʾҽ��ϴ�.");
		}
	}
}

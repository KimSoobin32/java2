
import java.util.Scanner;

public class Class_array1 {

	public static void main(String[] args) {
		//Ŭ���� + �޼ҵ� + �迭
		String users[] = {"ȫ�浿", "�̼���", "������"};
		//arrays.lists(users);
		
		/*
		 * ���빮�� ����ڰ� �ڽ��� �̸��� �Է�
		 * ����� �̸��� �ش� class�� ������ ��ϵ� ���������
		 * �̰��� ����������� Ȯ���ϴ� �ڵ带 �ۼ�
		 * ��ϵ� ������� ��� "������ �Ǿ��ֽ��ϴ�."��� ����ϰ�
		 * Ȯ���� ���� ���� ��� "�̰������Դϴ�."��� ���
		 */
		Scanner s = new Scanner(System.in);
		System.out.println("����� ������ �Է��� �ֽñ� �ٶ��ϴ�.");
		String name = s.next();
		arrays.lists(users, name);
		s.close();
	}
	

}

class arrays{
//	public arrays() {
//		arrays ar = new arrays();
//	}
	public static void lists(String a[], String n) {
		//System.out.println(Arrays.toString(a));
		String[] arr = a;
		String msg = "";	//�޼ҵ�� �ش� ���� ������ ���� ����ִ� ���� ��Ȯ�ϰ� �����ؾ� ��
		//String "" or null, int 0���� ǥ��
		boolean ck = false;
		int f = 0;
		int al = arr.length;
		while(f<al) {
			if(n.equals(arr[f])) {
				msg = ("������ �Ǿ��ֽ��ϴ�.");
				ck = true;
			}
			f++;
		}
		if(ck==false) {
			msg = "�̰������Դϴ�.";
		}
		arrays ar = new arrays();
		ar.message(msg);	//msg ���� �̹� ����ϰ� �ֱ� ������ �ʱⰪ ��������� ��
//		arrays ar = null;
	}
	public void message(String m) {
		System.out.println(m);
	}
}
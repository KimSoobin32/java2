import java.util.Arrays;
import java.util.Scanner;

public class example4 {

	public static void main(String[] args) {
		/*
		 * �迭�������� �ʰ� + �⺻(Ŭ����)�޼ҵ� ����
		 * ����ڰ� ���� ������ ���� �Է�
		 * "�б� �л� �̸��� �Է����ּ���." (5�� ����)
		 * ������ �� �����ʹ� 5���� �����Ǿ���
		 * ������ �޼ҵ忡�� �ش� ����ڰ� �Է��� ���� ����Ʈ�� �����Ͽ� ���
		 * ����) ����ڰ� �Է��� ���� :  hong kim park lee jang
		 * 
		 * ���) hong kim park lee jang
		 */
		
		Scanner s = new Scanner(System.in);
		
		String lists = "";
		int f;
		for(f=0;f<=4;f++) {
			System.out.println("�б� �л� �̸��� �Է����ּ���.");
			String u = s.next();
			lists += (u+" ");
		}
		student(lists);
		s.close();
		
		
	}
	
	public static void student(String n) {
		//String a[] = new String[5]; ���⿡ ������ ��� �ʱ�ȭ��...null,null,null...
//
//		String a[] = new String[5];
//		a[i] = n;
//		
//		String memory = n;
//
//		System.out.println(n+" "+i);
//		if(i==4) {			
//			System.out.println(Arrays.toString(a));
//		}
		//System.out.println(n);
		//n = n.trim();
		String userin[] = n.split(" ");	//split : ���ڿ� �Ǵ� ���ڿ��� Ư������ �������� �迭�� ���� �� �ִ� ��ɾ�
		System.out.println(Arrays.toString(userin));
	}

}

import java.util.Scanner;

public class Class_array3 {

	public static void main(String[] args) {
		/*
		 * ���빮��
		 * ���� ���� �迭 �����Ͱ��� �ִ�.
		 * a1 : "ȫ�浿", "�̼���", "������", "������", "������"
		 * a2 : 100, 80, 39, 60, 55
		 * "�˻��ϰ����ϴ� �̸��� �����ּ���." ���
		 * �˻�� �̼����̶�� �˻��� �ϰԵǸ�
		 * "�̼��Ŵ��� 80���Դϴ�." ��� ���
		 */
		
		Scanner s = new Scanner(System.in);
		String a1[] = {"ȫ�浿", "�̼���", "������", "������", "������"};
		String a2[] = {"100", "80", "39", "60", "55"};
		
		
		String a3[][] = {
				{"ȫ�浿", "�̼���", "������", "������", "������"},
				{"100", "80", "39", "60", "55"}
		};
		
		System.out.println("�˻��ϰ����ϴ� �̸��� �����ּ���.");
		String name = s.next();	//����ڰ� �Է��� ������
		mem m = new mem();
		m.aa(a1, a2, name);
		
		System.out.println("�˻��ϰ����ϴ� �̸��� �����ּ���2.");
		String name2 = s.next();
		mem2.aa(a3, name2);
		
		
		s.close();
	}

}

class mem{
	public void aa(String a1[], String a2[], String n) {
		//System.out.println("test");
		int w = 0;
		int al = a1.length;
		String msg="";
		boolean ck = false;
		while(w<al) {
			if(n.equals(a1[w])) {
				msg = a1[w]+"���� "+a2[w]+"���Դϴ�.";
				ck = true;
			}
			w++;
		}
		if(ck == false) {
			msg = "�ش� ��� �ƴ�.";
		}
		System.out.println(msg);
	}
}

class mem2{
	public static void aa(String a3[][], String n) {
		//System.out.println("test");
		int f, ff;
		int al = a3.length;
		int adl = a3[0].length;
		String msg="";
		boolean ck = false;
		for(f=0;f<adl;f++) {
			for(ff=0;ff<al;ff++) {
				if(n.equals(a3[ff][f])) {
					System.out.println(a3[ff][f]+ " " +a3[1][f]);
					ck = true;
				}
			}
		}
		if(ck == false) {
			msg = "�ش� ��� �ƴ�.";
		}
		System.out.println(msg);
	}
}


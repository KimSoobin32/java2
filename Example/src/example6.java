import java.util.Scanner;

public class example6 {

	public static void main(String[] args) {
		/*
		 * 2���迭�̸�, 2���迭 �����ʹ� ������ ����.
		 * user_list : "ȫ�浿", "�̼���", "������", "������", "�������", "������", "����屺"
		 * user_point : 3000 1000 25000 19800 5750 3630 0
		 * 
		 * ���α׷� ���۰� ���ÿ�
		 * "����Ʈ�� �˻��� ������ �Է��ϼ���."
		 * �Է��� ���� ������ class�� �����Ͽ� �ش� �޼ҵ尪���� �Ű������� �̿��Ͽ� ���� ��
		 * �ش� ������� ���
		 */
		
		Scanner s = new Scanner(System.in);
		System.out.println("����Ʈ�� �˻��� ������ �Է��ϼ���.");
		String name = s.next();
		point p = new point();
		p.search(name);
		s.close();
		p = null;
	}

}

class point{
	public void search(String n) {
		//System.out.println("test");
		String user[][] = {
				{"ȫ�浿", "�̼���", "������", "������", "�������", "������", "����屺"},
				{"3000", "1000", "25000", "19800", "5750", "3630", "0"}
		};
		int w=0;
		int ul = user.length;
		int udl = user[0].length;
		while(w<ul){
			int ww = 0;
			while(ww<udl) {
				//System.out.println(user[w][ww]);
				if(n.equals(user[w][ww])) {
					System.out.printf("%s���� ����Ʈ�� %s P�Դϴ�.",user[0][ww],user[1][ww]);
				}
				ww++;
			}
			w++;
		}
		
	}
}
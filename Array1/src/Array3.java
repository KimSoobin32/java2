import java.util.Arrays;
import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		int data[] = {5, 10, 15, 20, 25, 30, 35};
		/*
		 * for each���� ���ؽ� ��ȣ�� �ʿ���� ����� ��� ���
		 * for~do while���� �ε��� ��ȣ�� �ʿ��� �� ���
		 * 
		 * [0][1][2] : �ε��� ��ȣ
		 */
		for(int f : data) {	//int�� �ۿ� ������ �ȵ�, int f�� ���������� data�迭���� �޾Ƽ� �����Ŵ
			if(f%2==0) {				
				System.out.println(f);
			}
		}
		
//		String pay[] = {"�������Ա�", "�ſ�ī��", "�޴���", "��ǰ��", "����"};
//		Scanner sc = new Scanner(System.in);
//		System.out.println("�����ϰ����ϴ� ���¸� �������ּ���.");
//		String pm = sc.next();
//		for(String z : pay) {	//�迭�����Ͱ� �����̹Ƿ� �޴� �������¶��� �������� ����ؾ���!
//			if(pm.equals(z)) {
//				if(z.equals("�޴���")) {
//					System.out.println("���� �ý��� �������� �ش� ������ ����Ͻ� �� �����ϴ�.");
//					
//				}else {
//					System.out.println(pm+"(��)�� ���� ����˴ϴ�.");
//				}
//				//System.out.println(pm+"(��)�� ���� ����˴ϴ�.");
//			}
//		}
//		sc.close();
		
		/*
		 * ���빮��
		 * {"�ܹ���", "����", "ġŲ", "Ŀ��"}
		 * "�ֹ��ϰ��� �ϴ� ������ �������ּ���."
		 * �ش� ������ �� 4���� ����Ե˴ϴ�.
		 * ��, "�ֹ�����"��� ����ڰ� �Է� �� �� ��� �ֹ��� ����Ǹ�, �ֹ������� ���
		 */
//		Scanner s = new Scanner(System.in);
//		String m[] = {"�ܹ���", "����", "ġŲ", "Ŀ��"};
//		String[] ms = new String[4];
//		String a;
//		
//		int ct = 0;
//		for(String f : m) {
//			System.out.println("�ֹ��ϰ��� �ϴ� ������ �������ּ���.");
//			a = s.next();
//			
//			if(a.equals("�ֹ�����")) {
//				break;
//			} else {
//				ms[ct] = a;
//				ct++;
//			}
//		}
//		System.out.println(Arrays.toString(ms));
//		s.close();
		
		//��ĳ�� ���� �ݺ� ���ư��� �ʰ� ���߱� ������(�Է� ��ٸ�����) ���� �ݺ� ������ ������ �˻��ؾ��� ����
		String menus[] = {"�ܹ���", "����", "ġŲ", "Ŀ��"};
		Scanner sc = new Scanner(System.in);
		String user;
		String user_menu[] = new String[4];
		int ct = 0;
//		for(String f : menus) {	//�迭�� �ڷ����� ��ġ�ؾ��� ����
//			/*
//			 * Scanner�� �ݺ��� �ȿ� ���� �� loop�� ������ �ݺ������� ����
//			 * ����ڰ� �Է��� ������ �ݺ��� ������ŭ ����ϴ� ������
//			 */
//			System.out.println("�ֹ��ϰ��� �ϴ� ������ �������ּ���.");
//			user = sc.next();
//			if(user.equals("�ֹ�����")) {
//				break;
//			} else {
//				for(String ff : menus) {	//!!
//					if(user.equals(ff)) {
//						user_menu[ct] = ff;
//						ct++;
//					}
//				}
//			}
//		}
		//do while������ �ٲ㺸��
		int d = 0;
		int ml = menus.length;
		do {
			System.out.println("�ֹ��ϰ��� �ϴ� ������ �������ּ���.");
			user = sc.next();
			if(user.equals("�ֹ��Ϸ�")) {
				break;
			}else {
				int dd = 0;
				do {
					if(user.equals(menus[dd])) {						
						user_menu[ct] = menus[dd];
						//user_menu[ct] = user;
						ct++;
					}
					dd++;
				}while(dd<ml);
			}
			d++;
		}while(d<ml);
		
		
		sc.close();
		System.out.println("�ֹ��Ͻ� �޴��� ������ �����ϴ�. "+Arrays.toString(user_menu));
		
		
		/*
		 * ���빮��
		 * �迭(Array)
		 * ����ڰ� ��ٱ��Ͽ� ������ �����ϰԵ˴ϴ�.
		 * ��, �ش� �ݾ� ����Ʈ�� ������� ����, ���� ��ü ���� �ݾ׸� ���
		 * 
		 * 1500 22000 13000 14500 113800 45000
		 */
//		int p[] = {1500,22000,13000,14500,113800,45000};
//		int h = 0;
//		for(int i : p) {
//			h = h + i;
//		}
//		System.out.println(h);
		
		
	}

}

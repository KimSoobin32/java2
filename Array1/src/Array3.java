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
		Scanner s = new Scanner(System.in);
		String m[] = {"�ܹ���", "����", "ġŲ", "Ŀ��"};
		String[] ms = new String[4];
		String a;
		
		int ct = 0;
//		String li = "";
		for(String f : m) {
			System.out.println("�ֹ��ϰ��� �ϴ� ������ �������ּ���.");
			a = s.next();
//			if(a.equals("�ֹ�����")) {
//				break;
//			} else {			
//				li = li + a;
//			}
			if(a.equals("�ֹ�����")) {
				break;
			} else {
				ms[ct] = f;
				ct++;
			}
		}
		System.out.println(Arrays.toString(ms));
		
//		Scanner s = new Scanner(System.in);
//		String m[] = {"�ܹ���", "����", "ġŲ", "Ŀ��"};
//		String a;
//		
//		String li = "";
//		for(String f : m) {
//			System.out.println("�ֹ��ϰ��� �ϴ� ������ �������ּ���.");
//			a = s.next();
//			if(a.equals("�ֹ�����")) {
//				break;
//			} else {			
//				li = li + a;
//			}
//
//		}		
//		System.out.println(li);
		s.close();
		
		/*
		 * ���빮��
		 * �迭(Array)
		 * ����ڰ� ��ٱ��׿� ������ �����ϰԵ˴ϴ�.
		 * ��, �ش� �ݾ� ����Ʈ�� ������� ����, ���� ��ü ���� �ݾ׸� ���
		 * 
		 * 1500 22000 13000 14500 113800 45000
		 */
		
	}

}

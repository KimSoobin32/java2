import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Double_loop1 {

	public static void main(String[] args) {
		Date today = new Date();
		System.out.println(today);
		
		SimpleDateFormat date = new SimpleDateFormat("YYYY/MM/dd");
		SimpleDateFormat time = new SimpleDateFormat("h/m/s");	//�빮�� H�� 5->17��
		System.out.println(date.format(today));
		System.out.println(time.format(today));
		//format : �԰�ȭ�� ���·� ���� ǥ���� �� ����ϰ� ��. (�ѱ� ��뵵 ����)
		
//		int f;
//		for(f=1;f<=10;f=f+2) {
//			System.out.print(f+" ");
//		}
		
		int money = 10000;
		int coupon = 20;
		double a = coupon * 0.01;
		double b = money * a;
		double c = money - b;	//int c = money - (int)b;
//		System.out.println(a);
//		System.out.println(b);
		System.out.println(c);
		
		/*
		 * ���빮��
		 * 3���� ��ǰ
		 * "���ڵ�� ��ǰ�� �Է½����ּ���."�ݾ��� �Է��ϰ���
		 * "���� %�� �Է����ּ���."��� ������ �Բ�
		 * �ش� ���� ���ڸ� �Է��ϸ�
		 * �����ݾ��� ����Ǿ� ���
		 */
//		Scanner s = new Scanner(System.in);
//		int p1, p2, p3, d;
//		System.out.println("���ڵ�� ��ǰ�� �Է½����ּ���.");
//		p1 = s.nextInt();
//		System.out.println("���ڵ�� ��ǰ�� �Է½����ּ���.");
//		p2 = s.nextInt();
//		System.out.println("���ڵ�� ��ǰ�� �Է½����ּ���.");
//		p3 = s.nextInt();
//		System.out.println("���� %�� �Է����ּ���.");
//		d = s.nextInt();
//		System.out.println(p1 - (p1*(d * 0.01)));
//		System.out.println(p2 - (p2*(d * 0.01)));
//		System.out.println(p3 - (p3*(d * 0.01)));
//		s.close();
		
		int f, ff;
		int total;
		for(f=1;f<=3;f++) {
			//System.out.println(f);
			for(ff=1;ff<=4;ff++) {	//ū�ݺ��� ������ �����ݺ��� ������ ���� �ʵ��� ����
				total = f + ff;
				System.out.println(f+ " + " +ff +" = "+total);
			}
		}
 
	}

}

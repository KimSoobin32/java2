import java.util.Random;
import java.util.Scanner;

public class Class_array2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("0���� 10���� ���ڸ� �ϳ� �����ϼ���.");
		int no = s.nextInt();
		//memorys m = new memorys();
		//�޸� ��ȯ
		memorys m = null;
		m = new memorys();
		m.ms(no);
		m = null;	//�ʱ�ȭ(�޸� ����)
		
		/*
		 * memorys m = new memorys();
		 * m.ms();
		 * m = null;	//�ش� �ν��Ͻ��� ���
		 */
		
		m = new memorys();
		m.rd();
		
	}

}

class memorys{
	public void ms(int user) {
		//System.out.println("test");
		//Math.random() �����޼ҵ� ���� - �⺻ �ڷ����� double
		/*
		 * random => �����ڵ�, �����ڵ�, ��÷, �귿
		 */
		double a = Math.random();	//0.0 ~ 1.0����
		int b = (int)(Math.random()*10);	//0 ~ 9	,double -> int�� ���� (��ȣ ����!)
		int w = 0;
		while(w<=10) {
			int c = (int)(Math.random()*9)+1; //1~9	//*10�� 10���� ���´ٴ� ��, +1�� 1���� �����Ѵٴ� ��
			//System.out.printf("%d ",c);
			w++;
		}
		//System.out.println(c);
		
//		System.out.println(a);
		System.out.println(b);
		if(user==b) {
			System.out.println("��÷");
		}else {
			System.out.println("���� ��ȸ��");
		}
	}
	
	public void rd() {	//random util ����
		Random r = new Random();	//random ��ü ���� �� �ν��Ͻ� ����
		//System.out.println(r.nextInt(10));	//0~9����		,r.nextInt�� ���	,r.nextInt(10)+1 : 1~9
		int w = 0;
		while(w<=5) {
			System.out.println(r.nextInt(45)+1);	//�ζ� 1~45
			w++;
		}
		r = null;
	}
}
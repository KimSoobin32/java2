import java.util.Arrays;
import java.util.Scanner;

public class example8 {

	public static void main(String[] args) {
		/*
		 * ���� ����� ���� ���� ���α׷��� ��û
		 * ����ڰ� �� 5���� ���ڸ� �Է�
		 * "1~46 �� ������ ���ڸ� �Է����ּ���." (5�� ����)
		 * ����ڰ� �Է��� 5���� ���ڸ� �迭�� ����(main���� ó��)
		 * 
		 * �ܺ� class�� �̿��Ͽ� PC�� ���� ��÷��ȣ 5���� �����ϰ� �̾Ƴ���.
		 * PC�� ���� 5���� ���ڸ� �迭�� ���� (�ܺ� class method�� ����)
		 * 
		 * ������ ��� method�� �ϳ� �� �����Ͽ�
		 * ����ڰ� �Է��� 5���� �迭 �����Ϳ� PC�� ���� �迭 �����͸�
		 * �ش� method�� �����Ͽ�, ���
		 * 
		 * ����� ��
		 * Pc ��
		 * 
		 * ��, ��� ����ϴ� �ݺ����� ������ do while������ �ۼ�
		 * 
		 * �ϳ��� Ŭ������ �ΰ��� �޼ҵ�
		 * �ϳ��� pc��, �ϳ��� �����,pc ���� ����
		 * ���ο��� ����� �Է�
		 * 
		 * a�������� a�� �ݺ��������� �Ǿ����� �̰Ÿ� b��
		 */

		Scanner s = new Scanner(System.in);
		int input;
		int user_arr[] = new int[5];
		int d1 = 0;
		do {
			System.out.println("1~46 �� ������ ���ڸ� �Է����ּ���.");
			input = s.nextInt();

			user_arr[d1] = input;

			d1++;
		}while(d1<5);
		s.close();
		card c  = new card();
		c.acard(user_arr);
		c = null;
	}

}

class card{
	public void acard(int user1[]) {	//Pc(5)

		int d = 0;
		int pc_arr[] = new int[5];
		do {
			pc_arr[d] = (int)(Math.random()*46)+1;
			d++;
		}while(d<5);
		card.bcard(user1,pc_arr);
	}
	public static void bcard(int user[], int pc[]) {	//�����(5), Pc(5) ���

		System.out.println(Arrays.toString(user));
		System.out.println(Arrays.toString(pc));
	}
}
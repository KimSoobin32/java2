
public class Switch_loop {

	public static void main(String[] args) {
		String sign = "*";
		int total;
		/* case �ȿ� ������ �ݺ����� ��� ����
		 * ���� ������ �������� ��� �����ϸ�,
		 * case ���� �ٸ��� �۵��ϱ� ������ ������ �Ǵ� ���� ����
		 * ��, case�� �ϳ��� ������ ���� ��� ������ case�� ���� �۵����� ����
		 */
		switch(sign) {
		case "+" -> {
			int f;
			total = 0;
			for(f=1;f<=5;f++) {
				total = total + f;
			}
			System.out.println("�� 1~5���� ���� ���� "+total);
		}
		case "-" -> {
			total = 0;
			System.out.println("�������� ��µ��� �ʽ��ϴ�.");
		}	
		case "*" -> {
			total = 1;
			int d = 1;	//f �ᵵ �� �����̸�
			do {
				total = total * d;
				d++;
			}while(d<=5);
			System.out.println("�� 1~5���� ���� ���� "+total);
		}
		case "/" -> {
			total = 0;
		}

		}
		// System.out.println("�� 1~5���� ���� ���� "+total); ������ ���� �ؿ����� switch case�� ���� ������ for�� �۵� �ȵż� total �ν� ����
		//�Ǵ� int total = 0(6���ο�)���� �̸� �� ������ sysout�ۿ� ���� ��  -> �ʱⰪ �Ź� �ٲ��༭ ȿ�������� ����

	}

}

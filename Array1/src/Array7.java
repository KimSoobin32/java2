import java.util.Arrays;

public class Array7 {

	public static void main(String[] args) {
		/*
		 * ���빮��
		 * �ش� ����� ���� ������ �� �� ������ �����͵� �Բ� ������
		 * �� �� ���������� ���� 3�̸�(������) ���� Ȯ���Ͽ�
		 * �迭 �����͸� �簡��
		 * 
		 * "ȫ�浿", "�̼���", "������", "�������", "������", "������"
		 * 4,3,1,1,2,2
		 * ["������","�������","������","������"]
		 */
		String member[] = {"ȫ�浿", "�̼���", "������", "�������", "������", "������"};
		int lv[] = {4,3,1,1,2,2};	//���� ����, member�� ������ ���� ����, ���� �ε�����ȣ 
		String ms[] = new String[6];
		int ml = member.length;
		int w = 0;
		int ct = 0;
		do {
			if(lv[w]<3) {
				ms[ct] = member[w];
				ct++;
			}
			w++;
		} while(w<ml);
		System.out.println(Arrays.toString(ms));
		//Arrays.toString : ����,����,�Ҽ� []���·� ���� �迭 �������� ����ϴ� �Լ�

	}

}

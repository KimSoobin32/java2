import java.util.Arrays;

public class Array4 {

	public static void main(String[] args) {
		String[] names = new String[3];	//���� ���� �迭, ������ ��������
		String m[] = {"ȫ�浿","�̼���","������"};	//�迭���� �����Ͱ� �ִ� ����
		//System.out.println(names[0]);
		int ct = 0;	//for each���� �ε�����ȣ�� �����Ƿ� ���Ӱ� �ε��� ��ȣ�� �������ֱ� ���� ����
		for(String a : m) {
			//System.out.println(a);			
			//System.out.println(ct);
			if(a.equals("ȫ�浿") || a.equals("������")) {	//�ش� (���� m)�迭�� �� ���ǿ� �´� ���� �߷��� ���ο� �迭���� �߰���
				names[ct] = a;
				ct++;	//�ε�����ȣ�� ���������� �����ϱ����� ������
			}
			
		}
		//int name_ea = names.length;
		System.out.println(names[1]);//������ (�ֳ����cnt
		System.out.println(Arrays.toString(names));	//�迭 ��ü�� ���
		

	}

}
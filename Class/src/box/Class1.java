package box;	//package�� ���� java�� ���� ��Ű�� �Բ� ���� �Ǵ� java���� �ε� ����
//default package�� ���ε��� �����

public class Class1 {

	public static void main(String[] args) {	//main package�߿��� ����Ǵ� ������ java���Ͽ��� ������
		Class2 c2 = new Class2();
		System.out.println(c2.names);
		
		Adata a = new Adata();	//Class2.java�� ������ AdataŬ���� ��ü�� �ε���
		System.out.println(a.names);

	}

}	//�ε��ϰ� ��� �뵵
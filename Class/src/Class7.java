
public class Class7 {

	public static void main(String[] args) {
		//Class�� �⺻ �޼ҵ� ��ü �ʵ尪 ����
		String mid = "hong";
		String mname = "ȫ�浿";
		java1 jv1 = new java1(mid, mname);
		

	}

}

class java1{
	//java1 class�� main���� ��ü ���� �� �ν��Ͻ��� �����ϸ� �ٷ� �۵��ϴ� class �⺻ �޼ҵ��̴�.
	public java1(String a, String b) {	//class���� ����(�⺻ �޼ҵ�), class�� �⺻���� ����ϴ� �޼ҵ� (���� �⺻�޼ҵ�� Ŭ�������� �ϳ��� �� �� �ִ�.)
		System.out.println(a+b);
		java2();	//void �޼ҵ带 �ٷ� ȣ�� �� �� �ִ�.
	}
	public void java2() {
		System.out.println("test");
	}
}
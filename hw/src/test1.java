public class test1 {
	/*
	 * 
	 [TEST1]
[����1] 
���� Class�� public void test()�� �ϳ� �����մϴ�.
main Ŭ�������� �ش� test �޼ҵ尡 ���� �ǵ��� �ϸ� test �޼ҵ�� ������ ���� ó���� �Ǿ�� �մϴ�.
1~10���� �ַܼ� ��� �Ǿ�� ��. 
��Ʈ(setter)

[����2]
���� Class�� return �޼ҵ带 �ϳ� �����մϴ�. ��, return �޼ҵ�� ����(����)�� ó���ϴ� �޼ҵ� �Դϴ�.
main �޼ҵ忡�� �ش� return �޼ҵ�� ���� 5�� ���ڰ����� �����ϴ�.
return �޼ҵ忡���� �ش� ���ڸ� ���� �� ���ϱ� 7�� �Ͽ� ��� ���� main �޼ҵ�� ������ main���� ������� 
��� �ǵ��� �մϴ�. 
��Ʈ(getter)
	
	 */
	public static void main(String[] args) {
		test1 t1 = new test1();
		t1.test();
		System.out.println(t1.re(5));
	

	}
	public void test() {
		
		int w=1;
		do {
			System.out.print(w+" ");
			w++;
		}while(w<11);
	}
	
	public int re(int n) {
		int r = n * 7;
		return r;
	}
	

}


//Thread�� ���� class���� ��� ���� extends (class), implements (interface)
public class thread1 {

	public static void main(String[] args) {
		//���������� ó����
		class_box cb = new class_box();	
		for(int a=0;a<10;a++) {
			//cb.run("Ŭ���� ó����Ȳ "+a);
		}
		
		//�����带 �̿��Ͽ� ���� ó���� ��� ������ �������� ��
		cpu_box cp = null;		
		for(int b=0;b<10;b++) {
			cp = new cpu_box("������ ó����Ȳ "+b);
			//cp.start();
		}
		
		//�����带 �̿��Ͽ� ���� ����ó�� ����̸�, ������ �߻��ϴ��� �ش� ������ �߻��� �����常 ����ó��,  �� �� ������ ��� ó���ϴ� ����
		call_box bb = null;
		int w = 0;
		String msg = "";
		String msg2 = "";
		while(w<10) {
			if(w==5) {
				msg2 = "5";
			}else {
				msg2 = "";
			}
			bb = new call_box(msg+msg2);	//null�ʱ�ȭ �� nullnull->length 8, ""->0
			bb.start();			
			w++;
		}

	}

}

class call_box extends Thread{
	String callname = null;
	public call_box(String z) {
		this.callname = z;
	}
	@Override
	public void run() {
		try {	//if �ۿ� trycatch ����
			if(this.callname.length()>0) {	//���� ���� ���ѵ� ������ �۵�
//				Exception ec = new Exception();
//				throw ec;
				throw new Exception();
			}else {
				System.out.println(this.callname.length());
			}
			//finally -�����
		} catch (Exception e) {
			System.out.println("�ش� �� �� �߸��� �� �߻�");
		}
		
		
	}
}

class cpu_box extends Thread{	//������ : 1,2,3���� �˾Ƽ� ���ư�
	String name = null;
	public cpu_box(String a) {
		this.name = a;
	}
	@Override
	public void run() {	//������ �۵�, �μ��� ���� �� ����-> ������-�⺻�޼ҵ�,this �̿�����
		
		System.out.println(this.name);
	}
}

class class_box{	//�Ϲ� Ŭ���� : 1�� ó���ɶ����� ��ٸ�
	public void run(String name) {
		System.out.println(name);
	}
}
import java.net.Socket;
import java.util.Scanner;

public class ex_client {
	/*
	 * ���� ���빮��. (PORT ��ȣ�� ������ ���ڸ� �Է¹޵��� ��)
	//������ x
	���� ���α׷��� ������. ���� �� ���� ���� �ش� ������ �ϰ� ��
	"����Ͻ� PORT��ȣ�� �Է��ϼ��� : " 9009
	"*** ä�ü��� ����[9009] *****"
	
	Ŭ���̾�Ʈ ���α׷� ������.
	"������ IP ��ȣ�� �Է��� �ּ��� : "
	"������ PORT ��ȣ�� �Է��� �ּ���: "
	
	���� ���� �޼���
	"***** GUEST�� ���� �Ͽ����ϴ�. *****"
	//���Ӹ�
	 */
	public static void main(String[] args) {
		e_client e = new e_client();
		e.ec();

	}

}

class e_client{
	Socket so = null;
	String ip = null;
	int port = 0;
	Scanner sc = null;
	public void ec() {
		try {
			this.sc = new Scanner(System.in);
			System.out.println("������ IP ��ȣ�� �Է��� �ּ��� : ");
			this.ip = this.sc.next();
			System.out.println("������ PORT ��ȣ�� �Է��� �ּ���: ");
			this.port = this.sc.nextInt();
			this.so = new Socket(this.ip,this.port);
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
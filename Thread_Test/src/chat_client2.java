import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

//8002
public class chat_client2 {

	public static void main(String[] args) {
		port_chat2 pc = new port_chat2();
		pc.connect();


	}

}

class port_chat2{
	String ip = "127.0.0.1";
	int port = 8003;	//8002
	Socket sc = null;
	InputStream is = null;
	OutputStream os = null;
	String msg = "";
	public void connect() {
		try {
			while(true) {
				this.sc = new Socket(this.ip,this.port);	//�ݺ� �ȿ�
				this.is = this.sc.getInputStream();
				this.os = this.sc.getOutputStream();
				
				//������ �ش� �޼����� ����
				this.msg ="Ŭ���̾�Ʈ "+this.port;
				this.os.write(this.msg.getBytes());
				this.os.flush();
				
				Scanner sc = new Scanner(System.in);	//break����
				System.out.println("�����Է� : ");
				String say = sc.nextLine();
				this.os.write(say.getBytes());
				this.os.flush();
				//������ �ش� �޼����� ���� ��
			}
			
		} catch (Exception e) {
			
		}
	}
}
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class m_client {

	public static void main(String[] args) {	//java "C:\java6\Net\src\m_client.java"
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ���̵� �Է����ּ���: ");
		String user = sc.nextLine();
		chatclient cc = new chatclient(user);

	}

}
//Ŭ���̾�Ʈ���� ������ ����, ������(����)�� ū�� Ŭ���� - �ڸ��ɰ� - ������
class chatclient{
	static final String ip ="127.0.0.1";
	static final int port = 9009;
	Socket sk = null;
	InputStream is = null;
	OutputStream os = null;
	String message = null;
	String result = null;
	public chatclient(String mid){
		try {
			System.out.println(mid+"�� �����ϼ̽��ϴ�.");
			
			this.sk = new Socket(ip,port);
			this.os = this.sk.getOutputStream();
			this.is = this.sk.getInputStream();
			System.out.println("ä�� ������ �Է��ϴ� �ڵ�");
			
			this.message = mid+" ����";
			this.os.write(this.message.getBytes());
			this.os.flush();
			

			while(true) {
				
				
//				this.sk = new Socket(ip,port);
//				this.os = this.sk.getOutputStream();
//				this.is = this.sk.getInputStream();
//				System.out.println("ä�� ������ �Է��ϴ� �ڵ�");
//				
//				//Scanner sc = new Scanner(System.in);
//				//this.message = sc.nextLine();
//				
//				this.message = mid+" ����";
//				this.os.write(this.message.getBytes());
//				this.os.flush();
				
				
				byte data[] = new byte[4096];
				int n = this.is.read(data);
				this.result = new String(data,0,n);
				System.out.println(this.result);
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
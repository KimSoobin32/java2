import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//Server�� �������� ��Ʈ�� ���� 8001, 8002
public class chat_server {
	/*
	 * [Server - Port2]
	 * 1.Server 8001, 8002
	 * 2.Client 8001, Client 8002
	 *  //server�� ������ ������
	 * 
	 * [Server-Port2]
	 * 1.Server 8003
	 * 2.Client 8003 ��� ����
	 */
	//Exception : bind Exception (port �浹)
	public static void main(String[] args) {
		/*
		int port[] = {8001, 8002};
		int ea = port.length;
		int w = 0;
		openchat oc = null;
		while(w<ea) {
			oc = new openchat(port[w]);
			oc.start();
			w++;
		}
		*/
		int port = 8003;
		openchat oc = null;
		oc = new openchat(port);
		oc.start();

	}

}

class openchat extends Thread{
	String ip = "127.0.0.1";
	int pt = 0;
	ServerSocket sk = null;
	InputStream is = null;
	OutputStream os = null;
	public openchat(int p) {
		this.pt = p;
	}
	@Override
	public void run() {
		try {
			this.sk = new ServerSocket(this.pt);	//�ݺ� ��!!(��������)
			while(true) {
				Socket s = this.sk.accept();	//�ش� ��Ʈ ��� ����, accept�ݺ� �ȿ�
				
				this.is = s.getInputStream();
				this.os = s.getOutputStream();
				
				
				//client���� �޴� �޼���
				byte data[] = new byte[1024];
				int n = is.read(data);
				String message = new String(data,0,n);
				System.out.println(message);
				
			
			}
			
			
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
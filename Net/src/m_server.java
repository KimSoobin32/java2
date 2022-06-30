import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class m_server {

	public static void main(String[] args) { //java "C:\java6\Net\src\m_server.java"
		chatroom cr = new chatroom();

	}

}

class chatroom {	//�⺻���� -> �� �����ڸ��� thread ����
	ServerSocket server = null;
	static final int port = 9009;	//�����忡�� �������� ����ϱ� ���� ,�ٸ� Ŭ���������� ������static
	Socket sk = null;
	
	public chatroom() {
		try {
			this.server = new ServerSocket(port);
			
			
		}catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("****��Ƽ ä�� ����!!*****");
		while(true) {	//������ � ����ų�.. true=����..
			try {
				this.sk = this.server.accept();	//Ŭ���̾�Ʈ ���� �㰡
				
				chat_thread ct = new chat_thread(this.sk); 	//�����Ҷ����� ���ư�, accept ���� ����
				Thread t = new Thread(ct);
				t.start();
				
				
			} catch (Exception e2) {
				System.out.println(e2);
			}
			
		}
	}
}


class chat_thread implements Runnable{
	Socket sk = null;
	InputStream is = null;
	OutputStream os = null;
	String msg = null;
	String result = null;
	Scanner sc = null;
	//�迭�� �޸𸮿� ����Ŵ, �������Ѿ� ��..
	//������ �߻� �� thread�� ���Ӱ� �����ǹǷ� ����ƽ�� �ø��� ������ �������� ��� �ʱ�ȭ�Ǿ����
	static ArrayList<Socket> user = new ArrayList<>();	//������, static �ȳ����� ���� �ȵǰ� �ʱ�ȭ�� ��� ������ 1..
	public chat_thread(Socket s) {	//�������� �޾ƾ� �� ����!!
		this.sk = s;
		user.add(this.sk);	//������ ������ ������
		try {
			System.out.println("ä�ÿ� �����ϼ̽��ϴ�.");
			System.out.println(this.sk);	//Socket[addr=/127.0.0.1,port=53921,localport=9009]
			this.is = this.sk.getInputStream();
			this.os = this.sk.getOutputStream();
			
		} catch (Exception e) {
			System.out.println("Ŭ���̾�Ʈ ���������� �ùٸ��� �ʽ��ϴ�.");
		}
	}
	@Override
	public void run() {
		try {
				byte data[] = new byte[1024];
				int n = this.is.read(data);
				this.msg = new String(data,0,n);
				System.out.println(this.msg);
				
				
//				this.os.write(this.msg.getBytes());		//ȸ��
//				this.os.flush();
//				Thread.sleep(5000);
//				String m = "������ �޼��� ���!!";
//				this.os.write(m.getBytes());
//				this.os.flush();
				
				
			while(true) {
				System.out.println(user.size());
				this.sc = new Scanner(System.in);
				System.out.println("���� �޽����� �Է��ϼ���: ");
				this.result = sc.nextLine();
				
				//Socket[addr=/127.0.0.1,port=53921,localport=9009], 53921,53922 - vport
				/* �迭���ִ� vport �� ���� ������ ���� ����ŭ �ݺ�*/
				for(int j=0;j<user.size();j++) {
					OutputStream all = user.get(j).getOutputStream();	//�迭�� �ִ� ����� vport�� ������ �ϰ� ��, ����� ���� �޸� ����					
					all.write(this.result.getBytes());	//����(������ Ŭ���̾�Ʈ ��ο� ���� ����..
					all.flush();
					
				}
				
			}
			
		} catch (Exception e) {
			System.out.println("Ŭ���̾�Ʈ�� ����Ǿ����ϴ�.");
		} finally {
			try {
				this.is.close();
				this.os.close();
				this.sk.close();
				
			} catch (Exception e2) { }
			
		}
		
	}
}


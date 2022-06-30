import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class chat_client {
	

	public static void main(String[] args) {	//java "C:\java6\Net\src\chat_client.java"

		try {
			client_chat cc = new client_chat();
			cc.chat();
			
		} catch (Exception e) {
			if(e.getMessage()!=null) {
				System.out.println(e);
			}
		}
		
	}

}
/*
 * client���� exit��� �ܾ� �Է��� ��� �������� 000���� �����ϼ̽��ϴ�.
 * ��, Ŭ���̾�Ʈ������ ä���� �����ؾ� �ϸ� �����ʿ����� ä���� ����
 */
class client_chat{
	private final String ip = "127.0.0.1";
	final int port = 8009;
	Scanner sc = null;
	InputStream is = null;
	OutputStream os = null;
	private String mid = null;
	Socket sk = null;
	String msg = null;	//����ڰ� �Է�
	String smsg = null;	//�������� �����ϴ� �޼���
	String msg2 = null;	//����
	String check = null; //exit ����, �ʵ忡 �ø���!!
	public void chat() {
		//!! ���� Stream�� close ���� �ʴ´�. ��� Stream�� ���ϰ� ������ �Ǿ������Ƿ� close �� ���ϵ� �Բ� ���ᰡ �� !! ����
		//finally, exit ���� stream close
		//!! Socket�� �����Ͱ� �� �����Ͱ� ������ �̷������ ������ �������� ������ �߻��� �� ����
		
		try {
			this.sc = new Scanner(System.in);
			System.out.println("���̵� �������ּ���: ");
			this.mid = this.sc.next();
			
			
			int c=0;
			while(true) {
				this.sk = new Socket(this.ip,this.port);
				
				this.is = this.sk.getInputStream();
				this.os = this.sk.getOutputStream();
				
				
				//�б�/���� �׷� �� ����
				if(c==0) {
					this.msg = "["+this.mid+"]: �� �����Ͽ����ϴ�.";
//					this.os2.write(this.msg.getBytes());
//					this.os2.flush();
				}
				
				else {
					this.sc = new Scanner(System.in);
					System.out.println("������ �Է����ּ���: ");
					this.check = this.sc.nextLine().intern();
					this.msg = "["+this.mid+"]: "+this.check;
					
					
					
//					if(this.msg.split("]: ")[1].intern()=="exit") {
//						System.out.println("ä�� ����");
//						is.close();
//						os.close();
//						sk.close();
//					}
					
				}
				
				if(this.check=="exit") {
					this.msg = "["+this.mid+"]: ���� �����ϼ̽��ϴ�.";
					this.os.write(this.msg.getBytes());
					this.os.flush();
					
					this.sk.close();	//system.exit(0)�ϸ� ��ü ���� �Ǿ ū�ϳ�..!
					
				}else {
					this.os.write(this.msg.getBytes());	//null�� ���ư��� �����ɼ� ����
					this.os.flush();
				}
				
//				this.os.write(this.msg.getBytes());
//				this.os.flush();
					
				//�б�
				byte data[] = new byte[1024];
				int n = this.is.read(data);
				this.smsg = new String(data,0,n);
				System.out.println(this.smsg);
						
								
				c++;
				

			}
			
		}catch (Exception e) {
			System.out.println(e);
			if(e.getMessage()!=null) {
				//String error = e.getMessage();
				//if(error.indexOf("OutOfBounds")!=-1) {
					System.out.println("�������� ��ְ� �߻��Ͽ� ���� ����˴ϴ�.");
				//}
//				System.out.println(e);
					
			}
		} 
		
	}
}
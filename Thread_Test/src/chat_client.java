import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

//8001
public class chat_client {
	/*
	 * [Server - Port2]
	 * 1.Server 8001, 8002
	 * 2.Client 8001, Client 8002
	 *  //server는 무조건 스레드
	 * 
	 * 
	 * [Server-Port2]
	 * 1.Server 8003
	 * 2.Client 8003 모두 접속
	 */
	public static void main(String[] args) {
		port_chat pc = new port_chat();
		pc.connect();

	}

}

class port_chat{
	String ip = "127.0.0.1";
	int port = 8003;	//서버에서 오픈한 포트8001
	Socket sc = null;
	InputStream is = null;
	OutputStream os = null;
	String msg = "";
	public void connect() {
		try {
			while(true) {
				this.sc = new Socket(this.ip,this.port);	//반복 안에
				this.is = this.sc.getInputStream();
				this.os = this.sc.getOutputStream();
				
				//서버로 해당 메세지를 전송
				this.msg ="클라이언트 "+this.port;
				this.os.write(this.msg.getBytes());
				this.os.flush();
				
				Scanner sc = new Scanner(System.in);	//break역할
				System.out.println("내용입력 : ");
				String say = sc.nextLine();
				this.os.write(say.getBytes());
				this.os.flush();
				//서버로 해당 메세지를 전송 끝

			}
			
			
		} catch (Exception e) {
			
		}
	}
	
	
}
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//Server에 여러개의 포트를 오픈 8001, 8002
public class chat_server {
	/*
	 * [Server - Port2]
	 * 1.Server 8001, 8002
	 * 2.Client 8001, Client 8002
	 *  //server는 무조건 스레드
	 * 
	 * [Server-Port2]
	 * 1.Server 8003
	 * 2.Client 8003 모두 접속
	 */
	//Exception : bind Exception (port 충돌)
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
			this.sk = new ServerSocket(this.pt);	//반복 밖!!(서버소켓)
			while(true) {
				Socket s = this.sk.accept();	//해당 포트 모두 오픈, accept반복 안에
				
				this.is = s.getInputStream();
				this.os = s.getOutputStream();
				
				
				//client에서 받는 메세지
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
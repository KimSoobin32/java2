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

class chatroom {	//기본사항 -> 각 접속자마다 thread 분할
	ServerSocket server = null;
	static final int port = 9009;	//쓰레드에서 공용으로 사용하기 위함 ,다른 클래스에서도 쓰려고static
	Socket sk = null;
	
	public chatroom() {
		try {
			this.server = new ServerSocket(port);
			
			
		}catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("****멀티 채팅 시작!!*****");
		while(true) {	//스레드 몇개 만들거냐.. true=무한..
			try {
				this.sk = this.server.accept();	//클라이언트 접속 허가
				
				chat_thread ct = new chat_thread(this.sk); 	//접속할때마다 돌아감, accept 정보 보냄
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
	//배열을 메모리에 기억시킴, 누적시켜야 함..
	//젒속자 발생 시 thread가 새롭게 생성되므로 스태틱에 올리지 않으면 누적없이 계속 초기화되어버림
	static ArrayList<Socket> user = new ArrayList<>();	//접속자, static 안넣으면 누적 안되고 초기화됨 계속 사이즈 1..
	public chat_thread(Socket s) {	//소켓으로 받아야 함 주의!!
		this.sk = s;
		user.add(this.sk);	//나가면 접속자 리무브
		try {
			System.out.println("채팅에 참여하셨습니다.");
			System.out.println(this.sk);	//Socket[addr=/127.0.0.1,port=53921,localport=9009]
			this.is = this.sk.getInputStream();
			this.os = this.sk.getOutputStream();
			
		} catch (Exception e) {
			System.out.println("클라이언트 접속정보가 올바르지 않습니다.");
		}
	}
	@Override
	public void run() {
		try {
				byte data[] = new byte[1024];
				int n = this.is.read(data);
				this.msg = new String(data,0,n);
				System.out.println(this.msg);
				
				
//				this.os.write(this.msg.getBytes());		//회신
//				this.os.flush();
//				Thread.sleep(5000);
//				String m = "관리자 메세지 출력!!";
//				this.os.write(m.getBytes());
//				this.os.flush();
				
				
			while(true) {
				System.out.println(user.size());
				this.sc = new Scanner(System.in);
				System.out.println("보낼 메시지를 입력하세요: ");
				this.result = sc.nextLine();
				
				//Socket[addr=/127.0.0.1,port=53921,localport=9009], 53921,53922 - vport
				/* 배열에있는 vport 에 대한 정보를 담은 수만큼 반복*/
				for(int j=0;j<user.size();j++) {
					OutputStream all = user.get(j).getOutputStream();	//배열에 있는 사용자 vport로 전송을 하게 됨, 사용자 별로 메모리 생성					
					all.write(this.result.getBytes());	//전송(접속한 클라이언트 모두에 동시 보냄..
					all.flush();
					
				}
				
			}
			
		} catch (Exception e) {
			System.out.println("클라이언트가 종료되었습니다.");
		} finally {
			try {
				this.is.close();
				this.os.close();
				this.sk.close();
				
			} catch (Exception e2) { }
			
		}
		
	}
}


import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class chat_server {


	//C:\jdk-17_windows-x64_bin\jdk-17.0.3.1\bin
	public static void main(String[] args) {	//java "C:\java6\Net\src\chat_server.java"
		chat ch = new chat();
		ch.chatserver();
		
	}

}

class chat{
	private int port = 8009;
	ServerSocket sk = null;
	Socket so = null;
	Scanner sc = null;
	InputStream is = null;
	OutputStream os = null;
	String mid = null;
	String msg = null;
	String cmsg = null;
	String check = null;
	public void chatserver() {
		try {
			this.sk = new ServerSocket(port);
			this.sc = new Scanner(System.in);
			System.out.println("아이디를 생성하세요 : ");
			this.mid = this.sc.next();
			System.out.println("채팅방 개설 되었습니다.");
			
			while(true) {
				this.so = sk.accept();
				
				this.is = so.getInputStream();
				this.os = so.getOutputStream();
				
				
				
				
				//읽기
				byte data[] = new byte[1024];
				int n = this.is.read(data);
				this.msg = new String(data,0,n);
				System.out.println(this.msg);
				
				
				//이거 없으면 서버 안끊김 (클 끊겨도 안끊김)
				if(this.msg.indexOf("퇴장")!=-1) {
					sk.close();
					sc.close();
					break;
				}
				
				
				//쓰기 //읽는거, 쓰는거 순서 중요.. 
				this.sc = new Scanner(System.in);
				System.out.println("내용을 입력해주세요: ");
				this.check = this.sc.nextLine().intern();
							
				if(this.check=="exit") {
					sk.close();
					so.close();
					break;
				}
				this.cmsg = "["+this.mid+"]: "+this.check;
				this.os.write(this.cmsg.getBytes());
				this.os.flush();
				
				
				
			}
			
			
		}catch (Exception e) {
			// TODO: handle exception
			//System.out.println(e);
			//System.out.println(this.msg.split("]: ")[0].replace("[", "")+"님이 퇴장하셨습니다.");
			
		}
	}
}
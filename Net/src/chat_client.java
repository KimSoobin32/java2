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
 * client에서 exit라는 단어 입력할 경우 서버에서 000님이 퇴장하셨습니다.
 * 단, 클라이언트에서도 채팅이 종료해야 하며 서버쪽에서도 채팅이 종료
 */
class client_chat{
	private final String ip = "127.0.0.1";
	final int port = 8009;
	Scanner sc = null;
	InputStream is = null;
	OutputStream os = null;
	private String mid = null;
	Socket sk = null;
	String msg = null;	//사용자가 입력
	String smsg = null;	//서버에서 전송하는 메세지
	String msg2 = null;	//입장
	String check = null; //exit 검토, 필드에 올리자!!
	public void chat() {
		//!! 각종 Stream을 close 하지 않는다. 모든 Stream이 소켓과 연결이 되어있으므로 close 시 소켓도 함께 종료가 됨 !! 주의
		//finally, exit 에서 stream close
		//!! Socket은 데이터가 본 데이터가 변경이 이루어지면 접속이 끊어지는 현상이 발생할 수 있음
		
		try {
			this.sc = new Scanner(System.in);
			System.out.println("아이디를 생성해주세요: ");
			this.mid = this.sc.next();
			
			
			int c=0;
			while(true) {
				this.sk = new Socket(this.ip,this.port);
				
				this.is = this.sk.getInputStream();
				this.os = this.sk.getOutputStream();
				
				
				//읽기/쓰기 그룹 잘 묶자
				if(c==0) {
					this.msg = "["+this.mid+"]: 님 입장하였습니다.";
//					this.os2.write(this.msg.getBytes());
//					this.os2.flush();
				}
				
				else {
					this.sc = new Scanner(System.in);
					System.out.println("내용을 입력해주세요: ");
					this.check = this.sc.nextLine().intern();
					this.msg = "["+this.mid+"]: "+this.check;
					
					
					
//					if(this.msg.split("]: ")[1].intern()=="exit") {
//						System.out.println("채팅 종료");
//						is.close();
//						os.close();
//						sk.close();
//					}
					
				}
				
				if(this.check=="exit") {
					this.msg = "["+this.mid+"]: 님이 퇴장하셨습니다.";
					this.os.write(this.msg.getBytes());
					this.os.flush();
					
					this.sk.close();	//system.exit(0)하면 전체 종료 되어서 큰일남..!
					
				}else {
					this.os.write(this.msg.getBytes());	//null로 날아가면 정지될수 있음
					this.os.flush();
				}
				
//				this.os.write(this.msg.getBytes());
//				this.os.flush();
					
				//읽기
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
					System.out.println("서버접속 장애가 발생하여 강제 종료됩니다.");
				//}
//				System.out.println(e);
					
			}
		} 
		
	}
}
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ex_server {
	/*
	 * 최종 응용문제. (PORT 번호는 무조건 숫자만 입력받도록 함)
	//쓰레드 x
	서버 프로그램을 실행함. 실행 시 가장 먼저 해당 질문을 하게 됨
	"사용하실 PORT번호를 입력하세요 : " 9009
	"*** 채팅서버 오픈[9009] *****"
	
	클라이언트 프로그램 실행함.
	"접속할 IP 번호를 입력해 주세요 : "
	"접속할 PORT 번호를 입력해 주세요: "
	
	서버 최종 메세지
	"***** GUEST가 참여 하였습니다. *****"
	//접속만
	 */
	public static void main(String[] args) {
		e_sever e = new e_sever();
		e.es();

	}

}

class e_sever{
	ServerSocket sk = null;
	Socket so = null;
	Scanner sc = null;
	int port = 0;
	public void es() {
		this.sc = new Scanner(System.in);
		System.out.println("사용하실 PORT번호를 입력하세요 : ");
		this.port = this.sc.nextInt();
		
		try {
			this.sk = new ServerSocket(this.port);
			System.out.println("*** 채팅서버 오픈["+this.port+"] *****");
			this.so = this.sk.accept();
			System.out.println("***** GUEST가 참여 하였습니다. *****");
			
		} catch (Exception e) {
			System.out.println(e);
//			if(e.getMessage()=="InputMismatchException") {
//				System.out.println("port는 숫자");
//			}
		}
	}
}
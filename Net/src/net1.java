import java.net.InetAddress;
import java.net.UnknownHostException;

public class net1 {

	//UnknownHostException : HOST 정보가 확인되지 않을 경우
	public static void main(String[] args) throws UnknownHostException{
		
		//InetAddress : IPnetworkAddress
		//getByName : 접속할 도메인 주소명
		InetAddress ia = InetAddress.getByName("localhost");
		System.out.println(ia);	//naver.com/223.130.195.200, localhost/127.0.0.1 자신 정보 확인
//		System.out.println(ia.getHostName());	//naver.com	도메인 명
//		System.out.println(ia.getHostAddress());	//223.130.195.200 DNS에 연결된 IP
		//System.out.println(ia.toString());	//구버전
		
		//getAllByName : 도메인의 IP정보 확인, 배열로 구성해야 함
		InetAddress ia2[] = InetAddress.getAllByName("daum.net");
		System.out.println(ia2.length);	//4 이 도메인(naver.com)에 ip 4개 물려있구나, 해당 DNS의 IP갯수
		
		int w=0;
		while(w<ia2.length) {
			System.out.println(ia2[w].getHostAddress());
			w++;
		}


	}

}

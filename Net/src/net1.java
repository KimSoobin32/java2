import java.net.InetAddress;
import java.net.UnknownHostException;

public class net1 {

	//UnknownHostException : HOST ������ Ȯ�ε��� ���� ���
	public static void main(String[] args) throws UnknownHostException{
		
		//InetAddress : IPnetworkAddress
		//getByName : ������ ������ �ּҸ�
		InetAddress ia = InetAddress.getByName("localhost");
		System.out.println(ia);	//naver.com/223.130.195.200, localhost/127.0.0.1 �ڽ� ���� Ȯ��
//		System.out.println(ia.getHostName());	//naver.com	������ ��
//		System.out.println(ia.getHostAddress());	//223.130.195.200 DNS�� ����� IP
		//System.out.println(ia.toString());	//������
		
		//getAllByName : �������� IP���� Ȯ��, �迭�� �����ؾ� ��
		InetAddress ia2[] = InetAddress.getAllByName("daum.net");
		System.out.println(ia2.length);	//4 �� ������(naver.com)�� ip 4�� �����ֱ���, �ش� DNS�� IP����
		
		int w=0;
		while(w<ia2.length) {
			System.out.println(ia2[w].getHostAddress());
			w++;
		}


	}

}

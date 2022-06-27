import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

/* ���� ������ �������� */
//TCP(���� ��������)-���� �ӵ��� ����, UDP(����� ������ ��������)-���� �ӵ��� ����(1:1�� ��� ������ ����)
/* PORT
 * (TCP) 
 * 80 : WEB (http://)
 * 21 : FTP - ���� ���� �� ���
 * 22 : SSH - Linux, Unix ��, ��������, �����ܺ�����
 * 23 : TELNET - Window, �����ܺ�����
 * 443 : WEP (https://)
 * 25 : SMTP (���ϼ���) - ���� ������
 * 110 : POP3 (���Ϲޱ�) - ����, ���� �ޱ�, pc�� �ٿ�, pc���� ���� ����� ���� ������ (������ �������� ����) -�񵿱�ȭ
 * 143 : IMAP (���Ϲޱ�) - ����, ���� �ޱ�, ������ ������ �������� -������ ����ȭ
 */
/* SNMP : UDP (���� �߼� �ý���) */
public class net2 {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ������ �̹��� �ּҸ� �Է����ּ���.");
		//http://t1.daumcdn.net/friends/prod/editor/dc8b3d02-a15a-4afa-a88b-989cf2a50476.jpg
		String url = sc.next();
		//String url = "http://naver.com/123.jpg";
		
		URL u = new URL(url);	//URL(Ŭ����) : ��Ʈ��ũ ��θ� ����
		URLConnection con = u.openConnection();	//�ش� ��θ� ���� , �ֳ� Ȯ��
		
		//System.out.println(con);
		int imgsize = con.getContentLength();	//107989 �뷮, indexOf ��� -1(����), �׿ܿ��� ���� Ȯ��, �ִ��� ������ Ȯ��
		//System.out.println(imgsize);
		
		String imgtype = con.getContentType();	//���� �Ӽ��� Ȯ���ϴ� �κ�
		//System.out.println(imgtype);	//image/jpeg
		
		long date = con.getDate();	//���� �ε� ��¥ 1656316883000(�����ð�)
		//System.out.println(date);
		
		//openStream : URL���� ��� (pc�� ����� ���Ͽ� ���� ����
		InputStream is = u.openStream();	//URL���� ������ �о�� �� �����
		BufferedInputStream bi = new BufferedInputStream(is);	//URL���� ���� ������ �ӽ�����
		FileOutputStream fo = new FileOutputStream("copy.mp4");	//��������
		byte data[] = new byte[1024];	//�ش� ������ ������ 1024 = 1KB
		int imgdata=0;
		int cnt=0;	//�ݺ���
		while((imgdata=bi.read(data))!=-1) {
			fo.write(data,0,imgdata);	//������ ������ �ٿ��ֱ��ϴ� ����
			cnt += imgdata;	//1024�� (1024++
			System.out.println("�ٿ�ε� ��..."+(cnt*100)/imgsize+"%");
		}
		fo.flush();
		fo.close();
		
		//fo.write(bi.read(data));
		System.out.println("�ٿ�ε尡 �Ϸ� �Ǿ����ϴ�.");
		
		sc.close();
	}

}

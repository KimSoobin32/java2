import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class test2 {
	/*
	 * 
	 *  [TEST2]
[문제1]
총 8번의 사용자가 숫자를 입력 합니다. 해당 숫자를 입력하는 Scanner은 userinput이라는 메소드 에서 처리를 해야 하며
해당 모든 값에 대한 더한 결과는  result에서 값이 출력 되도록 하는 프로그램을 제작하시오.
힌트 (외부클래스에서 메소드2개 생성)

[문제2]
검색할 사용자 이름을 검색하게 됩니다. (메인 메소드에서 실행)

사용자 리스트는 다음과 같습니다.  (외부 클래스 및 외부 메소드에서 제작)
강보경, 권용환, 금새록, 김동주, 김민재, 성유리, 손진호, 안희성

해당 리스트 정보는 별도의 메소드 에서 생성해야 합니다.
사용자가 입력된 이름이 있을 경우 "해당 사용자가 있습니다." 라고 출력하고
없을 경우 "해당 사용자는 가입 되지 않았습니다." 라고 출력합니다.

힌트 : 메인메소드에서 Scanner 작동 하며, 데이터 검색은 외부 Class 및 외부 메소드에서 처리
	 */
	public static void main(String[] args) {

		out1 o1 = new out1();
		o1.userinput();
		
		Scanner s = new Scanner(System.in);
		System.out.println("사용자 입력: ");
		String name = s.next();
		s.close();
		out2 o2 = new out2();
		o2.se(name);
		
	}

}

class out1{
	Scanner sc = null;
	int tot=0;
	public void userinput() {
		
		this.sc = new Scanner(System.in);
		int n =0;
		int w=0;
		do {
			System.out.println("숫자 입력: ");
			n = this.sc.nextInt();
			this.tot += n;
			w++;
		}while(w<8);
		this.sc.close();
		this.result();
	}
	public void result() {
		System.out.println(this.tot);
	}
	
}

class out2{
	String arr[] = {"강보경", "권용환", "금새록", "김동주", "김민재", "성유리", "손진호", "안희성"};
	ArrayList<String> al = null;
	public void se(String n) {
		this.al = new ArrayList<>(Arrays.asList(this.arr));
		int w=0;
		int l = this.al.size();
		boolean ck = false;
		do {
			if(n.intern()==this.al.get(w).intern()) {
				System.out.println("해당 사용자가 있습니다.");
				ck=true;
				break;
			}
			w++;
		}while(w<l);
		if(ck==false) {
			System.out.println("해당 사용자는 가입 되지 않았습니다.");
		}
	}
}

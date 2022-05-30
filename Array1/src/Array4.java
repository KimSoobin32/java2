import java.util.Arrays;

public class Array4 {

	public static void main(String[] args) {
		String[] names = new String[3];	//값이 없는 배열, 공간만 만들어놨음
		String m[] = {"홍길동","이순신","강감찬"};	//배열값에 데이터가 있는 상태
		//System.out.println(names[0]);
		int ct = 0;	//for each에는 인덱스번호가 없으므로 새롭게 인덱스 번호를 지정해주기 위한 변수
		for(String a : m) {
			//System.out.println(a);			
			//System.out.println(ct);
			if(a.equals("홍길동") || a.equals("강감찬")) {	//해당 (기존 m)배열값 중 조건에 맞는 값만 추려서 새로운 배열값에 추가함
				names[ct] = a;
				ct++;	//인덱스번호를 순차적으로 적용하기위한 증가값
			}
			
		}
		//int name_ea = names.length;
		System.out.println(names[1]);//강감찬 (왜냐햐면cnt
		System.out.println(Arrays.toString(names));	//배열 전체값 출력
		

	}

}

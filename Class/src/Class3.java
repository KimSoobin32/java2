
public class Class3 {
	//package를 사용하지 못함 (default라서)
	public static void main(String[] args) {
		//자료형(데이터형)	변환
		//double -> int로 변환
		double a = 137.5;
		int b = (int)a;
		
		//int -> double
		int c = 35;
		double d = (double)c;	
		System.out.println(d);
		
		//int -> long으로 바꿔 범위 늘리기도 가능
		
		//String -> int
		String x = "35";
		String x2 = "156";
		//int z = (int)x; 는 다른 형태(문자->숫자)이므로 변환 불가
		int z = Integer.parseInt(x); //parseInt : int형에 사용하는 산술연산 언어 ,int로 바로 바꿈 - 속도 더 빠름 ,진짜문자(ex) a) 넣으면 에러
		//int z = Integer.valueOf(x);	//valueOf 클래스 메소드(메소드함수) 안에 parseInt가 포함되어있음
		//int total = Integer.parseInt(x + x2);	//35156
		int total = Integer.parseInt(x) + Integer.parseInt(x2);	//문자형을 숫자로 변혼하여 산술계산을 처리
		System.out.println(total);
		
		//String -> long : Long 사용 시 Long.parseLong 사용 시(10억 단위 초과)
		String j = "923456789";
		String j2 = "9234567892";
		//int total2 = Integer.parseInt(j) + Integer.parseInt(j2);	//범위 초과
		long total2 = Long.parseLong(j) + Long.parseLong(j2);
		double total3 = (double)total2;	//long -> double
		System.out.println(total2);
		System.out.println(total3);
		
		//문자(char) -> 문자(String) : 기본 지식만 제공..
		char p = 'M';
		String f = String.valueOf(p);	//문자 -> 문자(valueOf)만 사용	 , parse는 못 씀
		System.out.println(f);
	}

}

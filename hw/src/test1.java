public class test1 {
	/*
	 * 
	 [TEST1]
[문제1] 
메인 Class에 public void test()를 하나 생성합니다.
main 클래스에서 해당 test 메소드가 실행 되도록 하며 test 메소드는 다음과 같이 처리가 되어야 합니다.
1~10까지 콘솔로 출력 되어야 함. 
힌트(setter)

[문제2]
메인 Class에 return 메소드를 하나 생성합니다. 단, return 메소드는 정수(숫자)를 처리하는 메소드 입니다.
main 메소드에서 해당 return 메소드로 숫자 5를 인자값으로 보냅니다.
return 메소드에서는 해당 숫자를 받은 후 곱하기 7을 하여 결과 값을 main 메소드로 보내어 main에서 결과값이 
출력 되도록 합니다. 
힌트(getter)
	
	 */
	public static void main(String[] args) {
		test1 t1 = new test1();
		t1.test();
		System.out.println(t1.re(5));
	

	}
	public void test() {
		
		int w=1;
		do {
			System.out.print(w+" ");
			w++;
		}while(w<11);
	}
	
	public int re(int n) {
		int r = n * 7;
		return r;
	}
	

}


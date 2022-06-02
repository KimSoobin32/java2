
public class Class4 {

	public static void main(String[] args) {
		Member mb = new Member();
		//객체 : Member
		//인스턴스 : mb - (닉네임)
		//new Member() : 메모리에 인스턴스명을 생성하여 사용할 수 있도록 함 (메모리 사용)
		mb.user_age = 33;
		System.out.println(mb.user_age);
		int total = 25 * mb.user_agree;
		System.out.println(total);
		
		final int agree = mb.user_agree;	//Member인스턴스 필드값을 로드함 -> agree라는 필드 상수값으로 전달
		mb.user_agree = 80;	//메모리에 등록된 필드명에 해당되는 값을 변경
		System.out.println(mb.user_agree);
		System.out.println(agree);
		
		/* 일반 클래스 메소드 부분 
		 * 일반 클래스 메소드 사용 시 별도의 객체 및 인스턴스를 만들 필요가 없다.
		 * 왜? static 자체가 메모리 인스턴스를 사용한다는 뜻. (new 쓸 필요 없음)
		 */
		//coupon.events();
		mb.member_event();	//필드 없으면 에러( 변수 필드 선언되어있으면 가능) ,필드 선언 안하면 메모리에 올릴값이 없기 때문에 new 쓰면 에러
		Member.member_event();

	}

}

class Member{	//클래스
	String user_name;	//변수 필드명(user_name)을 생성
	int user_age;
	int user_level;
	int user_agree = 6;	//변수 필드명(user_agree)에 필드값(1)을 선언
	public static void member_event() {
		coupon.events();	//기본 메소드에 들어가있어야 작동 됨 ,클래스에 대한 메소드를 바로 호출 가능
		//단, events라는 메소드에 변수 필드 및 변수 필드값을 class에 선언하게 되면
		//그때는 객체 + 인스턴스를 생성해야만 로드가 된다.
	}
}

class coupon{
	public static void events() {
		int cp = 30;
		System.out.println(cp);
	}
}

/* 
 * 하나의 Project 중 서로 다른 package라도 한번 사용한 Class명은 다른 곳에서 사용할 수 없다.
 */

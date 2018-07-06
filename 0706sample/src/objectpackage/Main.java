package objectpackage;

public class Main {

	public static void main(String[] args) {
		//Car 클래스의 인스턴스를 생성해서 데이터 저장
		SmartPhone phone = new SmartPhone();
		phone.setModelName("아이폰");
		phone.setPrice(220);
		phone.setSayang(4);
		//toString을 호출해서 출력
		//System.out.println(phone.toString());
		//System.out.println(phone);

		SmartPhone phone2 = new SmartPhone();
		phone2.setModelName("아이폰");
		phone2.setSayang(2);
		phone2.setPrice(230);
		
		System.out.println(phone == phone2); // 두개의 영역이 다르게 만들어졌기때문에 false
		System.out.println(phone.equals(phone2));
		
		
	}

}


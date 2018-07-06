package exception;

public class Main3 {

	public static void main(String[] args) {
		//java.lang.Thread 라는 클래스에는 sleep이라는 메소드가
		// 있는데 이 메소드는 매개변수로 대입된 시간 만큼 실행을 중지 시키는 역할을 합니다.
		// 이 메소드를 이용해서 1-10까지를 1초씩 쉬면서 출력
		
		for(int i=1;i<=10;i=i+1) {
			System.out.println("1-10까지 출력" + i);
			try {
				Thread.sleep(1000); //1초씩 느리게 api문서에서 static 이면 그냥 쓰면 된다.
			} catch (Exception e) {
			}
		}

	}

}

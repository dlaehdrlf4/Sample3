package exception;

public class Main4 {

	public static void main(String[] args) { //throws Exception 옆에 이것을 치면 try catch문을 안넣어줘도 되지만 이것은 운영체제가 해결하는 것이지만 이걸 쓰는걸 권장하지 않는다.
		//image0.png, image1.png, image2.png
		//=>위 3개의 문자열 1초마다 번갈아가면서 무한 반복해서 출력하는 로직을 작성
		//String [] ar = {"image0.png","image1.png","image2.png"};
		/*int idx = 0;
		for(;;) { // 무한 반복한다.
			System.out.println("image" + (idx%3) + ".png" ); // 123을 순차적으로 한다 순차적으로 작성하기 위해서 % 연산자를 쓰면 된다. 패턴을 갖는것
		try {
			Thread.sleep(1000); //1초씩 느리게 api문서에서 static 이면 그냥 쓰면 된다.
		} catch (Exception e) {
		}
		idx = idx +1;   // 무안 반복하면서 값을 1씩 증가 시킨다.
	}*/
		//김기태, 이종범, 최향남 , 이대진을 번갈아 가면서 출력
		
		String [] ar = {"김기태", "이종범", "최향남", "이대진"};
		int idx = 0;
		try {
		for(;;) {
			System.out.println("image" + (idx%4) + ar[idx%4] );
			idx = idx +1;
			Thread.sleep(1000); //1초씩 느리게 api문서에서 static 이면 그냥 쓰면 된다.
		}
}
		 catch (Exception e) {
			}
}
}
 // 위에는 내가 for문으로 짜보았고 밑에는 while문으로 짜보았음
/*String [] ar = {"김기태", "이종범", "최향남", "이대진"};
int idx = 0;
int size = ar.length;
while(true) {
	System.out.println( ar[idx%size] );

	try {
		Thread.sleep(1000); //1초씩 느리게 api문서에서 static 이면 그냥 쓰면 된다.
	} catch (Exception e) {
	}
	idx = idx +1;
}
}
}*/
	
		



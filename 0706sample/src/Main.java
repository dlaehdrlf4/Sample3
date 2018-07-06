
public class Main {

	public static void main(String[] args) {
		/*//프로그램 종료
		System.exit(0); //instructor이 필요 없다. 왜냐 static이기 떄문에
		System.out.println("이 문장은 실행 안됨");
		
	}	*/
		
		int [] ar = {10,20,30};
		for(int i = 0; i <3;i=i+1) {
			System.out.println(ar[i]);
		}
		System.out.println("배열 데이터 전부 읽기");
	}
}

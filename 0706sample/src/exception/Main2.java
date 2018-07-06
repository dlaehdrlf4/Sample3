package exception;

public class Main2 {

	public static void main(String[] args) {
		//문자열 배열을 생성
		String [] ar = {"sddf","sdfsdf"};
		try {
		//배열의 데이터를 순화하면서 출력
		int size = ar.length;
		//size까지 진행해서 예외가 발생
		for(int i=0;i<size;i=i+1) {
			System.out.println(ar[i]);
			if(i>0) {
				throw new NumberFormatException("강제로 예외 발생");
			}
			//System.out.println(Integer.parseInt(ar[i]));
		}
	}
		/*catch(ArrayIndexOutOfBoundsException e) {
			//예외 내용 출력
			System.out.println(e.getMessage());
			//예외 내용을 추적
			e.printStackTrace();
		}*/
		catch(Exception e) { //Exception이 상위라서 다 받아버린다 예외 처리하는 것들을
			//예외 내용 출력
			System.out.println(e.getMessage());
			// 예외 내용을 추적
			e.printStackTrace();
		} finally{
			System.out.println("예외 발생 여부와 상관없이 수행");
		}
	}
}

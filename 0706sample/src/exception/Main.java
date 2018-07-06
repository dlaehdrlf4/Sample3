package exception;

public class Main {

	public static void main(String[] args) {
		try { // 문제가 있을 법한 코드를 여기에 넣는다.
		int i = 20;
		int j = 0;
		int result = i/j;
		System.out.println("결과 = " + result);
		}
		catch(Exception e) {
	}
		System.out.println("예외 발생 후 실행");
		
		String str = null; //NullPointerException : null이 부른게 없어서 // 넘길 때 많이 발생한다 
		str.charAt(10); // 예외가 발생하는 곳을 보는게아니고 . 앞에 있는 것을 보아야 한다. str을 보아야한다.
	}
}


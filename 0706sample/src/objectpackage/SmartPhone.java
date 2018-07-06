package objectpackage;

public class SmartPhone {
	// 모델명, 사양, 가격
	private String modelName;
	private int sayang;
	private int price;
	
	//인스턴스 변수를 사용하기 위한 접근자 메소드 - getter & setter
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public int getSayang() {
		return sayang;
	}
	public void setSayang(int sayang) {
		this.sayang = sayang;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	// 내부 데이터의 값을 빠르게 확인하기 위한 용도로 사용
	@Override
	public String toString() {
		return "SmartPhone [modelName=" + modelName + ", sayang=" + sayang + ", price=" + price + "]";
	}
	
	//2개의 내용이 같은지 비교하는 메소드
	public boolean equals(SmartPhone other) {
		//호출하는 인스턴스의 modelName 과 매개변수의 modelName이 같으면
		//true를 리턴하고 그렇지 않으면	 false를 리턴 
		boolean result = false;
		if(modelName.equals(other.modelName)) { //똑같은거를 나타낼때 equal를 쓴다.
			result = true;
		}
		return result;
	}	
}



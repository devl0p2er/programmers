package firstjava;

public class Truck extends Car {
	public Truck(){ //기본 생성자 생성 
		super("소방차"); //Truck의 생성자가 호출될때 자동으로 부모 생성자 호출
		System.out.println("Truck의 기본 생성자입니다.");
	
	}

}

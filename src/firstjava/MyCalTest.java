package firstjava;

public class MyCalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new MyCal();
		cal.plus(3, 4);
		int i = cal.exec(5, 6);
			System.out.println(i);
			
		Calculator.exec2(3, 4);	 //static한 메서드 사용시에는인터페이스명을 기입 참조변수.메소드는X 
	}
	

}

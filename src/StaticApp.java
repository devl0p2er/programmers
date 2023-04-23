class Foo{
	public static String classVar = "I class var";
	public String instanceVar = "I instance var"; //두개의 변수 생성
	public static void classMethod() {
		System.out.println(classVar); //클래스메소드 안에서는 클래스변수에는 접근이 가능했는데 
		//System.out.println(instanceVar); //인스턴스 변수에는 접근할 수 없다. 
	}
	public void instanceMethod() {
		System.out.println(classVar); //인스턴스 메소드 안에서는 클래스 변수와 인스턴스 변수 모두에 접근이 가능하다. 
		System.out.println(instanceVar); //라는 것을 알 수 있음 
	}
}
public class StaticApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Foo.classVar); //클래스를통해서 classVar에는 접근이 되나? ok!
		//System.out.println(Foo.instanceVar); //instanceVar에는 접근이 되나? Error! 
		//인스턴스는 인스턴스를 통해서 사용하도록 고안된 변수이다. 
		
	}

}

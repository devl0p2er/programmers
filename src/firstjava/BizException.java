package firstjava;

public class BizException extends RuntimeException {
	public BizException(String msg) {
		super (msg);
	}
	public BizException (Exception ex) {
		super (ex);
	}
}



//익셉션 객체에서는 생성자만 지정해주 됨. 
// 오류 값을 가지고 왔을때 super에세 메시지를 보내보는 
// 익셉션을부모의 생성자에게 넘겨줄 수 있는 
// 이미 부모클래스가 같은 기능을 가지고 있는 생성자가 있기때문에 사용자가 정의한 익셉션 객체에서 따로 할 일이 없음 
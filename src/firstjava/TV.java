package firstjava;

public interface TV { //구현은 하지 않고 기능을 갖고있는것. 
	public int MTN_VOLUME=0;
	public int MTN_VOLUME=100;
	
	
	public void turnOn(); //추상클래스와 비슷 하지만 abstract 입력x 
	public void turnOff();
	public void volume(int volume);
	public void channel(int channel);
}
  
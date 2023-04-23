 package firstjava;

public class LedTV implements TV {

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("켜다");
	}

	@Override
	public void turnOff() {
		System.out.println("끄다");
	}

	@Override
	public void volume(int volume) {
		System.out.println("볼륨을 조정하");
	}

	@Override
	public void channel(int channel) {
		System.out.println("채널을 조정하다");
	}

}

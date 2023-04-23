package firstjava;

public interface Calculator {
	public int plus (int i, int j);
	public int multiple(int i, int j); //구현시 에러 
	
	default int exec(int i,int j) { 
		return i + j;
	}	
	public static int exec2(int i, int j) {
		return i*j; //유틸리티성 인테페이스 생성 가능해짐 
	}
	}

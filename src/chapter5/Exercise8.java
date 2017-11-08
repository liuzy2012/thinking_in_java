package chapter5;

public class Exercise8 {
	public static void main(String[] args) {
		new Exercise8().method01();
	}
	void method01(){
		this.method02();
		method02();
	}
	void method02(){
		System.out.println("被调用...");
	}
	
}

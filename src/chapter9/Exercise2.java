package chapter9;
abstract class Myabstract{
	void method01() {
		System.out.println("Myabstract.method01()");
	}
}
public class Exercise2 {
	public static void main(String[] args) {
		new Myabstract() {
		};
	}
}

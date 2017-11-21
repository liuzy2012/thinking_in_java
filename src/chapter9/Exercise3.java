package chapter9;
class BaseClass{
	public BaseClass() {
		print();
		// TODO Auto-generated constructor stub
	}
	void print() {
		System.out.println("Base.print()");
	}
}
class Myclass extends BaseClass{
	private int i=1;
	void print() {
		System.out.println("MyClass.print() i="+i);
	}
}
public class Exercise3 {
	public static void main(String[] args) {
		new Myclass().print();
	}
}

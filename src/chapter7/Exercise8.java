package chapter7;


class Test{
	public Test(int i) {
		System.out.println("Test constructor");
	}
}
class Test1 extends Test{
	Test1() {
		super(10);
		System.out.println("default Test1 constructor");
		// TODO Auto-generated constructor stub
	}
	Test1(int i){
		super(i);
		System.out.println("Test1 constructor");
	}
}
public class Exercise8 {
	public static void main(String[] args) {
		new Test1();
	}
}

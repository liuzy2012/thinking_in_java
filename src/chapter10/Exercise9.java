package chapter10;

interface A{
	void method01();
}
public class Exercise9 {
	A getA() {
		class myA implements A{
			public void method01() {
				System.out.println("return myA()");
			}
		}
		return new myA();
	}
	public static void main(String[] args) {
		A a=new Exercise9().getA();
		a.method01();
	}
}

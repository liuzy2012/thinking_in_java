package chapter10;
class OuterClass{
	public OuterClass() {
	System.out.println("Outer.class");
		// TODO Auto-generated constructor stub
	}
	class InnerClass{
		public InnerClass() {
			System.out.println("Inner.class");
			// TODO Auto-generated constructor stub
		}
	}
}
public class Exercise5 {
	public static void main(String[] args) {
		OuterClass oc=new OuterClass();
		OuterClass.InnerClass oci=oc.new InnerClass();
	}
}

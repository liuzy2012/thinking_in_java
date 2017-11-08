package chapter5;

public class Exercise3 {
	public Exercise3() {
		// TODO Auto-generated constructor stub
		System.out.println("This is default constructor");
	}
	public Exercise3(String s){
		System.out.println("constructor "+s);
	}
	public static void main(String[] args) {
		Exercise3 ex3=new Exercise3();
		ex3=new Exercise3("test");
	}
}

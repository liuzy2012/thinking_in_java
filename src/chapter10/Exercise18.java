package chapter10;

import chapter10.A2.A1;

class A2{
	static class A1{
		public A1() {
			System.out.println("innerstaticclass created");
			// TODO Auto-generated constructor stub
		}
	}
}
public class Exercise18 {
	public static void main(String[] args) {
		 A1 a1=new A1();
	}
}

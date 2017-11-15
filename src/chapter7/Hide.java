package chapter7;
class Homer{
	char doh(char c){
		System.out.println("doh(char)");
		return 'd';
	}
	float doh(float f){
		System.out.println("doh(float)");
		return 1.0f;
	}
}
class Milhouse{}
class Bart extends Homer{
	@Override
	char doh(char c){
		System.out.println("doh(Bart char)");
		return 'd';
	}
	
}
public class Hide {
	public static void main(String[] args) {
		Bart b=new Bart();
		b.doh(2.0f);
		b.doh('c');
	}
}

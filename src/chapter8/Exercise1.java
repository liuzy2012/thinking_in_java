package chapter8;

class Cycle{
	void ride(Cycle c) {
		System.out.println("Cycle ride..."+c.toString());
	}
}
class Unicycle extends Cycle{
	
}
class Bycycle extends Cycle{
	
}
class Tricycle extends Cycle{
	
}
public class Exercise1 {
	public static void main(String[] args) {
		new Cycle().ride(new Unicycle());
		new Cycle().ride(new Bycycle());
		Cycle sCycle=new Bycycle();
		System.out.println(sCycle.toString());
	}
}

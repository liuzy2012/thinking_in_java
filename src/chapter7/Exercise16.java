package chapter7;
class Amphibian{
	public void run(Amphibian amphibian){
		System.out.println(amphibian.toString());
	}
	public void eat(){
		System.out.println("eating...");
	}
}
class Frog extends Amphibian{
	public void run(Frog frog){
		System.out.println(frog.toString());
	}
	public void eat(){
		System.out.println("eating...2");
	}
}
public class Exercise16 {
	public static void main(String[] args) {
		Amphibian amphibian=new Frog();
		amphibian.eat();
	}
}

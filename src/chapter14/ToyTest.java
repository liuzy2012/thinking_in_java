package chapter14;

interface HasBatteries{}
interface Waterproof{}
interface Shoots{}

class Toy{
	Toy() {}
	Toy(int i){}
}
class FancyToy extends Toy implements HasBatteries,Waterproof,Shoots{
	FancyToy(){
		super(1);
	}
}

public class ToyTest {
	static void printInfo(Class cc) {
		System.out.println("Class name: "+cc.getName()+" is interface?["+cc.getSimpleName());
		System.out.println();
		
	}
	public static void main(String[] args) {
		
	}
}

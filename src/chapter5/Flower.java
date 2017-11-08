package chapter5;
/*
 * 构造器使用this逐个调用其他构造器
 * 
 * */
public class Flower {
	int petalCount=0;
	String s="initial value";
	Flower(int petals) {
		petalCount=petals;
		System.out.println("构造器，只有int参数,petalCount= "+petalCount);
	}
	Flower(String ss) {
		System.out.println("构造器，只有string参数, s= "+ss);
		s=ss;
	}
	Flower(String s,int petals) {
		this(petals);
		this.s=s;
		System.out.println("string和int参数");
	}
	Flower() {
		this("hi", 47);
		System.out.println("默认构造器（）不含参");
	}
	void printPetalCount(){
		System.out.println("petalCount = "+petalCount+" s = "+s);
	}
	public static void main(String[] args) {
		new Flower().printPetalCount();
	}
}

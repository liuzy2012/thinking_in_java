package chapter14;
import java.util.*;
class Initable{
	static final int staticFinal=47;
	static final int staticFinal2=
			ClassInitialization.rand.nextInt(1000);
	static {
		System.out.println("Initializint Initable");
	}
}
class Initable2{
	static int staticNonFinal=147;
	static {
		System.out.println("Initializing Initable2");
	}
}
class Initable3{
	static int staticNonFinal=74;
	static {
		System.out.println("Initializint Initable3");
	}
}
public class ClassInitialization {
	public static Random rand=new Random(47);
	public static void main(String[] args)  throws Exception{
		Class initable=Initable.class;	//使用类字面变量生成类引用
		System.out.println("After creating Initable ref");
		System.out.println(Initable.staticFinal);
		System.out.println(Initable.staticFinal2);//因为不是一个编译期常量，所以这里类会进行初始化
		System.out.println(Initable2.staticNonFinal);//如果一个static域不是final的，那么要先进行链接（为这个域分配存储空间）和初始化（初始化该存储空间）
	}
}

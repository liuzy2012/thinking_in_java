package chapter5;

public class Leaf {
	int i=0;
	Leaf increment(){
		i++;
		return this;//返回当前引用的对象
	}
	void print(){
		System.out.println("i="+i);
	}
	public static void main(String[] args) {
		Leaf x=new Leaf();
		x.increment().increment().increment().print();
	}
}

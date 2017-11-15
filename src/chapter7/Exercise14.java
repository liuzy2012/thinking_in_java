package chapter7;
class Engine1{
	public void start(){}
	public void rev(){}
	public void stop(){}
	public void service(){
		System.out.println("Engine start");
	}
}


class Car1 {
	public Engine1 engine=new Engine1();
	public Wheel[] wheel=new Wheel[4];
	public Door
		left=new Door(),
		right=new Door();
	public Car1() {
		for(int i=0;i<4;i++)
			wheel[i]=new Wheel();
		// TODO Auto-generated constructor stub
	}
}
public class Exercise14 {
	public static void main(String[] args) {
		Car1 car=new Car1();
		car.left.window.rollup();
		car.engine.service();
	}
}

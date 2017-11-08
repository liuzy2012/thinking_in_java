package chapter5;

public class Exercise9 {
	Exercise9(int x) {
		// TODO Auto-generated constructor stub
		this(""+x);
		System.out.println("调用int构造器");
	}
	Exercise9(String x){
		System.out.println("调用string构造器..."+x);
	}
	public static void main(String[] args) {
		new Exercise9(6666);
	}
}
/*
 * 
 *
output: 
 调用string构造器...6666
调用int构造器
 
 * 
 * 
 * */
 
package chapter3;

public class Exercise9 {
	public static void main(String[] args) {
		for(int i=1;i<10;i++)
			System.out.print(Fibonacci(i)+" ");
	}
	static int Fibonacci(int n){
		if(n<=2)
			return 1;
		else
			return Fibonacci(n-1)+Fibonacci(n-2);
	}
}

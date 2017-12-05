package chapter18;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

interface Generator<T>{
	T next();
}
class Customer{
	private static long counter=1;
	private final long id=counter++;
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public String toString() {
		return "Customer "+id;
	}
	public static Generator<Customer> generator(){
		return new Generator<Customer>() {
			public Customer next() {
				return new Customer();
			}
		};
	}
}
class Teller{
	private static long counter=1;
	private final long id=counter++;
	private Teller(){
		
	}
	public String toString() {
		return "Teller "+id;
	}
	public static Generator<Teller> generator=
			new Generator<Teller>() {
		public Teller next() {
			return new Teller();
		}
	};
}
public class BankTeller {
	Random rand=new Random(47);
	Queue<Customer> line=new LinkedList<Customer>();
}





package chapter12;
public class Exercise3 {
	public static void main(String[] args) {
		char[] array = new char[10];
		try {
		array[10] = 'x';
		} catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("e = " + e);
		}
	}
}

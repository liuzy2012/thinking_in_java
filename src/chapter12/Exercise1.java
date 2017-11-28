package chapter12;

public class Exercise1 {
	public static void main(String[] args) {
		try {
			throw new Exception("Exercise.1");
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Exception end...");
		}
	}
}

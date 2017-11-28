package chapter12;

public class Exercise2 {
	public static void main(String[] args) {
		String st=null;
		try {
			char c=st.charAt(2);
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
}

package chapter14;

public class GenericClassReferences {
	public static void main(String[] args) {
		Class intClass=int.class;
		System.out.println(intClass.getName());
		intClass=double.class;
		System.out.println(intClass.getName());
		Class<Integer> genericIntClass=int.class;
		System.out.println(genericIntClass.getName());	//int
		genericIntClass=Integer.class;
		System.out.println(genericIntClass.getName());	//java.lang.Integer
		//genericIntClass=double.class; Type mismatch: cannot convert from Class<Double> to Class<Integer>
		Class<?> myIntClass=int.class;
		myIntClass=double.class;
	}
}

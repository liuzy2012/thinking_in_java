package chapter5;
class TestFinalize{
	int x;
	@Override
	protected void finalize(){
		System.out.println("finalize()方法被调用");
	}
}
public class Exercise10 {
	public static void main(String[] args) {
		new TestFinalize();
		System.gc();
	}
}
/*
 *由于产生的垃圾不够多，所以不会输出任何内容 
 * 
 * */
 
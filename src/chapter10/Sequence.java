package chapter10;
/*
 * 接口 Selector
 * */
interface Selector{
	boolean end();
	Object current();
	void next();
}
public class Sequence {
	private Object[] items;
	private int next=0;
	public Sequence(int size) {
		items=new Object[size];
	}
	public void add(Object x) {
		if(next<items.length)
			items[next++]=x;
	}
	/*
	 * 内部类实现了Selector接口，即实现了简单的迭代器
	 * */
	private class SequenceSelector implements Selector{
		private int i=0;
		public boolean end() {
			return i==items.length;
		}
		public Object current() {
			return items[i];
		}
		public void next() {
			if(i<items.length)
				i++;
		}
	}
	public Selector selector() {
		return new SequenceSelector();
	}
	public static void main(String[] args) {
		Sequence sequence=new Sequence(10);
		for(int i=0;i<10;i++) {
			sequence.add(Integer.toString(i));
		}
		Selector selector=sequence.selector();
		while(!selector.end()) {
			System.out.print(selector.current()+" ");
			selector.next();
		}
	}
}

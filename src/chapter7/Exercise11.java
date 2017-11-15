package chapter7;
class Cleanser{
	private String s="Cleanser";
	public void append(String a){
		s+=a;
	}
	public void diilute(){
		append("dilute()");
	}
	public void apply(){
		append("apply()");
	}
	public void scrub(){
		append("scrub()");
	}
	public String toString(){
		return s;
	}
}
class Detergent {
	Cleanser cleanser=new Cleanser();
	public void apply(){
		cleanser.append("Detergent apply()");
	}
	public static void main(String[] args) {
		Detergent x=new Detergent();
		x.apply();
	}
}
public class Exercise11 {

}

package chapter12;

class BaseballException extends Exception{}
class Foul extends BaseballException{}
class Strike extends BaseballException{}
abstract class Inning{
	public Inning() throws BaseballException{}
	public void event() throws BaseballException{
		
	}
	public abstract void atBat() throws Strike,Foul;
	public void walk() {}
	
}

public class StormyInning {

}

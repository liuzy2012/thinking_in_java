package chapter7;

class Art{
    Art(){
        System.out.println("Art constructor");
    }
}
class Drawing extends Art{
    Drawing(){
    	System.out.println("Drawing construcctor");
    }
}
public class Cartoon extends Drawing{
    
    public static void main(String[] args){
        Cartoon x=new Cartoon();
    }
}


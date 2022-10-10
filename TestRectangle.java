import java.util.Scanner;
public class TestRectangle {
    public static void main(String []args){
		Rectangle r1=new Rectangle(3,5);
		System.out.println(r1.area());
		System.out.println(r1.perimeter());
		System.out.println(r1.toString());
		
		Box b1=new Box(3,5,2);
		System.out.println(b1.area());
		System.out.println(b1.volume());
		System.out.println(b1.toString());
    }
}
import java.util.Scanner;
class Test{
	public static void main(String[] args) {
		DemoTest d=new DemoTest();
		System.out.println(d);
		d.display();
		String s=new String();
		System.out.println(s);
		System.out.println(s.length());
		// int a;
		// System.out.println(a);
	}
}
class DemoTest{
	String s;
	Scanner sc;
	void display(){
		System.out.println(s);
		System.out.println(sc);
	}
}
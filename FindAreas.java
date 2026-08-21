class Figure{
	double dim1,dim2;
	Figure(double a,double b){
		dim1=a;
		dim2=b;
	}
	double area(){
		System.out.println("Area is undefined");
		return 0;
	}
}
class Rectangle extends Figure{
	Rectangle(double a,double b){
		super(a,b);
	}
	double area(){
		System.out.println("Area of rect");
		return dim1*dim2;
	}
}
class Triangle extends Figure{
	Triangle(double a,double b){
		super(a,b);
	}
	double area(){
		System.out.println("Area of tri");
		return dim1*dim2/2;
	}
}
class FindAreas{
	public static void main(String[] args) {
		Figure f=new Figure(10,10);
		Rectangle r=new Rectangle(9,5);
		Triangle t=new Triangle(10,8);
		Figure fr;
		fr=r;
		System.out.println("Area="+fr.area());
		fr=t;
		System.out.println("Area="+fr.area());
		
	}
}
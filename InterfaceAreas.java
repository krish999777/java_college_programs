interface Figure{
	double area();
}
class Rectangle implements Figure{
	double dim1,dim2;
	Rectangle(double a,double b){
		dim1=a;
		dim2=b;
	}
	public double area(){
		System.out.println("Area of rect");
		return dim1*dim2;
	}
}
class Triangle implements Figure{
	double dim1,dim2;
	Triangle(double a,double b){
		dim1=a;
		dim2=b;
	}
	public double area(){
		System.out.println("Area of tri");
		return dim1*dim2/2;
	}
}
class InterfaceAreas{
	public static void main(String[] args) {
		Rectangle r=new Rectangle(9,5);
		Triangle t=new Triangle(10,8);
		Figure fr;
		fr=r;
		System.out.println("Area="+fr.area());
		fr=t;
		System.out.println("Area="+fr.area());
		
	}
}
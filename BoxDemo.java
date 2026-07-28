import java.util.*;

class Box{
	private double width,height,depth;
	void setBox(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter height,width and depth");
		height=sc.nextDouble();
		width=sc.nextDouble();
		depth=sc.nextDouble();
	}
	void getBox(){
		System.out.println("height="+height+"\nwidth="+width+"\ndepth="+depth);
	}
	double volume(){
		return width*height*depth;
	}
}
class BoxDemo{
	public static void main(String[] args) {
		Box mybox=new Box();
		mybox.setBox();
		mybox.getBox();
		double vol=mybox.volume();
		System.out.println("Volume is "+vol);
	}
}
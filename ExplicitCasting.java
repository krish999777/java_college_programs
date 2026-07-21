import java.util.Scanner;
class ExplicitCasting{
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter number of males and females");
			int m=sc.nextInt(),f=sc.nextInt();
			float ratio=(float)m/f;
			System.out.println("Ratio="+ratio);
		}	
}
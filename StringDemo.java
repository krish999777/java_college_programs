import java.util.*;

class StringDemo{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id name and semister of student");
		int id=sc.nextInt();
		String name=sc.next();
		int sem=sc.nextInt();
		System.out.println("id="+id+"\nname="+name+"\nsem="+sem);
	}
}
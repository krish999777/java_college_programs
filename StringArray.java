import java.util.Scanner;
class StringArray{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of students");
		int n=sc.nextInt();
		String s[]=new String[n];
		for(int i=0;i<n;i++){
			System.out.println("Enter name of student "+(i+1));
			s[i]=sc.next();
		}
		for(int i=0;i<n;i++){
			System.out.println(s[i]);
		}
	}
}
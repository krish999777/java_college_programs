import java.util.Scanner;
class StringSort{
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
		for(int i=0;i<n;i++){
			for(int j=0;j<n-j-1;j++){
				if(s[j].compareTo(s[j+1])>0){
					String temp=s[j];
					s[j]=s[j+1];
					s[j+1]=temp;
				}
			}
		}
		for(int i=0;i<n;i++){
			System.out.println(s[i]);
		}
	}
}
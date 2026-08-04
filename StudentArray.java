import java.util.*;

class Student{
	private int rollNo;
	private String name;
	private int m[];
	Student(){}
	Student(int n){
		m=new int[n];
	}
	void setStudent(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter roll no,name");
		rollNo=sc.nextInt();
		name=sc.next();
		for(int i=0;i<m.length;i++){
			System.out.println("Enter marks of subject "+(i+1));
			m[i]=sc.nextInt();
		}
	}
	void getStudent(){
		System.out.println("Roll No="+rollNo+"\nname="+name);
		for(int i=0;i<m.length;i++){
			System.out.println("Subject "+(i+1)+" marks:"+m[i]);
		}
	}
	int getTotal(){
		int sum=0;
		for(int i=0;i<m.length;i++){
			sum+=m[i];
		}
		return sum;
	}
	float getAvg(){
		return getTotal()/m.length;
	}
	float getPercent(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total marks of all subjects");
		int total=sc.nextInt();
		return (getTotal()/(float)total)*100;
	}
}
class StudentArray{
	public static void main(String[] args) {
		System.out.println("Enter number of Students");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Student s[]=new Student[n];
		for(int i=0;i<n;i++){
			s[i]=new Student();
			s[i].setStudent();
		}
		for(int i=0;i<n;i++){
			s[i].getStudent();
			int total=s[i].getTotal();
			float avg=s[i].getAvg();
			float percent=s[i].getPercent();
			System.out.println("Total="+total+"\nAverage="+avg+"\nPercent="+percent);
		}
		
	}
}
import java.util.*;
class Student{
	int id,semister;
	String discipline;
	int m1,m2,m3;
	void setStudent(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id,semister, discipline and marks of 3 subjects");
		id=sc.nextInt();
		semister=sc.nextInt();
		discipline=sc.next();
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();
	}
	void getStudent(){
		System.out.println("Id="+id);
		System.out.println("Semister="+semister);
		System.out.println("Discipline="+discipline);
		System.out.println("m1="+m1);
		System.out.println("m2="+m2);
		System.out.println("m3="+m3);
	}
}
interface Sports{
	int getSPoints();
}
class Result extends Student implements Sports{
	int total;
	public int getSPoints(){
		Scanner sc=new Scanner(System.in);
		System.out.println("At what level did you participate in sports N for national S for state D for district and 0 for anything else");
		char sportChoice=sc.next().charAt(0);
		if(sportChoice=='N'||sportChoice=='n')
			return 25;
		else if(sportChoice=='S'||sportChoice=='s')
			return 15;
		else if(sportChoice=='D'||sportChoice=='d')
			return 10;
		else
			return 0;
	}
	int calTotal(){return m1+m2+m3+getSPoints();}
}

class ResultMain{
	public static void main(String args[]){
		Result r=new Result();
		r.setStudent();
		r.getStudent();
		System.out.println("Total="+r.calTotal());
	}
}
import java.util.*;

class Employee{
	private int id;
	private String name;
	private int bsal;
	void setEmployee(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id,name and bsal");
		id=sc.nextInt();
		name=sc.next();
		bsal=sc.nextInt();
	}
	void getEmployee(){
		System.out.println("id="+id+"\nname="+name+"\nbsal="+bsal);
	}
	float gSal(){
		float da=bsal*0.75f;
		float hra=bsal*0.45f;
		float ta=bsal*0.15f;
		return bsal+da+hra+ta;
	}
}
class EmployeeDemo{
	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setEmployee();
		emp.getEmployee();
		float gsal=emp.gSal();
		System.out.println("gsal is "+gsal);
	}
}
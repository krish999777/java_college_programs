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
class EmployeeArray{
	public static void main(String[] args) {
		System.out.println("Enter number of employees");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Employee emp[]=new Employee[n];
		for(int i=0;i<n;i++){
			emp[i]=new Employee();
			emp[i].setEmployee();
		}
		float max=0f;
		float min=-1f;
		float sum=0f;
		for(int i=0;i<n;i++){
			emp[i].getEmployee();
			float gsal=emp[i].gSal();
			System.out.println("gsal is "+gsal);
			if(gsal>max){
				max=gsal;
			}
			if(min==-1||gsal<min){
				min=gsal;
			}
			sum+=gsal;
		}
		System.out.println("Min="+min+" max="+max+" average="+(sum/n)+" sum="+sum);
		
	}
}
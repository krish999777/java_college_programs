import java.util.Scanner;
class InvalidMarksException extends Exception{
	private int marks;
	InvalidMarksException(int m){
		marks=m;
	}
	public String toString(){
		return "Invalid Marks ->"+marks+" should be between 0 to 100";
	}
}
class MarksExceptionTest{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int flag=1;
		while(flag==1){
			System.out.println("Enter student id,name,marks");
			int id=sc.nextInt();
			String name=sc.next();
			int marks=sc.nextInt();
			try{
				if(marks>100||marks<0){
					throw new InvalidMarksException(marks);
				}
				System.out.println("Id="+id);
				System.out.println("Name="+name);
				System.out.println("Marks="+marks);
				flag=0;
			}catch(InvalidMarksException e){
				System.out.println(e);
			}
		}


		
	}
}
import java.util.Scanner;

class Email{
	public static void main(String[] args) {
		String email;
		Scanner sc=new Scanner(System.in);
		email=sc.next();
		int dotIndex=email.indexOf('.');
		int atIndex=email.indexOf('@');
		if(dotIndex==-1||atIndex==-1){
			System.out.println("Invalid email");
		}else{
			System.out.println("Valid");
		}
	}	
}
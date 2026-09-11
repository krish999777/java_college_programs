class Exc1{
	public static void main(String[] args) {
		try{
			int d=0;
			int a=42/d;
		}catch(ArithmeticException e){
			System.out.println("Denominator cannot be zero");
			System.out.println(e);
		}
		System.out.println("End of program");
	}
}
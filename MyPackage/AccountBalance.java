package MyPackage;
class Balance{
	String name;
	double bal;
	Balance(String n,double b){
		name=n;
		bal=b;
	}
	void show(){
		if(bal<0)
			System.out.print("-->");
		System.out.println(name+":$"+bal);
	}
}
class AccountBalance{
	public static void main(String[] args) {
		Balance current[]=new Balance[2];
		current[0]=new Balance("Krish",125);
		current[1]=new Balance("Kavya",-120);
		for(int i=0;i<current.length;i++){
			current[i].show();
		}
	}
}
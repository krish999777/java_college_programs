class A{
	int i,j;
	A(int i,int j){
		this.i=i;
		this.j=j;
	}
	void show(){
		System.out.println("i and j are "+i+" "+j);
	}
}
class B extends A{
	int k;
	B(int i,int j,int k){
		super(i,j);
		this.k=k;
	}
	void show(){
		System.out.println("k="+k);
	}
}
class Override{
	public static void main(String args[]){
		B ob=new B(1,2,3);
		ob.show();//This line calls show in B
	}
}
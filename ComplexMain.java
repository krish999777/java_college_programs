class Complex{
	int real,img;
	Complex(){}
	Complex(int real,int img){
		this.real=real;
		this.img=img;
	}
	void getComplex(){
		System.out.println(img+"i+"+real);
	}
	Complex addComplex(Complex c){
		Complex temp=new Complex();
		temp.real=real+c.real;
		temp.img=img+c.img;
		return temp;
	}
}
class ComplexMain{
	public static void main(String[] args) {
		Complex c1=new Complex(1,2);
		Complex c2=new Complex(3,4);
		c1.getComplex();
		c2.getComplex();
		Complex c3=c1.addComplex(c2);
		c3.getComplex();
	}
}
class Gsal{
	public static void main(String[] args) {
		int code=102;
		int bsal=10000;
		double da,ta,hra,gsal;
		da=0.78*bsal;
		ta=0.09*bsal;
		hra=0.42*bsal;
		gsal=bsal+hra+ta+da;
		System.out.println("ta="+ta);
		System.out.println("da="+da);
		System.out.println("hra="+hra);
		System.out.println("Gsal="+gsal);
	}
}
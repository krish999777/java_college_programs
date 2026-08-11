class StringMethods{
	public static void main(String[] args) {
		String s1="Hello",s2="Krish";
		System.out.println("s1="+s1+" s2="+s2);
		System.out.println("s1.length()="+s1.length());
		System.out.println("s1.concat(s2)="+s1.concat(s2));
		System.out.println("s1.charAt(0)="+s1.charAt(0)); 
		System.out.println("s1.indexOf('e')="+s1.indexOf('e')); 
		char ch[]=s1.toCharArray();
		System.out.println("String to char array printed");
		for(int i=0;i<ch.length;i++){
			System.out.println(ch[i]);
		}
		String s3="hello";
		System.out.println("s3="+s3);
		System.out.println("s1.equals(s3)="+s1.equals(s3));
		System.out.println("s1.equalsIgnoreCase(s3)="+s1.equalsIgnoreCase(s3));
		System.out.println("s1.compareTo(s3)="+s1.compareTo(s3));
		System.out.println("s1.compareToIgnoreCase(s3)="+s1.compareToIgnoreCase(s3));
	}
}
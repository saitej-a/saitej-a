
public class class16 {
	public static void main(String[] args){
		//printf
		int i=12000;
		String s="bro";
		boolean b= true;
		double f=3.14;
		System.out.printf("int i=%d", i);
		
		System.out.printf("\nstr=%s", s);
		System.out.printf("\nb=%b", b);
		System.out.printf("\nf=%f", f);
		System.out.printf("int i=%d", i);
		
		//width
		System.out.printf("str=%10s", s);
		System.out.printf("str=%-10s", s);
		//precision
		System.out.printf("f=%.5f", f);
		
		//comma
		System.out.printf("int=%,d", i);
	}

}

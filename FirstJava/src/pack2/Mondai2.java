package pack2;

public class Mondai2 {
	public static void main(String[] args) {
		int hensu1=200000;
		int hensu2=0;
		
		int a=hensu1+hensu2;
		int b=hensu1-hensu2;
		long c=(long)hensu1*hensu2;
		try {
			int d=hensu1/hensu2;
			System.out.println(d);
		}catch(ArithmeticException ari) {
			System.out.println("error");
		}
		int e=hensu1%hensu2;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(e);
	}
}

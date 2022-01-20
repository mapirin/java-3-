package pack4;

public class ForFor {
	public static void main(String[] args) {
		String s="Cow";
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<10;i++) {
			sb.append(s);
			System.out.println(sb.toString());
		}
		System.out.println(sb.toString());
		
		for(int i=0;i<9;i++) {
			s=s+"Cow";
		}
		System.out.println(s);
	}
}

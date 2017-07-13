package summer;

public class Copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="HelloWorld!";
		char ch[]=new char[str.length()];
		for (int i = 0; i < ch.length; i++) {
			ch[i]=str.charAt(i);
		}
		
		String a=String.copyValueOf(ch);
		String b=String.copyValueOf(ch, 0, 5);
		
		System.out.println(a);
		System.out.println(b);
	}

}

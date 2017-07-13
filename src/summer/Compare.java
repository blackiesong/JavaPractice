package summer;



public class Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new string 新生成一个对象的地址不尽相同
		String s1=new String("this is a string");
		String s2=new String("this is a string");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
	}

}

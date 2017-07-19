package summer;

public class StrTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("abc");
		String s2=new String("xyz");
		//s1=s2;
		//没有改变内存地址
		show(s1, s2);
		System.out.println(s1+"-------"+s2);
	}
	static void show(String s1,String s2){
		s1=s2;
//		s2=s1;
	}
}

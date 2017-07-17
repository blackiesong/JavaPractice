package summer;

public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		alg s1=new alg();
		ladd ad=s1;
		lsub sub=s1;
		lmul mul=s1;
		lumul umul=s1;
		System.out.println("调用对象的方法：");
		System.out.println("+:"+s1.add(9, 3));
		System.out.println("-:"+s1.sub(9, 3));
		System.out.println("x:"+s1.mul(9, 3));
		System.out.println("/:"+s1.umul(9, 3));
		
		System.out.println("调用接口引用的方法：");
		System.out.println("+:"+ad.add(9, 3));
		System.out.println("-:"+sub.sub(9, 3));
		System.out.println("x:"+mul.mul(9, 3));
		System.out.println("/:"+umul.umul(9, 3));
	}

}

interface ladd{
	int add(int a,int b);
}
interface lsub{
	int sub(int a,int b);
}
interface lmul{
	int mul(int a,int b);
}
interface lumul{
	int umul(int a,int b);
}

class alg implements ladd,lmul,lsub,lumul{
	
	@Override
	public int umul(int a,int b) {
		// TODO Auto-generated method stub
		return a/b;
	}

	@Override
	public int sub(int a,int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public int mul(int a,int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public int add(int a,int b) {
		// TODO Auto-generated method stub
		return a+b;
	}
}
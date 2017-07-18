package summer;


public abstract class Local {
	public abstract void A_local();
	public abstract void B_local();
	public abstract void C_local();
	public static void main(String[] args) {
		OuterClass_1 s=new OuterClass_1();
		s.result().A_local();
		s.result().B_local();
		s.result().C_local();
	}
}
class OuterClass_1{
	private String str="现在访问的是外部类";
	private void p_showMess(){
		System.out.println("现在访问的是外部类的私有非静态变量--p-shouMess（）");
	}
	 public void showMess(){
		 System.out.println("现在访问的是外部类的非静态方法——showMess（）");
	 }
	 public Local result(){
		 final String inner="局部内部类是在方法中创建的类";
		 class InnerClass extends Local{
			 public void A_local(){
				 showMess();
			 }
			 public void B_local(){
				 p_showMess();
			 }
			 public void C_local(){
				 System.out.println("显示局部内部类的成员常量inner：\""+inner+"\"");
				 System.out.println("调用外部类的成员常量：\""+str+"\"");
			 }
		 }
		 return new InnerClass();
	 }
}


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
	private String str="���ڷ��ʵ����ⲿ��";
	private void p_showMess(){
		System.out.println("���ڷ��ʵ����ⲿ���˽�зǾ�̬����--p-shouMess����");
	}
	 public void showMess(){
		 System.out.println("���ڷ��ʵ����ⲿ��ķǾ�̬��������showMess����");
	 }
	 public Local result(){
		 final String inner="�ֲ��ڲ������ڷ����д�������";
		 class InnerClass extends Local{
			 public void A_local(){
				 showMess();
			 }
			 public void B_local(){
				 p_showMess();
			 }
			 public void C_local(){
				 System.out.println("��ʾ�ֲ��ڲ���ĳ�Ա����inner��\""+inner+"\"");
				 System.out.println("�����ⲿ��ĳ�Ա������\""+str+"\"");
			 }
		 }
		 return new InnerClass();
	 }
}


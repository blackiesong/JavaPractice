package summer;



public class Minicar extends car{

	public static void main(String[] args) {
		Minicar c1=new Minicar();
		System.out.println("��������ɫ��"+c1.color);
		c1.color="blue";
		System.out.println("�ӳ�����ɫ��"+c1.color);
	}
	

}

class car{
	String color="red";
	public void setColor(String c) {
		this.color=c;
		
	}
}
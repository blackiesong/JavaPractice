package summer;
public class Example {
	public static void main(String[] args) {
		PowerOfFive five = new PowerOfFive();
		MultOfFive fiOb = new MultOfFive();
		Number ob;
		System.out.println("��5��n�η��Ľ�����£�");
		for (int i = 1; i <= 6; i++) {			// �ֱ����5��1-4�η�
			ob = five;
			System.out.println("The five power of " + i + " is "
					+ ob.getNextVal());
		}
		System.out.println("\n��5��n�ı������£�");
		for (int i = 1; i <= 5; i++) {			// �ֱ����5��1-5������ֵ
			fiOb.val = i;
			System.out.println("The five Mult of " + i + " is "
					+ fiOb.getNextVal());
		}
	}
}
interface Number {
	int getNextVal(); 					// ��ȡ��һ������ֵ
	void setInitVal(); 					// ��ʼ������start��val
	void setMult(int x); 					// ����ĳ�����ֵ������val���¸�ֵ��
}
class PowerOfFive implements Number {		// ��5��n�η�
	int start;							// �������������
	int val;							// ���
	PowerOfFive() {
		start = 1;
		val = 1;
	}
	// ʵ�ֽӿ��ж�������з���
	public int getNextVal() {
		val *= 5;
		return val;
	}
	public void setInitVal() {
		start = 1;
		val = 1;
	}
	public void setMult(int n) {
		start = n;
		val = n;
	}
}
class MultOfFive implements Number {	// ��5��n����ֵ
	int start;
	int val;
	MultOfFive() {
		start = 1;
		val = 1;
	}
	//ʵ�ֽӿ��ж�������з���
	public int getNextVal() {
		setMult(val);				// ����setMult��������������������
		val *= 5;
		return val;
	}
	public void setInitVal() {
		start = 1;
		val = 1;
	}
	public void setMult(int n) {
		start = n;
		val = n;
	}
}

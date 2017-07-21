package summer;
public class Example {
	public static void main(String[] args) {
		PowerOfFive five = new PowerOfFive();
		MultOfFive fiOb = new MultOfFive();
		Number ob;
		System.out.println("求5的n次方的结果如下：");
		for (int i = 1; i <= 6; i++) {			// 分别求出5的1-4次方
			ob = five;
			System.out.println("The five power of " + i + " is "
					+ ob.getNextVal());
		}
		System.out.println("\n求5的n的倍数如下：");
		for (int i = 1; i <= 5; i++) {			// 分别求出5的1-5倍数的值
			fiOb.val = i;
			System.out.println("The five Mult of " + i + " is "
					+ fiOb.getNextVal());
		}
	}
}
interface Number {
	int getNextVal(); 					// 获取下一个返回值
	void setInitVal(); 					// 初始化变量start、val
	void setMult(int x); 					// 设置某点的数值，即给val重新赋值。
}
class PowerOfFive implements Number {		// 求5的n次方
	int start;							// 进行运算的数字
	int val;							// 结果
	PowerOfFive() {
		start = 1;
		val = 1;
	}
	// 实现接口中定义的所有方法
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
class MultOfFive implements Number {	// 求5的n倍的值
	int start;
	int val;
	MultOfFive() {
		start = 1;
		val = 1;
	}
	//实现接口中定义的所有方法
	public int getNextVal() {
		setMult(val);				// 调用setMult方法，重新设置运算数
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

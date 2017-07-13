package summer;

public class BreakTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			if (i==5) {
				break;
			}
			System.out.println("当前执行的i="+i);	
		}
		System.out.println("循环执行完毕");
	}

}

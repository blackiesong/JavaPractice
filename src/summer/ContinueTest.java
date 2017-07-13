package summer;

public class ContinueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			if (i==5) {
				continue;
			}
			System.out.println("当前执行的i="+i);
		}
		System.out.println("循环执行完毕");
	}

}

package summer;

public class MaoPaoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intarray={1,2,33,5,34,67,213,8};
		System.out.println("排序前的数组");
		for (int a : intarray) {
			System.out.println(a+"");
		}
		int temp;
		System.out.println();
		for (int i = 0; i < intarray.length; i++) {
			//数值较小的元素往上冒泡
			for (int j = i; j < intarray.length; j++) {
				if (intarray[j]<intarray[i]) {
					temp=intarray[i];
					intarray[i]=intarray[j];
					intarray[j]=temp;
				}
			}
		}
		System.out.println("排序后的数组");
		for (int b : intarray) {
			System.out.println(b+"");
		}
	}
}

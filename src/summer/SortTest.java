package summer;

public class SortTest {

	public static void main(String[] args) {
		int[] intarray={1,23,45,66,2,332,8,5};
		int keyvalue;
		int index;
		int temp;
		System.out.println("����ǰ������Ԫ��");
		for(int a:intarray){
			System.out.println(a+"");
		}
		System.out.println();
		for (int i = 0; i < intarray.length; i++) {
			index=i;
			keyvalue=intarray[i];
			//�ҵ���i��ʼ����Ԫ�ص���Сֵλ����j
			for (int j = i; j < intarray.length; j++) {
				if (intarray[j]<keyvalue) {
					index=j;
					keyvalue=intarray[j];
				}
			}
			//����i��jλ�õĻ�����temp���м����
			temp=intarray[i];
			intarray[i]=intarray[index];
			intarray[index]=temp;
		}
		System.out.println("����������");
		for (int b : intarray) {
			System.out.println(b+"");
		}
	}

}

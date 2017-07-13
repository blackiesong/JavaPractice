package summer;

import java.util.Arrays;
import java.util.Random;

public class ThreefourTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Random rd = new Random();
		int intarray[]=new int[20];
		for (i=0;i<intarray.length;i++) {
			intarray[i]=rd.nextInt(20);
		}
		Arrays.sort(intarray);
		for (int a : intarray) {
			System.out.print(a+" ");
		}
	}

}

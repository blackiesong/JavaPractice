package summer;

import java.io.IOException;

public class Xitifivethree {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			int row=11;
		if (row>=1) {
			for (int i = 1; i <= row; i++) {
				for (int j = 1; j <= row-i; j++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= 2*i-1; j++) {
					System.out.print("#");
				}
				System.out.println();
			}
			for (int i = 1; i <=row; i++) {
				for (int j = 1; j <=i; j++) {
					System.out.print(" ");
				}
				for (int j = 1; j <=2*(row-i)-1; j++) {
					System.out.print("#");
				}
				System.out.println();
			}
		}
	}
}

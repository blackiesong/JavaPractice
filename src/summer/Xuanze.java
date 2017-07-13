package summer;

import java.io.IOException;

public class Xuanze {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		char i;
		do {
			System.out.println("1：数学");
			System.out.println("2：语文");
			System.out.println("3：英语");
			System.out.println("4：化学");
			System.out.println("5：物理");
			 i=(char)System.in.read();
			switch (i) {
			case '1':
			System.out.println("您选择的课程是数学");
				break;
			case '2':
			System.out.println("您选择的课程是语文");
				break;
			case '3':
			System.out.println("您选择的课程是英语");
				break;
			case '4':
			System.out.println("您选择的课程是化学");
				break;
			case '5':
			System.out.println("您选择的课程是物理");
				break;
			}
			
		} while ((i<'1')||(i>'5'));
	}

}

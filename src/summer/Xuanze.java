package summer;

import java.io.IOException;

public class Xuanze {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		char i;
		do {
			System.out.println("1����ѧ");
			System.out.println("2������");
			System.out.println("3��Ӣ��");
			System.out.println("4����ѧ");
			System.out.println("5������");
			 i=(char)System.in.read();
			switch (i) {
			case '1':
			System.out.println("��ѡ��Ŀγ�����ѧ");
				break;
			case '2':
			System.out.println("��ѡ��Ŀγ�������");
				break;
			case '3':
			System.out.println("��ѡ��Ŀγ���Ӣ��");
				break;
			case '4':
			System.out.println("��ѡ��Ŀγ��ǻ�ѧ");
				break;
			case '5':
			System.out.println("��ѡ��Ŀγ�������");
				break;
			}
			
		} while ((i<'1')||(i>'5'));
	}

}

package summer;

import java.util.Scanner;

public class Colorprinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner reader=new Scanner(System.in);
		System.out.println("«Î ‰»Î¥Ú”°ƒ⁄»›");
		String s=reader.next();
		boolean iscolor=reader.nextBoolean();
		printhead ph;
		if (iscolor) {
			ph=new colorprint();
			ph.strike(s);
		}else {
			ph=new printhead();
			ph.strike(s);
		}
	}
	static class printhead{
		public void strike(String s){
			System.out.println("striking words");
			System.out.println(s);
		}
	}
	static class colorprint extends printhead{
		public void strike(String s){
			System.out.println("striking color words");
			System.out.println(s);
		}
	}

}

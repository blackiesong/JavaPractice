package file;

import java.io.File;

public class TestFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f1=new File("f:/dota");
		System.out.println("f1�ľ���·��"+f1.getAbsolutePath());
		File f2=new File("dota.exe");
		System.out.println("f2�ľ���·��"+f2.getAbsolutePath());
		File f3=new File(f1, "dota.exe");
		System.out.println("f3�ľ���·��"+f3.getAbsolutePath());
	}

}

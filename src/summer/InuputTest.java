package summer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InuputTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.in.read()一次只读入一个字节数据，而我们通常要取得一个字符串或一组数字
		  //System.in.read()返回一个整数
		  //必须初始化
		  int read1 = 0;
		//char read='0';
		System.out.println("输入数据：");
		try {
			read1=System.in.read();
			//read=(char)System.in.read();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("输入数据为"+read1);
		
		  System.out.println("输入");
		  Scanner scan = new Scanner(System.in);
		  String read2 = scan.nextLine();
		  System.out.println("输入数据："+read2); 
		  /*在新增一个Scanner对象时需要一个System.in对象，因为实际上还是System.in在取得用户输入。
		   * Scanner的next()方法用以取得用户输入的字符串；nextInt()将取得的输入字符串转换为整数类型；
		   * 同样，nextFloat()转换成浮点型；nextBoolean()转换成布尔型。*/
		  
		  
		//Scanner取得的输入以space, tab, enter 键为结束符，
		  //要想取得包含space在内的输入，可以用java.io.BufferedReader类来实现
		  //使用BufferedReader的readLine( )方法
		  //必须要处理java.io.IOException异常
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in ));
		  //java.io.InputStreamReader继承了Reader类
		  String read = null;
		  System.out.println("输入数据：");
		  try {
		   read = br.readLine();
		  } catch (IOException e) {
		   e.printStackTrace();
		  }
		  System.out.println("输入数据："+read); 

	}

}

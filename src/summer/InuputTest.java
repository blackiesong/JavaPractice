package summer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InuputTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.in.read()һ��ֻ����һ���ֽ����ݣ�������ͨ��Ҫȡ��һ���ַ�����һ������
		  //System.in.read()����һ������
		  //�����ʼ��
		  int read1 = 0;
		//char read='0';
		System.out.println("�������ݣ�");
		try {
			read1=System.in.read();
			//read=(char)System.in.read();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("��������Ϊ"+read1);
		
		  System.out.println("����");
		  Scanner scan = new Scanner(System.in);
		  String read2 = scan.nextLine();
		  System.out.println("�������ݣ�"+read2); 
		  /*������һ��Scanner����ʱ��Ҫһ��System.in������Ϊʵ���ϻ���System.in��ȡ���û����롣
		   * Scanner��next()��������ȡ���û�������ַ�����nextInt()��ȡ�õ������ַ���ת��Ϊ�������ͣ�
		   * ͬ����nextFloat()ת���ɸ����ͣ�nextBoolean()ת���ɲ����͡�*/
		  
		  
		//Scannerȡ�õ�������space, tab, enter ��Ϊ��������
		  //Ҫ��ȡ�ð���space���ڵ����룬������java.io.BufferedReader����ʵ��
		  //ʹ��BufferedReader��readLine( )����
		  //����Ҫ����java.io.IOException�쳣
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in ));
		  //java.io.InputStreamReader�̳���Reader��
		  String read = null;
		  System.out.println("�������ݣ�");
		  try {
		   read = br.readLine();
		  } catch (IOException e) {
		   e.printStackTrace();
		  }
		  System.out.println("�������ݣ�"+read); 

	}

}

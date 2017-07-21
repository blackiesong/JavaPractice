package file;

import java.io.File;
import java.util.Date;
  
public class TestFile1 {
  
    public static void main(String[] args) {
  
        File f = new File("f:/dota/dota.txt");
        System.out.println("当前文件是：" +f);
        //文件是否存在
        System.out.println("判断是否存在："+f.exists());
         
        //是否是文件夹
        System.out.println("判断是否是文件夹："+f.isDirectory());
          
        //是否是文件（非文件夹）
        System.out.println("判断是否是文件："+f.isFile());
          
        //文件长度
        System.out.println("获取文件的长度："+f.length());
          
        //文件最后修改时间
        long time = f.lastModified();
        Date d = new Date(time);
        System.out.println("获取文件的最后修改时间："+d);
        //设置文件修改时间为1970.1.1 08:00:00
        f.setLastModified(0);
          d=new Date(f.lastModified());
          System.out.println("修改后 获取文件的最后修改时间："+d);
        //文件重命名
        File f2 =new File("f:/dota/dota1.txt");
        f.renameTo(f2);
        System.out.println("把dota.txt改名成了dota1.txt");
         
        System.out.println("注意： 需要在D:\\LOLFolder确实存在一个LOL.exe,\r\n才可以看到对应的文件长度、修改时间等信息");
    }
}
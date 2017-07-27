package iocopyfile;

import java.io.*;

/**
 * Created by sifu on 2017/3/22.
 */
//使用字符流拷贝文件（纯文本文件）
public class IoCharCopyDemo {
    public static void main(String[] args)throws Exception{
        //1.创建源和目标文件
        File srcFile = new File("D:\\123.txt");
        File destFile = new File("D:\\123_copy.txt");
        //2.创建输入输出流对象
        Reader in = new FileReader(srcFile);
        Writer out =new FileWriter(destFile);
        //3.io操作
        char[] data = new char[1024];
        int len = -1;
        while((len = in.read(data)) != -1){
            out.write(data,0,len);
        }
        //4.关闭源
        in.close();
        out.close();
    }
}

package buffer;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Created by sifu on 2017/3/23.
 */
//字节缓冲流
public class BufferedStreamDemo {
    public static void main(String[] args)throws Exception{
        //字节缓冲输出流
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\123.txt",true));
        bos.write("hello world".getBytes());
        bos.close();
        //字符缓冲输入流
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\123.txt"));
        byte[] buffer = new byte[1024];
        int len = -1;
        while((len = bis.read(buffer)) != -1){
            System.out.println(new String(buffer,0,len));
        }
    }
}

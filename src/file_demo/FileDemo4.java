package file_demo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * Created by sifu on 2017/3/21.
 */
//Output演示
public class FileDemo4 {
    public static void main(String[] args)throws Exception{
        //1.创建源
        File src = new File("D:\\456.txt");
        //2.创建流对象
        OutputStream outputStream = new FileOutputStream(src,true);
        //3.io的具体操作
        /*
            void write(byte[] b)
            将 b.length 个字节从指定 byte 数组写入此文件输出流中。
            void write(byte[] b, int off, int len)
            将指定 byte 数组中从偏移量 off 开始的 len 个字节写入此文件输出流。
            void write(int b)
            将指定字节写入此文件输出流。

         */
        outputStream.write("asdghgk".getBytes(),2,"asdghgk".length()-2);
        //4.关闭资源
        outputStream.close();
    }
}

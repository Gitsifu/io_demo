package file_demo;

import java.io.*;

/**
 * Created by sifu on 2017/3/21.
 */
//文件的拷贝操作
public class IoCopyDemo {
    public static void main(String[] args)throws Exception{
        //1.创建源
        File src = new File("D:\\123.txt");
        File copySrc = new File("D:\\123_copy.txt");
        //2.创建流对象
        InputStream inputStream = new FileInputStream(src);
        OutputStream outputStream = new FileOutputStream(copySrc);
        //3.io具体操作
        byte[] data = new byte[10];
        int len = -1;//表示已经读取了多少个字节数，如果是-1表明文件已经读取到最后
        while ((len = inputStream.read(data)) != -1){
            //打印读取的数据
            System.out.println(new String(data,0,len));
            //写入读取的数据
            outputStream.write(data,0,len);
        }
        //4.关闭资源
        inputStream.close();
        outputStream.close();
    }
}

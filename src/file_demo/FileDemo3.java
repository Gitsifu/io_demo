package file_demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Created by sifu on 2017/3/21.
 */
//Input演示
public class FileDemo3 {
    public static void main(String[] args)throws Exception{
        //1.创建源
        File src = new File("D:\\123.txt");
        //2.创建流对象
        InputStream stream = new FileInputStream(src);
        //3.io的具体操作
        byte[] data = new byte[10];//创建容器问10的缓冲区，存储已经读取的字节数据
        int len = -1;//表示已经读取了多少个字节数，如果是-1表明文件已经读取到最后
        while((len = stream.read(data)) != -1){
            //打印读取的数据
            System.out.println(new String(data,0,len));
        }
        //4.关闭资源
        stream.close();
    }
}

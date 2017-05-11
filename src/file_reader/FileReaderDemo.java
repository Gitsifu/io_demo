package file_reader;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;

/**
 * Created by sifu on 2017/3/22.
 */
public class FileReaderDemo {
    public static void main(String[] args) throws Exception {
        //1.创建源
        File f = new File("D:\\123.txt");//此文件必须要是UTF-8编码格式
        //2.创建io流对象
        Reader fr = new FileReader(f);
        //3.具体的io操作
        char[] data = new char[5];
        int len = -1;
        while ((len = fr.read(data)) != -1) {
            System.out.println(new String(data,0,len));
        }
        //4.关闭流
        fr.close();
    }
}

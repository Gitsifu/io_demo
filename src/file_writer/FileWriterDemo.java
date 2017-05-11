package file_writer;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

/**
 * Created by sifu on 2017/3/22.
 */
public class FileWriterDemo {
    public static void main(String[] args)throws Exception{
        //1.创建源
        File src = new File("D:\\123.txt");
        //2.创建io流对象
        Writer fw = new FileWriter(src);//追加数据
        //3.io操作
        String str = "我是天边最美的彩霞";
        fw.write('A');
        fw.flush();
        //4.关闭资源
        //fw.close();
    }
}

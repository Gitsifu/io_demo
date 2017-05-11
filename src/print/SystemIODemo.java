package print;

import java.io.FileInputStream;
import java.io.PrintStream;

/**
 * Created by sifu on 2017/3/25.
 */
public class SystemIODemo {
    public static void main(String[] args)throws Exception{
        //重定向标准输入流
        System.setIn(new FileInputStream("D:\\123.txt"));
        //重定向标准输入流
        System.setOut(new PrintStream("D:\\123_copy.txt"));
        System.out.println("....begin.......");
        int data = System.in.read();//从标准输入流中读取一个字节
        System.out.println(data);
        System.out.println("...end.......");
    }
}

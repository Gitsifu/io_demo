package scanner_demo;

import java.io.File;
import java.util.Scanner;

/**
 * Created by sifu on 2017/3/25.
 */
public class ScannerDemo {
    public static void main(String[] args) throws Exception {
        //从键盘上扫描
        //Scanner in = new Scanner(System.in);
        //从指定字符串中扫描
        //Scanner in = new Scanner("你真的好帅啊！！！");
        //从指定的文件中扫描
        Scanner in = new Scanner(new File("D:\\123.txt"));
        while (in.hasNext()) {
            String data = in.nextLine();
            System.out.println("ECHO:" + data);
        }
    }
}

package buffer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * Created by sifu on 2017/3/23.
 */
//字符缓冲流
public class BufferedWriterReaderDemo {
    public static void main(String[] args) throws Exception {
        //字符缓冲输出流
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\123.txt", true));
        bw.write("君不见黄河之水天上流");
        bw.newLine();//等同于输入'\n'
        bw.write("奔流到还不复还");
        bw.close();
        //字符缓冲输入流
        BufferedReader br = new BufferedReader(new FileReader("D:\\123.txt"));
        /*int len = -1;
        while ((len = br.read(ch)) != -1) {
            System.out.println(new String(ch, 0, len));
        }
        char[] ch = new char[1024];
        */
        String line = null;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }
}

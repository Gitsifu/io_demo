package print;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/**
 * Created by sifu on 2017/3/25.
 */
public class PrintWriterDemo {
    public static void main(String[] args)throws Exception {
        PrintWriter pw = new PrintWriter(new FileOutputStream(new File("D:\\123.txt")), true);
        pw.print("ABC");
        pw.print("19");
        pw.print("四福");
        pw.close();
    }
}

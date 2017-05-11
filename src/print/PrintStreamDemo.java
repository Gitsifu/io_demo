package print;

import java.io.File;
import java.io.PrintStream;

/**
 * Created by sifu on 2017/3/25.
 */
public class PrintStreamDemo {
    public static void main(String[] args)throws Exception {
        PrintStream ps = new PrintStream(new File("D:\\123.txt"));
        ps.print("ABC");
        ps.print("19");
        ps.print("四福");
        ps.close();
    }
}

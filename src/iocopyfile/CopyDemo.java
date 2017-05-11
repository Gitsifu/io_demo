package iocopyfile;

import java.io.*;

/**
 * Created by sifu on 2017/3/21.
 */
//需求：文件拷贝案例  --  拷贝指定目录的指定类型文件到指定目录
public class CopyDemo {
    public static void main(String[] args) throws Exception {
        File srcDir = new File("C:\\Users\\sifu\\Desktop\\ja");
        File destDir = new File("C:\\Users\\sifu\\Desktop\\text");
        InputStream in = null;
        OutputStream out = null;
        //找出文件中所有java文件
        File[] fs = srcDir.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if (new File(dir, name).isFile() && name.endsWith(".java")) {
                    return true;
                }
                return false;
            }
        });
        for (File srcFile : fs) {
            //创建io流对象
            in = new FileInputStream(srcFile);
            out = new FileOutputStream(new File(destDir, srcFile.getName()));
            //读写操作
            byte[] data = new byte[1024];//一次性可以读取1024个字节（1kb）
            int len = -1;//表示已经读取的字节数，在底层规定是-1读取到末尾
            while ((len = in.read(data)) != -1) {
                out.write(data, 0, len);
            }
        }
        //关闭资源
        in.close();
        out.close();
        //修改拷贝之后的文件的名称
        //为什么只有最后一次迭代才改名成功？  不知道。。。
        File[] copyfs = destDir.listFiles();
        for (File src : copyfs) {
            System.out.println(src.getName());
            String name = src.getName().replaceAll(".java", ".txt");
            System.out.println(name);
            boolean a = src.renameTo(new File(destDir, name));
            System.out.println(a);
        }

    }
}

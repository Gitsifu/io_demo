package buffer;

import java.io.*;


/**
 * Created by sifu on 2017/3/23.
 */
//字节流和缓冲流性能对比
public class NodeStreamVSBufferedStreamDemo {
    public static void main(String[] args) throws Exception{
        File srcFile = new File("D:\\应用安装包\\QQ_8.9.19983.0_setup.exe");//59M的文件
        File destFile = new File("D:\\应用安装包\\javademo\\QQ.exe");
        //text1(srcFile, destFile);//耗时237819毫秒
        //text2(srcFile,destFile);//2359
        //text3(srcFile,destFile);//531
        text4(srcFile,destFile);//141
    }
    //使用字节流，从磁盘文件中一个字节一个字节的读写
    public static void text1(File srcFile, File destFile)throws Exception {
        long begin = System.currentTimeMillis();
        FileInputStream in = new FileInputStream(srcFile);
        FileOutputStream out = new FileOutputStream(destFile);
        int len = -1;
        while ((len = in.read()) != -1) {
            out.write(len);
        }
        in.close();
        out.close();
        System.out.println(System.currentTimeMillis() - begin);
    }
    //使用缓冲流，从内存中一个字节一个字节的读写
    public static void text2(File srcFile, File destFile)throws Exception {
        long begin = System.currentTimeMillis();
        BufferedInputStream in = new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(destFile));
        int len = -1;
        while ((len = in.read()) != -1) {
            out.write(len);
        }
        in.close();
        out.close();
        System.out.println(System.currentTimeMillis() - begin);
    }
    //使用字节流，从磁盘文件中1024个字节的读写
    public static void text3(File srcFile, File destFile)throws Exception {
        long begin = System.currentTimeMillis();
        FileInputStream in = new FileInputStream(srcFile);
        FileOutputStream out = new FileOutputStream(destFile);
        byte[] data =new byte[1024];
        int len = -1;
        while ((len = in.read(data)) != -1) {
            out.write(data,0,len);
        }
        in.close();
        out.close();
        System.out.println(System.currentTimeMillis() - begin);
    }
    //使用缓冲流，从内存中1024个字节的读写
    public static void text4(File srcFile, File destFile)throws Exception {
        long begin = System.currentTimeMillis();
        BufferedInputStream in = new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(destFile));
        byte[] data = new byte[1024];
        int len = -1;
        while ((len = in.read(data)) != -1) {
            out.write(data,0,len);
        }
        in.close();
        out.close();
        System.out.println(System.currentTimeMillis() - begin);
    }
}
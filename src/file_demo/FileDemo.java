package file_demo;

import java.io.File;

/**
 * Created by sifu on 2017/3/20.
 */
//需求：列出指定目录中的所有的文件，包括子文件夹中的所有文件（试用递归算法）
public class FileDemo {
    public static void main(String[] args){
        File file = new File("D:\\应用安装包");
        listAllfiles(file);
    }
    //列出所有的文件
    public static void listAllfiles(File f){
        //第一级子文件
        File[] fs = f.listFiles();
        for(File file : fs){
            //如果目录和文件
            System.out.println(file);
            //如果子文件是目录，则继续递归
            if(file.isDirectory()){
                listAllfiles(file);
            }
        }
    }
}

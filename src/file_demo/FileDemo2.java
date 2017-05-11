package file_demo;

import java.io.File;

/**
 * Created by sifu on 2017/3/20.
 */
public class FileDemo2 {
    public static void main(String[] args) {
        File dir = new File("");
        //获取目录下所有的文件
        File[] fs = dir.listFiles();
        //需要被替换/删除的文字
        String deleteText = "";
        for (File file : fs) {
            //如果此文件名中包含deleteText这个字符串，则将其替换成""
            if (file.getName().contains(deleteText)) {
                String newFileName = file.getName().replace(deleteText, "");
                file.renameTo(new File(dir, newFileName));
            }
        }

    }
}

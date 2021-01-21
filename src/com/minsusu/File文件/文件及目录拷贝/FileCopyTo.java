package com.minsusu.File文件.文件及目录拷贝;


import java.io.*;
import java.util.Scanner;

/**
 * 文件夹及其内容拷贝
 */
public class FileCopyTo {
    public static void main(String[] args) {
        // 用户输出
        Scanner s = new Scanner(System.in);
        System.out.print("请输入源目录：");
        String _srcPath = s.next();
        System.out.println("**************");
        System.out.print("请输入目标目录：");
        String _discPath = s.next();

        // 目标源
        File srcFiles = new File(_srcPath);
        // 文件源
        File discFiles = new File(_discPath);
        // 文件拷贝
        fileCopy(srcFiles, discFiles);

    }

    /**
     * 文件拷贝
     *
     * @param srcFiles  拷贝的源
     * @param discFiles 拷贝的目标
     */
    private static void fileCopy(File srcFiles, File discFiles) {
        // 递归结束的条件，文件对象时一个文件，不是一个目录时候
        if (srcFiles.isFile()) {
            FileInputStream inFiles = null;
            FileOutputStream outFiles = null;
            try {
                inFiles = new FileInputStream(srcFiles);  //新建字节流输入对象
                String path = (discFiles.getAbsolutePath().endsWith("\\") ? discFiles.getAbsolutePath() : discFiles.getAbsolutePath() + "\\") + srcFiles.getAbsolutePath().substring(3);
                System.out.println(path);
                outFiles = new FileOutputStream(path);
                byte[] bytes = new byte[1024 * 1024]; //每次读1M
                int cout = 0;
                while ((cout = inFiles.read(bytes)) != -1) {
                    outFiles.write(bytes, 0, cout);
                }

                outFiles.flush();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (inFiles != null) {
                    try {
                        inFiles.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (outFiles != null) {
                    try {
                        outFiles.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            return;
        }

        //获取所有的目录
        File[] files = srcFiles.listFiles();
        for (File file : files) {
            // 如果file对象是文件夹,需要继续获取路径
            if (file.isDirectory()) {
                // 源文件夹的路径
                String srcPath = file.getAbsolutePath();
                //System.out.println(srcPath);
                // 目标文件夹路径
                String discPath = (discFiles.getAbsolutePath().endsWith("\\") ? discFiles.getAbsolutePath() : discFiles.getAbsolutePath() + "\\") + srcPath.substring(3);
                //System.out.println(discPath);
                File newFile = new File(discPath);
                //新的目录不存在的话，新建目录
                if (!newFile.exists()) {
                    newFile.mkdirs();
                }
            }

            // 不是一个文件夹
            fileCopy(file, discFiles); // 递归
        }

    }
}

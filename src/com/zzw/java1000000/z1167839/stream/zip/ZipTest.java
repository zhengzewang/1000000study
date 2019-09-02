package com.zzw.java1000000.z1167839.stream.zip;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.jar.JarInputStream;
import java.util.jar.JarOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/**
 * @author zhengzewang on 2019/5/26.
 */
public class ZipTest {

    public static void main(String[] args) throws IOException {
        String compressDir = "D:\\test\\compress";
        String decompressDir = "D:\\test\\decompress";
        String zipName = "D:\\test\\test.zip";
        compress(compressDir, zipName); // zip/rar/jar 等均支持
        decompress(decompressDir, zipName);
        //
        JarOutputStream jarOutputStream = null; // TODO
        JarInputStream jarInputStream = null; // TODO
    }

    private static void decompress(String dir, String zipName) throws IOException {
        File file = new File(zipName);
        FileInputStream fileInputStream = new FileInputStream(file);
        ZipInputStream zipInputStream = new ZipInputStream(fileInputStream);
        ZipEntry zipEntry = zipInputStream.getNextEntry();
        while (zipEntry != null) {
            String entryName = zipEntry.getName();
            File temp = new File(dir + File.separator + entryName);
            if (zipEntry.isDirectory() || entryName.endsWith("\\") || entryName.endsWith(File.separator)) {
                if (!temp.exists()) {
                    temp.mkdirs();
                }
            } else {
                if (!temp.exists()) {
                    temp.getParentFile().mkdirs();
                }
                FileOutputStream fileOutputStream = new FileOutputStream(temp);
                int read = zipInputStream.read();
                while (read != -1) {
                    fileOutputStream.write(read);
                    read = zipInputStream.read();
                }
                fileOutputStream.close();
                zipInputStream.closeEntry();
            }
            zipEntry = zipInputStream.getNextEntry();
        }
        zipInputStream.close();
    }

    private static void compress(String dir, String zipName) throws IOException {
        File zip = new File(zipName);
        FileOutputStream fileOutputStream = new FileOutputStream(zip);
        ZipOutputStream zipOutputStream = new ZipOutputStream(fileOutputStream);
        //
        zip(zipOutputStream, new File(dir), "", zip);
        zipOutputStream.close();
    }

    private static void zip(ZipOutputStream zipOutputStream, File file, String base, File zip) throws IOException {
        if (file.getPath().equals(zip.getPath())) {
            return;
        }
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            base = (base == null || base.trim().isEmpty()) ? "" : base + File.separator;
            if (files.length == 0) {
                zipOutputStream.putNextEntry(new ZipEntry(base));
            } else {
                for (File f : files) {
                    base = (base == null || base.trim().isEmpty()) ? "" : base + File.separator;
                    zip(zipOutputStream, f, base + f.getName(), zip);
                }
            }
        } else {
            zipOutputStream.putNextEntry(new ZipEntry(base));
            FileInputStream fileInputStream = new FileInputStream(file);
            int b = fileInputStream.read();
            while (b != -1) {
                zipOutputStream.write(b);
                b = fileInputStream.read();
            }
            fileInputStream.close();
        }
    }

}

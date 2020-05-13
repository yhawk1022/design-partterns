package org.yan.practice.patterns.stuctural.decorator;

import java.io.*;

/**
 * @author pangyan
 * @date 2020/5/13 12:41
 * @description 简单数据读写器
 */
public class BaseIOComponent implements DataSource {

    private String fileName;

    public BaseIOComponent(String fileName) {
        System.out.println("简单数据读写器被执行");
        this.fileName = fileName;
    }

    @Override
    public void writeData(String data) throws IOException {

        System.out.println("简单数据读写器writeData");
        File file = new File(fileName);
        OutputStream outputStream = new FileOutputStream(file);
        outputStream.write(data.getBytes(), 0, data.length());
    }

    @Override
    public String readData() throws IOException {
        File file = new File(fileName);
        char[] buffer = new char[(int) file.length()];
        FileReader fileReader = new FileReader(file);
        fileReader.read(buffer);
        return new String(buffer);
    }
}

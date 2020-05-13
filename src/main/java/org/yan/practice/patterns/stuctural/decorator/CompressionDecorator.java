package org.yan.practice.patterns.stuctural.decorator;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ByteChannel;
import java.util.Base64;
import java.util.zip.*;


/**
 * @author pangyan
 * @date 2020/5/13 13:44
 * @description 压缩装饰
 */
public class CompressionDecorator extends BaseDecorator{

    private int compressLevel = Deflater.DEFLATED;

    public int getCompressLevel() {
        return compressLevel;
    }

    public void setCompressLevel(int compressLevel) {
        this.compressLevel = compressLevel;
    }

    CompressionDecorator(DataSource dataSource) {
        super(dataSource);
        System.out.println("压缩装饰器被执行");
    }

    @Override
    public void writeData(String data) throws IOException {
        System.out.println("压缩装饰器writeData");
        super.writeData(compress(data));
    }

    @Override
    public String readData() throws IOException {
        return decompress(super.readData());
    }

    private String compress(String stringData) throws IOException {

        byte[] data = stringData.getBytes();
        ByteArrayOutputStream bout = new ByteArrayOutputStream(512);
        DeflaterOutputStream dos = new DeflaterOutputStream(bout,new Deflater(compressLevel));
        dos.write(data);
        dos.close();
        bout.close();

        return Base64.getEncoder().encodeToString(bout.toByteArray());
    }

    private String decompress(String stringData) throws IOException {
        byte[] data = Base64.getDecoder().decode(stringData);
        InputStream in = new ByteArrayInputStream(data);
        InflaterInputStream iin = new InflaterInputStream(in);
        ByteArrayOutputStream bout = new ByteArrayOutputStream(512);

        int b;
        while ((b = iin.read()) != -1) {
            bout.write(b);
        }

        in.close();
        iin.close();
        bout.close();
        return new String(bout.toByteArray());
    }

}

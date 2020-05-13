package org.yan.practice.patterns.stuctural.decorator;

import java.io.IOException;
import java.util.Base64;

/**
 * @author pangyan
 * @date 2020/5/13 13:35
 * @description 加密的装饰类
 */
public class EncryptionDecorator extends BaseDecorator {


    EncryptionDecorator(DataSource dataSource) {
        super(dataSource);
        System.out.println("加密装饰器被执行");

    }

    @Override
    public void writeData(String data) throws IOException {
        System.out.println("加密装饰器writeData");

        super.writeData(encode(data));
    }

    @Override
    public String readData() throws IOException {
        return decode(super.readData());
    }

    private String encode(String data){
        byte[] rs = data.getBytes();

        for (int i=0;i<rs.length;i++){
            rs[i] += (byte)1;
        }

        return Base64.getEncoder().encodeToString(rs);
    }

    private String decode(String data){
        byte[] rs = Base64.getDecoder().decode(data);

        for (int i=0;i<rs.length;i++){
            rs[i] -= (byte) 1;
        }

        return new String(rs);
    }
}

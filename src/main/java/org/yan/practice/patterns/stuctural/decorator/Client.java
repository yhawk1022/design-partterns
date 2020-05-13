package org.yan.practice.patterns.stuctural.decorator;

import java.io.IOException;

/**
 * @author pangyan
 * @date 2020/5/13 14:29
 * @description
 */
public class Client {

    public static void main(String[] args) throws IOException {
        String testStr = "this \n is \n a \n test";
        BaseDecorator encoded = new CompressionDecorator(
                new EncryptionDecorator(
                        new BaseIOComponent("d:/out/demo.txt")));

        encoded.writeData(testStr);
//        DataSource plain = new BaseIOComponent("d:/out/demo.txt");

//        System.out.println("- Input ----------------");
//        System.out.println(testStr);
//        System.out.println("- Encoded --------------");
//        System.out.println(plain.readData());
//        System.out.println("- Decoded --------------");
//        System.out.println(encoded.readData());
    }
}

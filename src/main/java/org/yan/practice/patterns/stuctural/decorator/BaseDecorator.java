package org.yan.practice.patterns.stuctural.decorator;

import java.io.IOException;

/**
 * @author pangyan
 * @date 2020/5/13 13:32
 * @description 基础装饰器
 */
public class BaseDecorator implements DataSource {

    private DataSource wrapper;

    BaseDecorator(DataSource dataSource){
        this.wrapper = dataSource;
        System.out.println("wrapper="+wrapper.getClass().getName());
        System.out.println("基础装饰器被执行");

    }

    @Override
    public void writeData(String data) throws IOException {
        System.out.println("基础装饰器writeData"+","+"wrapper="+wrapper.getClass().getName());

        wrapper.writeData(data);
    }

    @Override
    public String readData() throws IOException {
        return wrapper.readData();
    }
}

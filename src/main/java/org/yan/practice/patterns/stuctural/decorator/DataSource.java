package org.yan.practice.patterns.stuctural.decorator;

import java.io.IOException;

/**
 * @author pangyan
 * @date 2020/5/13 12:39
 * @description
 */
public interface DataSource {

    void writeData(String data) throws IOException;

    String readData() throws IOException;

}

package ch.heigvd.dai.binary;

import ch.heigvd.dai.Readable;

import java.io.FileInputStream;
import java.io.IOException;

public class BinaryFileReader implements Readable {

    @Override
    public void read(String filename) throws IOException {
        // TODO : implement this method

        FileInputStream fis = new FileInputStream(filename);
        int data;
        while ((data = fis.read()) != -1) {
            System.out.println((char) data);

        }
        fis.close();
        //throw new UnsupportedOperationException("Not implemented yet");
    }
}

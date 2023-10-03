package ch.heigvd.dai.binary;

import ch.heigvd.dai.Readable;

import java.io.*;

public class BufferedBinaryFileReader implements Readable {

    @Override
    public void read(String filename) throws IOException {
        // TODO : implement this method
        FileInputStream fis = new FileInputStream(filename);
        BufferedInputStream bis = new BufferedInputStream(fis);
        int data;
        while ((data = bis.read()) != -1) {
            System.out.println((char) data);

        }
        bis.close();
        //throw new UnsupportedOperationException("Not implemented yet");


    }
}

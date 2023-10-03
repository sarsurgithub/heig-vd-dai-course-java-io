package ch.heigvd.dai.binary;

import ch.heigvd.dai.Writable;

import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryFileWriter implements Writable {

    @Override
    public void write(String filename, int sizeInBytes) throws IOException {
        // TODO : implement this method
        FileOutputStream fos = new FileOutputStream(filename);
        byte[] ba = new byte[sizeInBytes];
        for(int i = 0; i < sizeInBytes; ++i){
            fos.write(ba[i]);
        }
        fos.flush();
        fos.close();
        //throw new UnsupportedOperationException("Not implemented yet");
    }
}

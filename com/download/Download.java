package com.download;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

public class Download {
    public void downloadFile() {
        try {
            URL url = new URL("https://testfile.org/dummy-test-file/1gb-large-test-file-direct-download/");
            InputStream inputStream = url.openStream();
            FileOutputStream fileOutputStream = new FileOutputStream("./sample/sample1.zip");
            byte[] bytes = new byte[4096];

            while ((inputStream.read(bytes)) != -1) {
                fileOutputStream.write(bytes, 0, bytes.length);
            }

            fileOutputStream.close();
            inputStream.close();
            System.out.println("Download completed..........");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

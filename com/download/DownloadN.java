package com.download;

import com.download.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.net.*;

public class DownloadN {
    public void downloadFile(String fileURL, String destinationFile,String username,String password) {
        try {
            Auth obj1 = new Auth();
            Authenticator.setDefault(new Auth());
            
            obj1.getPasswordAuthentication();

            URL url = new URL(fileURL);
            URLConnection connection = url.openConnection();
            try (ReadableByteChannel readableByteChannel = Channels.newChannel(connection.getInputStream());
                    FileOutputStream fileOutputStream = new FileOutputStream(destinationFile)) {

                fileOutputStream.getChannel().transferFrom(readableByteChannel, 0, Long.MAX_VALUE);
            }
            System.out.println("File downloaded successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

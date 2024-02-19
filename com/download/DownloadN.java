package com.download;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.net.URL;

public class DownloadN {
    public void downloadFile(String fileURL, String destinationFile) {
        try {
            URL url = new URL(fileURL);
            try (ReadableByteChannel readableByteChannel = Channels.newChannel(url.openStream());
                    FileOutputStream fileOutputStream = new FileOutputStream(destinationFile)) {

                fileOutputStream.getChannel().transferFrom(readableByteChannel, 0, Long.MAX_VALUE);
            }
            System.out.println("File downloaded successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

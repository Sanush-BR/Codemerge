import com.download.*;

public class Main {
    public static void main(String[] args) {
        // Download download = new Download();
        // download.downloadFile();

        String fileURL = "https://thetestdata.com/samplefiles/zip/Thetestdata_ZIP_500KB.zip";
        String destinationFile = "./sample/sample2.zip";
        DownloadN download = new DownloadN();
        System.out.println("Starting..................");
        download.downloadFile(fileURL, destinationFile);
    }

}
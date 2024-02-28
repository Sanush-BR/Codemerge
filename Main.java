import com.download.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws FileNotFoundException , IOException{
        // Download download = new Download();
        // download.downloadFile();
        // String fileURL = "https://srikarthiks.files.wordpress.com/2016/07/java-the-complete-reference-8th-edition.pdf";
        // String destinationFile = "./sample/sample4.pdf";
        Properties prop = new Properties();  
    
        FileReader reader = new FileReader("config.properties");
        prop.load(reader);
        
        DownloadN download = new DownloadN();
        System.out.println("Starting..................");
       
        download.downloadFile(prop.getProperty("fileURL"), prop.getProperty("destinationFile"),prop.getProperty("userName"),prop.getProperty("password"));
    }

}
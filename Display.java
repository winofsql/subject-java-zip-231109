// import java.io.*;
import java.util.List;
import net.lingala.zip4j.ZipFile;
import net.lingala.zip4j.model.FileHeader;
// import net.lingala.zip4j.model.ZipParameters;

public class Display extends Insert {

    public Display(  ) {
      System.out.println("Display の引数の無いコンストラクタ");
    }

    public Display( String fileName ) {
      super( fileName );
      System.out.println("Display の引数が String fileName のコンストラクタ");
    }

    public void list() {

    }

    public void list(List<FileHeader> fileHeaders) {
        // 一覧表示
        try {
          // UTF-8 のみ
          ZipFile zipFile = new ZipFile(this.getFileName());
          fileHeaders = zipFile.getFileHeaders();
          fileHeaders
            .stream()
            .forEach( fileHeader -> {
                // String fileName = fileHeader.getFileName();
                System.out.println(fileHeader.getFileName());
            });
          zipFile.close();
        }
        catch (Exception e) {
          e.printStackTrace();
        }
    }

    public void list(List<FileHeader> fileHeaders, String fileName) {
        // 一覧表示
        try {
          // UTF-8 のみ
          ZipFile zipFile = new ZipFile(fileName);
          fileHeaders = zipFile.getFileHeaders();
          fileHeaders
            .stream()
            .forEach( fileHeader -> {
                // String fileName = fileHeader.getFileName();
                System.out.println(fileHeader.getFileName());
            });
          zipFile.close();
        }
        catch (Exception e) {
          e.printStackTrace();
        }
    }

}

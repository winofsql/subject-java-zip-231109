
// import java.io.*;
// import java.util.*;
import net.lingala.zip4j.ZipFile;
// import net.lingala.zip4j.model.FileHeader;
import net.lingala.zip4j.model.ZipParameters;

public class Insert {

    private String fileName;

    public Insert() {
        this.fileName = "default.zip";
        System.out.println("Insert の引数の無いコンストラクタ");
    }

    public Insert( String fileName ) {
        this.fileName = fileName;
        System.out.println("Insert の引数が String fileName のコンストラクタ");
    }

    // ゲッター
    // getter
    public String getFileName() {
        return this.fileName;
    }

    // セッター
    // setter
    public void setFileName( String fileName ) {
        this.fileName = fileName;
    }

    public void build( String rootFolderName, String targetFile ) {
        // 指定階層にファイルを追加
        try {
            ZipFile zipFile = new ZipFile(fileName);
            ZipParameters parameters = new ZipParameters();
            parameters.setRootFolderNameInZip(rootFolderName);
            zipFile.addFile(targetFile, parameters);
            zipFile.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
    public void build( String zipFilename, String rootFolderName, String targetFile ) {
        // 指定階層にファイルを追加
        try {
            ZipFile zipFile = new ZipFile(zipFilename);
            ZipParameters parameters = new ZipParameters();
            parameters.setRootFolderNameInZip(rootFolderName);
            zipFile.addFile(targetFile, parameters);
            zipFile.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }

}

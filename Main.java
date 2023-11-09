// import java.io.*;
import java.util.*;
import net.lingala.zip4j.ZipFile;
import net.lingala.zip4j.model.FileHeader;
// import net.lingala.zip4j.model.ZipParameters;

public class Main extends Display {
    public static void main(String[] args) {

        String fileName = "subject-1108.zip";

        List<FileHeader> fileHeaders = new ArrayList<FileHeader>();

        Main main = new Main( fileName );
        System.out.println("fileName1 : " + main.getFileName());
        main.setFileName("subject-1109.zip");
        System.out.println("fileName2 : " + main.getFileName());

        // main.build(fileName,"abc/xyz", "Main.java");
        main.build("abc/xyz", "Main.java");
        // main.list( fileHeaders, fileName );
        main.list( fileHeaders );

        // 指定階層のファイルを指定フォルダに解凍
        // ※ 第三引数が無ければ、ファイル名はそのまま
        try {
          ZipFile zipFile = new ZipFile(main.getFileName());
          // 単一ファイルの解凍
          zipFile.extractFile("abc/xyz/Main.java","target2", "abc/xyz/Main5.txt");
          zipFile.extractFile("abc/xyz/Main.java","target2", "Main5.txt");
          zipFile.close();
        }
        catch (Exception e) {
          e.printStackTrace();
        }
    }

    public Main() {
      System.out.println("Main の引数の無いコンストラクタ");
    }

    public Main( String fileName ) {
      super( fileName );
      System.out.println("Main の引数が String fileName のコンストラクタ");
    }

}

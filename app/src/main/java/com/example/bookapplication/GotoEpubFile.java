package com.example.bookapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.folioreader.Config;
import com.folioreader.FolioReader;
import com.folioreader.util.AppUtil;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

import static com.folioreader.util.FileUtil.getFolioEpubFolderPath;


public class GotoEpubFile extends AppCompatActivity {
    private FolioReader folioReader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goto_epub_file);
        folioReader = FolioReader.get();

        Config config = AppUtil.getSavedConfig(getApplicationContext());
        if (config == null)
            config = new Config();
        config.setAllowedDirection(Config.AllowedDirection.VERTICAL_AND_HORIZONTAL);

//        File new_file = new File(getFolioEpubFolderPath("astronomy.epub"));
//        Log.d("mytag", new_file.getPath());
        folioReader.setConfig(config, true)
                .openBook(R.raw.astronomy);
    }
//    public static Boolean saveTempEpubFile() {
//        InputStream inputStream = new InputStream() {
//            @Override
//            public int read() throws IOException {
//                return 0;
//            }
//        };
//        OutputStream outputStream = null;
//        File file = new File("astronomy.epub");
//        try {
//            if (!file.exists()) {
//                File folder = new File(getFolioEpubFolderPath("astronomy.epub"));
//                folder.mkdirs();
//                outputStream = new FileOutputStream(file);
//                int read = 0;
//                byte[] bytes = new byte[inputStream.available()];
//                while ((read = inputStream.read(bytes)) != -1) {
//                    outputStream.write(bytes, 0, read);
//                }
//            } else {
//                Log.d("mytag", "file found");
//                return true;
//            }
//            inputStream.close();
//            outputStream.close();
//        } catch (IOException e) {
//            Log.d("error", e.getMessage());
//        }
//        return false;
//    }
//
//    private static void isFolderAvailable() {
//        File file = new File(getFolioEpubFolderPath("astronomy.epub"));
//        Log.d("mytag", "hwdsf"+ file.getPath());
//        Log.d("mytag", Boolean.toString(file.isDirectory()));
//    }

}

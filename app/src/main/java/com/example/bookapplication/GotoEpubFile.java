package com.example.bookapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.folioreader.FolioReader;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class GotoEpubFile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goto_epub_file);

        FolioReader folioReader = FolioReader.get();
        folioReader.openBook("/data/user/0/com.example.bookapplication/files/astronomy.epub");

    }
}

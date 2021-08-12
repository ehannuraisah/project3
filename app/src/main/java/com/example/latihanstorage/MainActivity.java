package com.example.latihanstorage;
import android.os.Environment;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;


public class MainActivity extends AppCompatActivity { implements viewOnClickListener {
    public static final String FILENAME="namafile.txt";
    Button buatFile,ubahFile, bacaFile, deleteFile;
    TextView textBaca;

}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buatFile = findViewById(R.id.buttonBuatFile);
        ubahFile = findViewById(R.id.buttonUbahFile);
        bacaFile = findViewById(R.id.buttonBacaFile);
        deleteFile = findViewById(R.id.buttonHapusFile);
        textBaca =findViewById(R.id.textBaca);

        buatFile.setOnClickListener(this);
        ubahFile.setOnClickListener(this);
        bacaFile.setOnClikListener(this);
        deleteFile.setOnClickListener(this);

    }
    void buatFile() {
        String isiFile = "Coba isi Data File Text";
        File file = new File(getFilesDir(), FILENAME);


        FileOutputStream outputStream = null;
        try
        file.createNewFile();
        outputStream = new FileOutputStream(file, true);
        outputStream.write(isiFile.getBytes());
        outputStream.flush();
        outputStream.close();
    }catch (Exception e) {
        e.printStackTrace();

    }
}

    void ubahFile() {
    String ubah = "Update Isi Data File Text";
        File file = new File(getFilesDir()FILENAME);
        FileOutputStream outputStream = null;
        try
        file.createNewFile();
        outputStream = new FileOutputStream(file, true);
        outputStream.write(ubah.getBytes());
        outputStream.flush();
        outputStream.close();
    }catch (Exception e)
        e.printStackTrace();
    }
}

    void bacaFile() {
        String ubah = "Update Isi Data File Text";
        File sdcard = new File(sdcard, FILENAME);
        if(file.exists()){
         StringBuilder text = new StringBuilder();
         try{
         BufferedReader br = new BufferedReader(new FileReader(file));

         String line = br.readLine();

         while (line != null){
             text.append(line);
        }
         be.close();
         } catch (IOException e){
             System.out.println("Error"+ e.getMessage());
        }
         textBaca.setText(text.toString());
        }
        }
    void hapusFile(){
     File file = new File(getFilesDir(), FILENAME);
      If (file.exists()){
          file.delete();
        }
        }
    @Override
public void onClick(View v){
    jalankanPerintah(v.getId());
        }
public void jalankanPerintah(int id){
        switch(id){
        case R.id.buttonBuatFile;
        buatFile();
        break;
        case R.id.buttonBacaFile;
        bacaFile();
        break;
        case R.id.buttonUbahFile;
        ubahFile();
        break;
        case R.id.buttonHapusFile;
        hapusFile();
        break;
        }
        }
        }

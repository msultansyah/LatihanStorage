package id.ac.poliban.mi.sultan.latihanstorage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.File;
import java.io.FileOutputStream;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    public static final String FILENAME = "namafile.txt";
    Button btBuatFile, btUbahFIle, btBacaFile, btDeleteFile;
    TextView tvBaca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btBuatFile = findViewById(R.id.btBuatFile);
        btBacaFile = findViewById(R.id.btBacaFile);
        btUbahFIle = findViewById(R.id.btUbahFile);
        btDeleteFile= findViewById(R.id.btHapusFile);
        tvBaca = findViewById(R.id.tvBaca);

        btBuatFile.setOnClickListener(this);
        btBacaFile.setOnClickListener(this);
        btUbahFIle.setOnClickListener(this);
        btDeleteFile.setOnClickListener(this);
    }

    void btBuatFile(){
        String isiFile = "Coba Isi Data File Text";
        File file = new File(getFilesDir(), FILENAME);

        FileOutputStream outputStream = null;
        try {
            file.createNewFile();
            outputStream = new FileOutputStream(file, true);
            outputStream.write(isiFile.getBytes());
            outputStream.flush();
            outputStream.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

}

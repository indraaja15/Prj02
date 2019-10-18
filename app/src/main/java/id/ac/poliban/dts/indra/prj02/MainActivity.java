package id.ac.poliban.dts.indra.prj02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etSatu, etDua;
    Button tambah,kurang,bagi,kali;
    TextView Hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText etSatu = findViewById(R.id.etSatu);
        final EditText etDua = findViewById(R.id.etDua);
        Button btTambah = findViewById(R.id.btTambah);
        Button btKurang = findViewById(R.id.btKurang);
        Button btKali = findViewById(R.id.btKali);
        Button btBagi = findViewById(R.id.btBagi);
        Button btBersihkan = findViewById(R.id.btBersihkan);
        final TextView Hasil = findViewById(R.id.Hasil);

        btTambah.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if((etSatu.getText().length()>0) && (etDua.getText().length()>0))
                {
                 Integer angka1 = Integer.parseInt(etSatu.getText().toString());
                 Integer angka2 = Integer.parseInt(etDua.getText().toString());
                 Integer result = angka1 + angka2;
                 Hasil.setText(Integer.toString(result));
                }
                else{
                    Toast.makeText(MainActivity.this, "MOHON MASUKKAN ANGKA", Toast.LENGTH_LONG).show();
                }
            }
        });

        btKurang.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if((etSatu.getText().length()>0) && (etDua.getText().length()>0))
                {
                    Integer angka1 = Integer.parseInt(etSatu.getText().toString());
                    Integer angka2 = Integer.parseInt(etDua.getText().toString());
                    Integer result = angka1 - angka2;
                    Hasil.setText(Integer.toString(result));
                }
                else{
                    Toast.makeText(MainActivity.this, "MOHON MASUKKAN ANGKA", Toast.LENGTH_LONG).show();
                }
            }
        });

        btKali.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if((etSatu.getText().length()>0) && (etDua.getText().length()>0))
                {
                    Integer angka1 = Integer.parseInt(etSatu.getText().toString());
                    Integer angka2 = Integer.parseInt(etDua.getText().toString());
                    Integer result = angka1 * angka2;
                    Hasil.setText(Integer.toString(result));
                }
                else{
                    Toast.makeText(MainActivity.this, "MOHON MASUKKAN ANGKA", Toast.LENGTH_LONG).show();
                }
            }
        });

        btBagi.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if((etSatu.getText().length()>0) && (etDua.getText().length()>0))
                {
                    Integer angka1 = Integer.parseInt(etSatu.getText().toString());
                    Integer angka2 = Integer.parseInt(etDua.getText().toString());
                    Integer result = angka1 % angka2;
                    Hasil.setText(Integer.toString(result));
                }
                else{
                    Toast.makeText(MainActivity.this, "MOHON MASUKKAN ANGKA", Toast.LENGTH_LONG).show();
                }
            }
        });

        btBersihkan.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                etSatu.setText("");
                etDua.setText("");
                Hasil.setText("0");
                etSatu.requestFocus();
            }
        });

    }

}

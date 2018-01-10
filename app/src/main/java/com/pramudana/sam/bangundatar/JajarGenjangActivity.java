package com.pramudana.sam.bangundatar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class JajarGenjangActivity extends AppCompatActivity {

    EditText etAlas, etTinggi;
    Button btnHitungSbmt;
    TextView txtHsl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jajar_genjang);

        etAlas = (EditText)findViewById(R.id.etAlas);
        etTinggi = (EditText)findViewById(R.id.etTinggi);
        btnHitungSbmt = (Button)findViewById(R.id.btnHitungSbmt);
        txtHsl = (TextView)findViewById(R.id.txtHsl);

        btnHitungSbmt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nAlas = etAlas.getText().toString();
                String nTinggi = etTinggi.getText().toString();

                if(nAlas.isEmpty()){
                    //memberikan warning berupa error
                    etAlas.setError("Alas Tidak Boleh Kosong");
                }else if (nTinggi.isEmpty()){
                    //kondisi ketika lebarnya kosong
                    etTinggi.setError("Tinggi Tidak Boleh Kosong");
                }else {
                    int aAlas = Integer.parseInt(nAlas);
                    int aTinggi = Integer.parseInt(nTinggi);
                    //kondisi ketika panjang dan lebar nya tidak kosong
                    int hasilHitungKeliling = 2 * (aAlas + aTinggi);
                    int hasilhitungLuas = aAlas * aTinggi;

                    txtHsl.setText("Keliling = " + hasilHitungKeliling + " Luas = " + hasilhitungLuas);
                }
            }
        });
    }
}

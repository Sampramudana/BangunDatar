package com.pramudana.sam.bangundatar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LingkaranActivity extends AppCompatActivity {

    EditText etSisi, etAls;
    Button btnCountSbmt;
    TextView txtSama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);

        etSisi = (EditText)findViewById(R.id.etSisi);
        etAls = (EditText)findViewById(R.id.etAls);
        btnCountSbmt = (Button)findViewById(R.id.btnCountSbmt);
        txtSama = (TextView)findViewById(R.id.txtSama);

        btnCountSbmt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nSisi = etSisi.getText().toString();
                String nAlas = etAls.getText().toString();

                if(nSisi.isEmpty()){
                    //memberikan warning berupa error
                    etSisi.setError("Sisi Tidak Boleh Kosong");
                }else if (nAlas.isEmpty()){
                    //kondisi ketika lebarnya kosong
                    etAls.setError("Alas Tidak Boleh Kosong");
                }else {
                    int aSisi = Integer.parseInt(nSisi);
                    int aAlas = Integer.parseInt(nAlas);
                    //kondisi ketika panjang dan lebar nya tidak kosong
                    int hasilHitungKeliling = (2 * aAlas) + (2 * aSisi);
                    int hasilhitungLuas = aSisi * aAlas;

                    txtSama.setText("Keliling = " + hasilHitungKeliling + " Luas = " + hasilhitungLuas);
                }
            }
        });
    }
}

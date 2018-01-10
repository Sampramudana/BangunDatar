package com.pramudana.sam.bangundatar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PersegiPanjangActivity extends AppCompatActivity {

    EditText etLong, etWidth;
    Button btnSbmt;
    TextView txtEquals;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi_panjang);

        etLong = (EditText)findViewById(R.id.etLong);
        etWidth = (EditText)findViewById(R.id.etWidth);
        btnSbmt = (Button)findViewById(R.id.btnSbmt);
        txtEquals = (TextView)findViewById(R.id.txtEquals);

        btnSbmt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nLong = etLong.getText().toString();
                String nWidth = etWidth.getText().toString();

                if(nLong.isEmpty()){
                    //memberikan warning berupa error
                    etLong.setError("Panjang Tidak Boleh Kosong");
                }else if (nWidth.isEmpty()){
                    //kondisi ketika lebarnya kosong
                    etWidth.setError("Lebar Tidak Boleh Kosong");
                }else {
                    int aLong = Integer.parseInt(nLong);
                    int aWidth = Integer.parseInt(nWidth);

                    int hasilHitungKeliling = 2 * (aLong + aWidth);
                    int hasilhitungLuas = aLong * aWidth;

                    txtEquals.setText("Keliling = " + hasilHitungKeliling + " Luas = " + hasilhitungLuas);
                }
            }
        });
    }
}

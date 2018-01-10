package com.pramudana.sam.bangundatar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SegitigaActivity extends AppCompatActivity {

    EditText etPedestal, etHigh;
    Button btnCount;
    TextView txtJadi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        etPedestal = (EditText)findViewById(R.id.etPedestal);
        etHigh = (EditText)findViewById(R.id.etHigh);
        btnCount = (Button)findViewById(R.id.btnCount);
        txtJadi = (TextView)findViewById(R.id.txtJadi);

        btnCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nPedestal = etPedestal.getText().toString();
                String nHigh = etHigh.getText().toString();

                if(nPedestal.isEmpty()){
                    //memberikan warning berupa error
                    etPedestal.setError("Alas Tidak Boleh Kosong");
                }else if (nHigh.isEmpty()){
                    //kondisi ketika lebarnya kosong
                    etHigh.setError("Tinggi Tidak Boleh Kosong");
                }else {
                    int aPedestal= Integer.parseInt(nPedestal);
                    int aHigh = Integer.parseInt(nHigh);
                    //kondisi ketika panjang dan lebar nya tidak kosong
                    int hasilHitungKeliling =  aHigh * aPedestal * aHigh;
                    int hasilhitungLuas = 1/2 * aHigh * aPedestal;

                    txtJadi.setText("Keliling = " + hasilHitungKeliling + " Luas = " + hasilhitungLuas);
                }
            }
        });
    }
}

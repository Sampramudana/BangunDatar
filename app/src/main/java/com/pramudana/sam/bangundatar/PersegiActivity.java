package com.pramudana.sam.bangundatar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PersegiActivity extends AppCompatActivity {

    EditText etPanjang, etLebar;
    Button btnHitung;
    TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);

        //memanggil id Widget
        etPanjang = (EditText)findViewById(R.id.etPanjang);
        etLebar = (EditText)findViewById(R.id.etLebar);
        btnHitung = (Button)findViewById(R.id.btnHitungPersegi);
        txtHasil = (TextView)findViewById(R.id.txtHasil);

        //aksi ketika Button btnHitung di klik
        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //mengambil nilai dari widget edit text dan memasukkan kedalam nilai String
                String nPanjang = etPanjang.getText().toString();
                String nLebar = etLebar.getText().toString();


                //mengecek apakah edit text kosong
                //kondisi ketika panjangnya kosong
                if(nPanjang.isEmpty()){
                    //memberikan warning berupa error
                    etPanjang.setError("Panjang Tidak Boleh Kosong");
                }else if (nLebar.isEmpty()){
                    //kondisi ketika lebarnya kosong
                    etLebar.setError("Lebar Tidak Boleh Kosong");
                }else {
                    //mengubah nilai dari String ke Integer
                    int aPanjang = Integer.parseInt(nPanjang);
                    int aLebar = Integer.parseInt(nLebar);
                    //kondisi ketika panjang dan lebar nya tidak kosong
                    int hasilHitungKeliling = (2 * aPanjang) + (2 * aLebar);
                    int hasilhitungLuas = aPanjang * aLebar;

                    //menampilkan hasil hitung ke widget textView
                    txtHasil.setText("Keliling = " + hasilHitungKeliling + " Luas = " + hasilhitungLuas);
                }
            }
        });
    }
}

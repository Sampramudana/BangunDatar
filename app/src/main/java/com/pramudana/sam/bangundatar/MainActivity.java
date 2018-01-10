package com.pramudana.sam.bangundatar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //deklarasi widget button

    Button btnPersegi, btnPersegiPanjang, btnJajarGenjang, btnSegitiga, btnLingkaran;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //memanggil id Button
        btnPersegi = (Button)findViewById(R.id.btnPersegi);
        //agar Button btnPersegi bisa diKlik
        btnPersegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //menambahkan intent agar pindah halaman ke activity lain
                Intent a1 = new Intent(getApplicationContext(), PersegiActivity.class);
                //agar bisa pindah activity maka kita harus nambahin startActivity
                startActivity(a1);
            }
        });

        btnPersegiPanjang = (Button)findViewById(R.id.btnPersegiPanjang);
        btnPersegiPanjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent a2 = new Intent(getApplicationContext(), PersegiPanjangActivity.class);
                startActivity(a2);
            }
        });

        btnJajarGenjang = (Button)findViewById(R.id.btnJajarGenjang);
        btnJajarGenjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent a3 = new Intent(getApplicationContext(), JajarGenjangActivity.class);
                startActivity(a3);
            }
        });

        btnSegitiga = (Button)findViewById(R.id.btnSegitiga);
        btnSegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent a4 = new Intent(getApplicationContext(), SegitigaActivity.class);
                startActivity(a4);
            }
        });

        btnLingkaran = (Button)findViewById(R.id.btnLingkaran);
        btnLingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent a5 = new Intent(getApplicationContext(), LingkaranActivity.class);
                startActivity(a5);
            }
        });
    }
}

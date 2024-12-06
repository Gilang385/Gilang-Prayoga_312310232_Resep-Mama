package com.example.resepmama;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Ambil data dari Intent, berupa string 'recipe'
        String recipe = getIntent().getStringExtra("recipe");

        // Tentukan layout berdasarkan resep yang diklik
        if ("Rendang".equals(recipe)) {
            setContentView(R.layout.activity_rendang);  // Ganti dengan layout untuk resep Rendang
        } else if ("Ayam Bakar".equals(recipe)) {
            setContentView(R.layout.activity_ayam_bakar);  // Ganti dengan layout untuk resep Ayam Bakar
        } else if ("Seblak".equals(recipe)){
            setContentView(R.layout.activity_seblak);  // Ganti dengan layout untuk resep Seblak
        } else if ("Sop Iga".equals(recipe)){
            setContentView(R.layout.activity_sop_iga);  // Ganti dengan layout untuk resep Sop Iga
        } else if ("Candil Ketan".equals(recipe)){
            setContentView(R.layout.activity_candil_ketan);  // Ganti dengan layout untuk resep Candil Ketan
        } else if ("Rawon".equals(recipe)){
            setContentView(R.layout.activity_rawon);  // Ganti dengan layout untuk resep Rawon
        }

        // Mengaktifkan tombol back di toolbar
        ImageView backButton = findViewById(R.id.back_button);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Kembali ke halaman sebelumnya
                finish();
            }
        });
    }
}

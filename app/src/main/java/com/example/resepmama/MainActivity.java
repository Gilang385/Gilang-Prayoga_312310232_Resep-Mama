package com.example.resepmama;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inisialisasi setiap ImageView berdasarkan ID
        ImageView imageRendang = findViewById(R.id.image_rendang);
        ImageView imageAyamBakar = findViewById(R.id.image_ayam_bakar);
        ImageView imageSeblak = findViewById(R.id.image_seblak);
        ImageView imageSopIga = findViewById(R.id.image_sop_iga);
        ImageView imageCandilKetan = findViewById(R.id.image_candil_ketan);
        ImageView imageRawon = findViewById(R.id.image_rawon);

        // EditText dan ImageView untuk pencarian
        EditText searchEditText = findViewById(R.id.searchEditText);
        ImageView searchIcon = findViewById(R.id.search_icon);

        // Set OnClickListener untuk setiap ImageView (gambar resep)
        imageRendang.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, DetailActivity.class);
            intent.putExtra("recipe", "Rendang");
            startActivity(intent);
        });

        imageAyamBakar.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, DetailActivity.class);
            intent.putExtra("recipe", "Ayam Bakar");
            startActivity(intent);
        });

        imageSeblak.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, DetailActivity.class);
            intent.putExtra("recipe", "Seblak");
            startActivity(intent);
        });

        imageSopIga.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, DetailActivity.class);
            intent.putExtra("recipe", "Sop Iga");
            startActivity(intent);
        });

        imageCandilKetan.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, DetailActivity.class);
            intent.putExtra("recipe", "Candil Ketan");
            startActivity(intent);
        });

        imageRawon.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, DetailActivity.class);
            intent.putExtra("recipe", "Rawon");
            startActivity(intent);
        });

        // Set OnClickListener untuk ikon pencarian
        searchIcon.setOnClickListener(v -> {
            String searchQuery = searchEditText.getText().toString().trim();

            if (!searchQuery.isEmpty()) {
                // Logika pencarian berdasarkan nama resep
                if (searchQuery.equalsIgnoreCase("Rendang")) {
                    Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                    intent.putExtra("recipe", "Rendang");
                    startActivity(intent);
                } else if (searchQuery.equalsIgnoreCase("Ayam Bakar")) {
                    Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                    intent.putExtra("recipe", "Ayam Bakar");
                    startActivity(intent);
                } else if (searchQuery.equalsIgnoreCase("Seblak")) {
                    Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                    intent.putExtra("recipe", "Seblak");
                    startActivity(intent);
                } else if (searchQuery.equalsIgnoreCase("Sop Iga")) {
                    Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                    intent.putExtra("recipe", "Sop Iga");
                    startActivity(intent);
                } else if (searchQuery.equalsIgnoreCase("Candil Ketan")) {
                    Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                    intent.putExtra("recipe", "Candil Ketan");
                    startActivity(intent);
                } else if (searchQuery.equalsIgnoreCase("Rawon")) {
                    Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                    intent.putExtra("recipe", "Rawon");
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "Resep tidak ditemukan", Toast.LENGTH_SHORT).show();
                }
            } else {
                Toast.makeText(MainActivity.this, "Masukkan kata kunci pencarian", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

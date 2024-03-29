package com.example.tugasandroidnavigationdrawer;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.bumptech.glide.Glide;

public class Kuliner extends AppCompatActivity {

    TextView nama,deskripsi;
    ImageView Image,ImgRating;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_kuliner);
        nama =findViewById(R.id.TVnama);
        deskripsi = findViewById(R.id.TVdeskripsi);
        Image = findViewById(R.id.IVkuliner);
        ImgRating = findViewById(R.id.IVRating);

        Intent intent =getIntent();
        String nama_intent = intent.getStringExtra("nama");
        String ImgURL_intent = intent.getStringExtra("img");
        String rating_intent = intent.getStringExtra("rating");
        String deskripsi_intent = intent.getStringExtra("deskripsi");

        nama.setText(nama_intent);
        deskripsi.setText(deskripsi_intent);
        Glide.with(this).load(ImgURL_intent).into(Image);
        switch (rating_intent){
            case "3.5":
                ImgRating.setImageResource(R.drawable._3_5_star_rating_icon);
                break;
            case "4":
                ImgRating.setImageResource(R.drawable._4_star_rating_icon);
                break;
            case "4.5":
                ImgRating.setImageResource(R.drawable._4_5_star_rating_icon);
                break;
            case "5":
                ImgRating.setImageResource(R.drawable._5_star_rating_icon);
                break;
            default:
                ImgRating.setImageResource(R.drawable.error);
                break;
        }

    }
}
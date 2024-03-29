package com.example.tugasandroidnavigationdrawer;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
public class ViewHolder_Kuliner extends RecyclerView.ViewHolder implements View.OnClickListener {

    private ImageView imageView;
    private TextView nama;
    private Context context;
    private ImageView imgRating;
    private items currentItem;

    public ViewHolder_Kuliner(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.CIVkuliner);
        nama = itemView.findViewById(R.id.TVkuliner);
        context = itemView.getContext();
        imgRating = itemView.findViewById(R.id.IVrating);
        itemView.setOnClickListener(this);
    }

    public void bind(items item) {
        currentItem = item;
        nama.setText(item.getNama());
        Glide.with(itemView.getContext())
                .load(item.getImage())
                .placeholder(R.drawable.baseline_autorenew_24)
                .error(R.drawable.baseline_question_mark_24)
                .into(imageView);
        setRatingImage(item.getRating()); // Memanggil method untuk menetapkan gambar rating
    }

    private void setRatingImage(String rating) {
        int ratingImageResource;
        switch (rating) {
            case "3.5":
                ratingImageResource = R.drawable._3_5_star_rating_icon;
                break;
            case "4":
                ratingImageResource = R.drawable._4_star_rating_icon;
                break;
            case "4.5":
                ratingImageResource = R.drawable._4_5_star_rating_icon;
                break;
            case "5":
                ratingImageResource = R.drawable._5_star_rating_icon;
                break;
            default:
                ratingImageResource = R.drawable.error;
                break;
        }
        imgRating.setImageResource(ratingImageResource); // Menetapkan gambar rating
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(context, Khas.class);
        intent.putExtra("nama", currentItem.getNama());
        intent.putExtra("img", currentItem.getImage());
        intent.putExtra("rating", currentItem.getRating());
        intent.putExtra("deskripsi", currentItem.getDeskripsi());
        context.startActivity(intent); // Memulai aktivitas baru dengan konteks yang benar
    }
}

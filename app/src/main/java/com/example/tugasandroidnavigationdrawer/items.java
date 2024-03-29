package com.example.tugasandroidnavigationdrawer;

public class items {
    String nama;
    String image;
    String deskripsi;
    String rating;

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public items(String nama, String image, String deskripsi,String rating) {
        this.nama = nama;
        this.image = image;
        this.deskripsi = deskripsi;
        this.rating = rating;
    }
}

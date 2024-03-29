package com.example.tugasandroidnavigationdrawer.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tugasandroidnavigationdrawer.AdapterKuliner;
import com.example.tugasandroidnavigationdrawer.R;
import com.example.tugasandroidnavigationdrawer.items;

import java.util.ArrayList;
import java.util.List;

public class MinumanKhasFragment extends Fragment {
    private RecyclerView recyclerView;
    private AdapterKuliner adapter;
    private List<items> itemsList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_minuman_khas, container, false);

        recyclerView = view.findViewById(R.id.RVminumanKuliner);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 1));

        // Initialize your data
        itemsList = new ArrayList<>();
        itemsList.add(new items("Es Doger", "https://upload.wikimedia.org/wikipedia/commons/thumb/9/91/Es_Doger_1.JPG/1200px-Es_Doger_1.JPG", "Es doger adalah minuman khas dari Bandung, Jawa Barat. Minuman ini terbuat dari campuran santan, gula merah, cincau, kolang-kaling, dan es serut. Es doger memiliki cita rasa manis dan segar, cocok disantap sebagai penyejuk di cuaca panas.", "4.5"));
        itemsList.add(new items("Es Teler", "https://www.tangerangkota.go.id/files/berita/34037es-teler-segar-untuk-takjil-buka-puasa-intip-resepnya-34037.jpeg", "Es teler adalah minuman khas dari Jawa, Indonesia. Minuman ini terbuat dari campuran buah-buahan seperti alpukat, kelapa muda, nangka, cincau, kolang-kaling, es serut, dan disiram dengan susu dan sirup gula merah. Es teler memiliki rasa yang manis dan segar.", "4"));
        itemsList.add(new items("Bajigur", "https://www.sasa.co.id/medias/page_medias/resep_bajigur.jpeg", "Bajigur adalah minuman tradisional khas Sunda, Indonesia. Minuman ini terbuat dari campuran susu, gula merah, jahe, daun pandan, dan bubuk kopi. Bajigur biasanya disajikan hangat dan memiliki rasa yang manis dengan aroma jahe yang khas.", "4"));
        itemsList.add(new items("Es Kelapa Muda", "https://asset.kompas.com/crops/LgGmDBxglevUdnCm4fWkEIkVy-U=/0x0:739x493/750x500/data/photo/2020/01/29/5e3187c1ac05f.jpg", "Es kelapa muda adalah minuman khas dari Bali, Indonesia. Minuman ini terbuat dari air kelapa muda yang dicampur dengan es serut dan disajikan dalam kelapa. Es kelapa muda memiliki rasa yang segar dan manis alami dari kelapa muda.", "4.5"));
        itemsList.add(new items("Bandrek", "https://asset.kompas.com/crops/CAPgYOK6d2jPBKijYFIulsGnYMI=/0x0:1000x667/750x500/data/photo/2021/06/20/60cef105d4c03.jpg", "Bandrek adalah minuman tradisional khas Sunda, Indonesia. Minuman ini terbuat dari campuran jahe, gula merah, daun pandan, dan kayu manis yang direbus dengan air. Bandrek biasanya disajikan hangat dan memiliki rasa yang hangat serta menyegarkan.", "4"));
        itemsList.add(new items("Saraba", "https://www.masakapahariini.com/wp-content/uploads/2021/07/Saraba-500x300.jpg", "Saraba adalah minuman khas dari Timor Timur. Minuman ini terbuat dari campuran buah nenas yang diparut, air kelapa, gula merah, dan es batu. Saraba memiliki rasa yang segar dan manis.", "4"));
        itemsList.add(new items("Thai Iced Tea", "https://rachelcooksthai.com/wp-content/uploads/2022/08/Thai-Iced-Tea-5.jpg", "Thai iced tea adalah minuman khas dari Thailand. Minuman ini terbuat dari teh hitam yang diseduh dengan susu kental manis, gula, dan es batu. Thai iced tea memiliki cita rasa yang manis dan creamy.", "4"));
        itemsList.add(new items("Matcha Latte", "https://cdn.loveandlemons.com/wp-content/uploads/2023/06/iced-matcha-latte.jpg", "Matcha latte adalah minuman khas Jepang. Minuman ini terbuat dari bubuk teh hijau matcha yang dicampur dengan susu hangat atau susu almond. Matcha latte memiliki rasa yang khas dari teh hijau matcha dengan sentuhan creamy dari susu.", "4.5"));
        itemsList.add(new items("Kopi Arang", "https://upload.wikimedia.org/wikipedia/commons/8/81/Kopi_Joss.jpg", "Kopi arang adalah minuman kopi khas dari Yogyakarta, Indonesia. Kopi arang dibuat dengan cara menambahkan arang aktif ke dalam gelas atau cangkir yang berisi kopi panas. Proses ini memberikan aroma dan cita rasa yang unik pada kopi. Kopi arang biasanya disajikan tanpa gula, namun bisa ditambahkan sesuai selera.", "3.5"));
        itemsList.add(new items("Kopi Kebalik", "https://awsimages.detik.net.id/community/media/visual/2022/09/23/kupi-khop-kopi-dalam-gelas-terbalik-yang-unik-dari-aceh-2.jpeg", "Kopi Kebalik atau kopi khop adalah minuman kopi khas dari Pesisir Pantai Barat Aceh, tepatnya Kota Meulaboh. Dalam sejarahnya, Kopi Keblak yang sengaja disajikan dalam keadaan terbalik ini dikarenakan para nelayan di daerah pesisir pantai barat Aceh yang membawa kopinya harus menjedanya untuk mencari ikan terlebih dahulu. Kopi Keblak memiliki cita rasa yang unik dan khas karena proses penyajiannya yang berbeda, memberikan pengalaman yang unik bagi penikmatnya.", "3.5"));


        // Initialize your adapter
        adapter = new AdapterKuliner(getActivity(), itemsList);
        recyclerView.setAdapter(adapter);

        return view;
    }
}

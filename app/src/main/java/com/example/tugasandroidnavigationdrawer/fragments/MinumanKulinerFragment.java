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

public class MinumanKulinerFragment extends Fragment {


    private RecyclerView recyclerView;
    private AdapterKuliner adapter;
    private List<items> itemsList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_minuman_kuliner, container, false);

        recyclerView = view.findViewById(R.id.RVminumanKuliner);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 1));

        // Initialize your data
        itemsList = new ArrayList<>();

        itemsList.add(new items("Es Teh Manis", "https://fajar.co.id/wp-content/uploads/2023/09/IMG_0741.jpg", "Es teh manis adalah minuman yang terbuat dari daun teh yang diseduh dengan air panas dan diberi tambahan gula. Minuman ini biasanya disajikan dengan es batu sehingga menjadi segar dan nikmat disantap saat cuaca panas.", "4"));
        itemsList.add(new items("Es Jeruk", "https://dcostseafood.id/wp-content/uploads/2021/12/ES-JERUK-murni.jpg", "Es jeruk adalah minuman yang terbuat dari perasan buah jeruk yang dicampur dengan air dan gula. Minuman ini disajikan dengan es batu sehingga menjadi segar dan menyegarkan. Es jeruk juga bisa ditambahkan dengan tambahan seperti mint atau lemon untuk memberikan aroma dan rasa yang lebih segar.", "3.5"));
        itemsList.add(new items("Kopi Tubruk", "https://dcostseafood.id/wp-content/uploads/2022/03/Kopi-Tubruk.jpg", "Kopi tubruk adalah minuman kopi khas Indonesia yang terbuat dari biji kopi yang digiling kasar dan diseduh dengan air panas. Kopi tubruk biasanya disajikan tanpa gula, namun bisa ditambahkan sesuai selera. Minuman ini memiliki cita rasa yang khas dan kuat.", "4.5"));
        itemsList.add(new items("Jus Alpukat", "https://cdn.idntimes.com/content-images/post/20200513/80804982-1633679013439729-4856995162210626944-n-e76c8100d5dd1d2e835cbc2edf086597.jpg", "Jus alpukat adalah minuman yang terbuat dari buah alpukat yang dihaluskan dan dicampur dengan susu, gula, dan es batu. Minuman ini memiliki tekstur yang kental dan rasa yang manis serta lezat. Jus alpukat sering dijadikan sebagai minuman penutup setelah makan.", "4"));
        itemsList.add(new items("Teh Tarik", "https://asset.kompas.com/crops/h1bqnfWROB6cj5NRQ1TwZ5HltE8=/100x67:900x599/750x500/data/photo/2023/11/27/6563db043c35f.jpeg", "Teh tarik adalah minuman teh khas Malaysia yang terbuat dari daun teh yang diseduh dengan air panas dan diberi tambahan susu dan gula. Minuman ini kemudian diaduk secara khusus sehingga menghasilkan busa yang lembut dan tekstur yang kental. Teh tarik disajikan hangat dan sering dinikmati sebagai minuman pagi atau sore hari.", "4.5"));
        itemsList.add(new items("Es Campur", "https://cdn.idntimes.com/content-images/post/20220604/21149249-1906463753008141-145037424928489472-n-4a86e02dbd4a9ec1855f7a611acde5a7.jpg", "Es campur adalah minuman segar yang terbuat dari campuran berbagai bahan seperti buah-buahan, cincau, agar-agar, dan es serut. Minuman ini biasanya disajikan dengan siraman air gula dan santan, serta es batu. Es campur memiliki rasa yang manis dan segar, cocok disantap sebagai penyejuk di cuaca panas.", "5"));
        itemsList.add(new items("Susu Jahe", "https://www.tehsariwangi.com/uploads/ar/recipe/87/24ba82ed3ed4bb2440be71b72a57b456.png", "Susu jahe adalah minuman yang terbuat dari campuran susu dengan ekstrak jahe segar. Minuman ini sering dihidangkan hangat dan memiliki cita rasa yang hangat dan menyegarkan. Susu jahe sering dikonsumsi untuk meningkatkan sistem kekebalan tubuh dan menghangatkan badan pada cuaca dingin.", "4"));
        itemsList.add(new items("Kopi Terbalik", "https://awsimages.detik.net.id/community/media/visual/2022/09/23/kupi-khop-kopi-dalam-gelas-terbalik-yang-unik-dari-aceh-2.jpeg", "Kopi terbalik adalah minuman kopi yang terbuat dari kopi sachet dan diseduh dengan air panas. Minuman ini memiliki experience meminum kopi secara terbalik. Kopi terbalik biasanya disajikan dalam gelas atau cangkir kecil lalu dibalik.", "3.5"));
        itemsList.add(new items("Kopi Arang", "https://upload.wikimedia.org/wikipedia/commons/8/81/Kopi_Joss.jpg", "Kopi arang adalah minuman kopi sashet yang dipanasakan oleh arang yang masih panas kemudian diseduh dengan air panas. Kopi arang memiliki cita rasa yang kuat dan khas karena proses pembuatannya yang menggunakan arang. Minuman ini biasanya disajikan tanpa gula, namun bisa ditambahkan sesuai selera.", "3.5"));


        // Initialize your adapter
        adapter = new AdapterKuliner(getActivity(), itemsList);
        recyclerView.setAdapter(adapter);

        return view;
    }
}

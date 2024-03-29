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

public class MakananKulinerFragment extends Fragment {

    private RecyclerView recyclerView;
    private AdapterKuliner adapter;
    private List<items> itemsList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_makanan_kuliner, container, false);

        recyclerView = view.findViewById(R.id.RVmakananKuliner);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 1));

        // Initialize your data
        itemsList = new ArrayList<>();

        // Tambahkan data makanan favoritDeskripsi sate ayam

        itemsList.add(new items("Sate Ayam", "https://d1vbn70lmn1nqe.cloudfront.net/prod/wp-content/uploads/2023/07/14053934/Mudah-Dibuat-di-Rumah-Ini-Resep-Sate-Ayam-Bumbu-Kacang-yang-Lezat-.jpg", "Sate ayam adalah makanan yang terdiri dari potongan-potongan daging ayam yang ditusuk dengan tusukan bambu atau sate, kemudian dipanggang atau dibakar. Daging ayam yang digunakan untuk sate ayam biasanya disajikan dengan bumbu kecap atau bumbu kacang. Sate ayam sering disajikan sebagai hidangan pembuka atau sebagai lauk pada hidangan utama.", "4"));
        itemsList.add(new items("Mie Goreng", "https://allofresh.id/blog/wp-content/uploads/2023/09/cara-membuat-mie-goreng-4-1-768x512.jpg", "Mie goreng adalah salah satu jenis hidangan mie yang diolah dengan cara digoreng. Mie yang digunakan dapat berupa mie telur, mie instan, atau mie lainnya. Mie goreng biasanya dicampur dengan bumbu-bumbu seperti bawang putih, bawang merah, cabai, dan bumbu lainnya untuk memberikan cita rasa yang khas.", "3.5"));
        itemsList.add(new items("Soto Ayam", "https://asset.kompas.com/crops/hgYCTwrFpAN5wQ35-Z2STU9C0vQ=/3x0:700x465/750x500/data/photo/2020/11/08/5fa7d069849e2.jpg", "Soto ayam adalah hidangan sup ayam yang populer di Indonesia. Hidangan ini terdiri dari potongan daging ayam, bihun, telur rebus, dan berbagai bahan pelengkap lainnya seperti taoge, seledri, dan bawang goreng. Soto ayam biasanya disajikan dengan kuah kaldu ayam yang gurih dan bumbu rempah yang khas.", "4.5"));
        itemsList.add(new items("Gado-Gado", "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a2/Gado_gado.jpg/1200px-Gado_gado.jpg", "Gado-gado adalah salah satu jenis hidangan sayur yang terdiri dari berbagai macam sayuran yang direbus atau dikukus seperti kacang panjang, tauge, bayam, dan kentang, kemudian dicampur dengan tahu, tempe, dan telur rebus. Gado-gado disajikan dengan bumbu kacang yang gurih dan pedas, serta kerupuk sebagai pelengkapnya.", "4"));
        itemsList.add(new items("Rendang", "https://cdn.idntimes.com/content-images/community/2022/04/resep-rendang-filosofi-rendang-makna-rendang-arti-rendang-rendang-dari-mana-makanan-indonesia-filosofi-9cde86371d7fc78c91ae80a6ffab250e-e0b9344da253b8e653bd42c7df03d6d9.jpg", "Rendang adalah hidangan daging sapi yang dimasak dengan santan dan bumbu rempah-rempah yang khas. Hidangan ini berasal dari Minangkabau, Sumatra Barat, Indonesia. Rendang memiliki cita rasa yang kaya dan kompleks karena daging sapi dimasak dalam waktu yang lama hingga bumbu meresap dan santan mengental.", "5"));
        itemsList.add(new items("Ayam Bakar", "https://www.sasa.co.id/medias/page_medias/Screen_Shot_2023-01-09_at_17_40_36_(1)_(1)_(1)_(1)_(1)_(1)_(1)_(1).png", "Ayam bakar adalah hidangan ayam yang dimasak dengan cara dipanggang atau dibakar. Ayam yang digunakan biasanya telah direndam dalam bumbu rempah atau saus sebelum dipanggang sehingga memiliki cita rasa yang gurih dan meresap. Ayam bakar sering disajikan dengan nasi dan sambal sebagai pelengkap.", "4.5"));
        itemsList.add(new items("Nasi Uduk", "https://www.blibli.com/friends-backend/wp-content/uploads/2023/04/B300028-Cover-resep-nasi-uduk.jpg", "Nasi uduk adalah hidangan nasi yang dimasak dengan santan dan rempah-rempah seperti serai, daun pandan, dan daun salam. Hidangan ini populer di Indonesia, terutama sebagai sarapan atau hidangan utama pada acara-acara khusus. Nasi uduk biasanya disajikan dengan pelengkap seperti telur, ayam goreng, tahu, tempe, dan sambal.", "4"));
        itemsList.add(new items("Mie Rebus", "https://static.promediateknologi.id/crop/0x0:0x0/750x500/webp/photo/2021/12/05/941380552.jpeg", "Mie rebus adalah hidangan mie yang dimasak dengan cara direbus hingga matang. Mie yang digunakan dapat berupa mie telur, mie instan, atau mie lainnya. Mie rebus biasanya disajikan dengan kuah kaldu yang gurih dan daging ayam atau sapi sebagai isiannya. Hidangan ini sering dijadikan sebagai alternatif makanan ringan atau makanan utama.", "3.5"));
        itemsList.add(new items("Ayam Geprek", "https://www.sasa.co.id/medias/page_medias/Cara_Membuat_Ayam_Geprek.jpg", "Ayam geprek adalah hidangan ayam goreng yang dipadukan dengan sambal pedas dan nasi panas. Ayam geprek memiliki cita rasa yang pedas dan gurih, serta sering disajikan dengan irisan mentimun, tomat, dan kerupuk sebagai pelengkapnya.", "3.5"));
        // Tambahkan data makanan favorit lainnya sesuai kebutuhan

        // Initialize your adapter
        adapter = new AdapterKuliner(getActivity(), itemsList);
        recyclerView.setAdapter(adapter);

        return view;
    }
}

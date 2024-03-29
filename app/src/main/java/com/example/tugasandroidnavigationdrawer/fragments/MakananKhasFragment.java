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

public class MakananKhasFragment extends Fragment {

    private RecyclerView recyclerView;
    private AdapterKuliner adapter;
    private List<items> itemsList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_makanan_khas, container, false);

        recyclerView = view.findViewById(R.id.RVmakananKuliner);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 1));

        // Initialize your data
        itemsList = new ArrayList<>();

        // Tambahkan data makanan favoritDeskripsi sate ayam

        itemsList.add(new items("Pempek Palembang", "https://lingkar.news/wp-content/uploads/2023/03/Aneka-Resep-Pempek-Makanan-Tradisional-Khas-Palembang.jpg", "Pempek Palembang adalah makanan khas dari Palembang, Sumatera Selatan, Indonesia. Pempek terbuat dari adonan tepung sagu yang dicampur dengan ikan tenggiri cincang dan beberapa bumbu lainnya, kemudian digoreng. Pempek disajikan dengan kuah cuko khas yang pedas dan asam.", "4.5"));
        itemsList.add(new items("Soto Betawi", "https://economicreview.id/wp-content/uploads/2021/02/images.jpeg-1-1.jpg", "Soto Betawi adalah makanan khas dari Betawi, Jakarta, Indonesia. Soto Betawi terdiri dari potongan daging sapi, jeroan sapi, dan bihun yang dimasak dengan kuah santan yang gurih dan bumbu rempah yang khas. Soto Betawi biasanya disajikan dengan emping, kerupuk, dan ditaburi bawang goreng.", "4"));
        itemsList.add(new items("Pecel Lele", "https://upload.wikimedia.org/wikipedia/commons/thumb/2/29/Pecel_Lele_1.JPG/1200px-Pecel_Lele_1.JPG", "Pecel Lele adalah makanan khas dari Jawa, Indonesia. Pecel lele terdiri dari ikan lele yang digoreng kering dan disajikan dengan sambal kacang, lalapan seperti kubis, kacang panjang, dan mentimun, serta nasi hangat. Pecel lele memiliki cita rasa yang gurih dan pedas.", "4"));
        itemsList.add(new items("Liwetan", "https://cdn.linkumkm.id/library/6/9/1/6/9/69169_840x576.jpg", "Liwetan adalah makanan khas dari Ponorogo, Jawa Timur, Indonesia. Liwetan terdiri dari nasi liwet yang dimasak dengan bumbu rempah seperti daun salam, daun jeruk, serai, dan santan, kemudian disajikan dengan lauk-pauk seperti ayam goreng, ikan bakar, tempe, tahu, dan sambal.", "4.5"));
        itemsList.add(new items("Iga Bakar", "https://img.kurio.network/RkclSEu1ODVuHzV4pGskrkQwAtY=/320x320/filters:quality(80)/https://kurio-img.kurioapps.com/21/05/20/58a31bf1-4f92-4598-bd78-0ccf8761295b.jpe", "Iga Bakar adalah makanan khas dari Madura, Jawa Timur, Indonesia. Iga bakar terdiri dari daging iga sapi yang dibakar dengan bumbu khas Madura yang pedas dan gurih. Iga bakar biasanya disajikan dengan nasi, lalapan, dan sambal.", "4"));
        itemsList.add(new items("Rujak Cingur", "https://cdn-1.timesmedia.co.id/images/2023/07/01/rujak-cingur.jpg", "Rujak Cingur adalah makanan khas dari Surabaya, Jawa Timur, Indonesia. Rujak cingur terdiri dari irisan daging cingur (hidung sapi yang direbus) yang disajikan dengan irisan buah-buahan, sayuran, dan tahu petis, kemudian disiram dengan bumbu rujak yang pedas dan gurih.", "4.5"));
        itemsList.add(new items("Papeda", "https://upload.wikimedia.org/wikipedia/commons/0/01/Papeda%2C_Kuah_Kuning%2C_Ikan_Tude_Bakar_2.jpg", "Papeda adalah makanan khas dari Papua, Indonesia. Papeda terbuat dari sagu yang direbus hingga kental dan biasanya disajikan dengan kuah ikan atau daging yang pedas. Papeda memiliki tekstur yang kenyal dan merupakan makanan pokok bagi masyarakat Papua.", "4"));
        itemsList.add(new items("Nasi Kuning", "https://www.dapurkobe.co.id/wp-content/uploads/nasi-kuning-kobe.jpg", "Nasi Kuning adalah makanan khas dari Indonesia yang sering disajikan sebagai hidangan khas pada acara-acara tertentu. Nasi kuning terbuat dari nasi yang dimasak dengan tambahan kunyit dan santan, sehingga memiliki warna kuning. Nasi kuning biasanya disajikan dengan lauk-pauk seperti ayam goreng, telur, sambal, dan acar.", "4"));
        // Tambahkan data makanan favorit lainnya sesuai kebutuhan

        // Initialize your adapter
        adapter = new AdapterKuliner(getActivity(), itemsList);
        recyclerView.setAdapter(adapter);

        return view;
    }
}

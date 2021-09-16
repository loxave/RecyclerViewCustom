package com.zen4r17.recyclerviewcustom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var newsRecyclerView: RecyclerView
    private lateinit var newsArrayList: ArrayList<News>
    lateinit var imageId: Array<Int>
    lateinit var heading: Array<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageId = arrayOf(
            R.drawable.investor_bertambah1,
            R.drawable.investor_saham_sukses2,
            R.drawable.investor_saham_terkaya_didunia3,
            R.drawable.investor_4,
            R.drawable.investor_saham_pemula_istilah5,
            R.drawable.belajar_saham_dari_nol6,
            R.drawable.belajar_sahamsyariah7,
            R.drawable.warren_buffett8,
            R.drawable.aplikasi_belajar_saham9,
            R.drawable.belajar_saham_bagi_pemula10,


            )

        heading = arrayOf(
            "Investor Saham Bertambah, Ini Tip Agar Bisa Konsisten",
            "Ini Dia 8 Ciri Investor Saham Sukses – Kamu Punya Nggak?",
            "Sukses Besar! Berikut 10 Tokoh Investor Saham Terkaya di Dunia",
            "Trading Saham Online Modal Kecil? Begini Caranya!",
            "Investor Saham Pemula, Berikut Ini Beberapa Istilah di Pasar Modal yang Perlu Kamu tahu",
            "Belajar Saham Syariah: Kenali Karakteristiknya",
            "6 Cara Efektif Belajar Saham dari Nol untuk Calon Investor dan Trader",
            "Belajar Saham dari Warren Buffett untuk Investasi Jangka Panjang",
            "Cara Mudah Memilih Aplikasi Belajar Saham Online yang Oke dan Sesuai untukmu",
            "5 Tempat Gratis Belajar Saham Bagi Pemula"
        )


        newsRecyclerView = findViewById(R.id.recyclerView1)
        newsRecyclerView.layoutManager = LinearLayoutManager(this)
        newsRecyclerView.setHasFixedSize(true)

        newsArrayList = arrayListOf<News>()
        getUserData()

    }

    private fun getUserData() {
        for (i in imageId.indices) {

            val news = News(imageId[i], heading[i])
            newsArrayList.add(news)

        }

        newsRecyclerView.adapter = MyAdapter(newsArrayList)
    }
}
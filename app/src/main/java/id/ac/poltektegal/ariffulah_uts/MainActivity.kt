package id.ac.poltektegal.ariffulah_uts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var data: ArrayList<DataModel>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inisialisasi Array
        data = ArrayList()

        //Simpan data

        data?.add(DataModel(R.drawable.guru,"Guru","Mengajar","guru adalah seorang tenaga pendidik profesional yang mendidik, mengajarkan suatu ilmu, membimbing, melatih, memberikan penilaian, serta melakukan evaluasi kepada peserta didik. " +
                "Definisi guru adalah seseorang yang telah mengabdikan dirinya untuk mengajarkan suatu ilmu, mendidik, mengarahkan, dan melatih muridnya agar memahami ilmu pengetahuan yang diajarkannya tersebut. Dalam hal ini, guru tidak hanya mengajarkan pendidikan formal, tapi juga pedidikan lainnya dan bisa menjadi sosok yang diteladani oleh para muridnya. "))

        data?.add(DataModel(R.drawable.kewirausahaan,"Pengrajin kayu","Kreatifitas", "wirausaha adalah orang yang pandai atau berbakat dalam mengenali produk baru, menentukan cara produksi baru, menyusun operasi untuk mengadakan produk baru hingga mengatur permodalan dan pemasarannya. Jadi, Wirausaha merupakan orang yang melakukan suatu kegiatan usaha dengan segala kemampuannya. Sedangkan Kewirausahaan lebih menunjuk kepada sikap mental yang dimiliki dari seorang wirausaha itu sendiri. "))

        data?.add(DataModel(R.drawable.pasar,"Pasar","Orang Berbelanja", "pasar dalam ilmu ekonomi adalah tempat bertemunya pembeli dan penjual untuk melakukan transaksi ekonomi. Pasar tidak menunjuk pada lokasi atau tempat tertentu, karena pasar tidak mempunyai batas geografis. Dalam hal ini, pasar merujuk pada semua kegiatan penawaran dan permintaan untuk tenaga kerja, modal, surat berharga, dan uang." ))

        data?.add(DataModel(R.drawable.pembuatanbenang,"Pembuatan Benang","Benang jahit", "Benang jahit merupakan jenis benang yang sengaja diciptakan secara khusus untuk menjahit pakaian. Benang yang digunakan untuk menjahit juga dibedakan menjadi beberapa jenis yang bisa disesuaikan dengan kebutuhan Anda. Jika akan menjahit kain katun yang cukup tebal contohnya, tidak mungkin Anda menggunakan jenis benang yang sama dengan benang yang digunakan untuk menjahit kain katun yang tipis. "))

        data?.add(DataModel(R.drawable.perikanan,"Perikanan","Perikanan Laut", "Perikanan menurut undang undang mengacu pada peraturan perundang undangan no 45 tahun 2009 dimana pengertian atau definisi perikanan yaitu semua kegiatan yang berhubungan dengan pengelolaan dan pemanfaatan sumber daya ikan dan lingkungannya mulai dari  praproduksi, produksi, pengolahan sampai dengan pemasaran, yang dilaksanakan dalam suatu sistem bisnis perikanan"))

        data?.add(DataModel(R.drawable.perkebunan,"Kebun Teh","Memetik Daun Teh", "Bidang Perkebunan mempunyai tugas melaksanakan penyiapan bahan dan perumusan kebijakan teknis, fasilitasi, koordinasi serta pembinaan teknis dibidang sarana, prasarana, perbenihan dan perlindungan, produksi, dan pengolahan dan pemasaran."))

        data?.add(DataModel(R.drawable.pembuatanbenang,"Pembuatan Benang","Benang Jahit", "Benang jahit merupakan jenis benang yang sengaja diciptakan secara khusus untuk menjahit pakaian. Benang yang digunakan untuk menjahit juga dibedakan menjadi beberapa jenis yang bisa disesuaikan dengan kebutuhan Anda. Jika akan menjahit kain katun yang cukup tebal contohnya, tidak mungkin Anda menggunakan jenis benang yang sama dengan benang yang digunakan untuk menjahit kain katun yang tipis."))


        data?.add(DataModel(R.drawable.perikanan,"Perikanan","Perikanan Laut", "Perikanan menurut undang undang mengacu pada peraturan perundang undangan no 45 tahun 2009 dimana pengertian atau definisi perikanan yaitu semua kegiatan yang berhubungan dengan pengelolaan dan pemanfaatan sumber daya ikan dan lingkungannya mulai dari  praproduksi, produksi, pengolahan sampai dengan pemasaran, yang dilaksanakan dalam suatu sistem bisnis perikanan"))

        //Set data to Adapter
        recyclerview.adapter = DataAdapter(data, object : DataAdapter.OnClickListener{
            override fun detail(item: DataModel?) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("gambar", item?.gambar)
                intent.putExtra("judul", item?.judul)
                intent.putExtra("list", item?.list)
                intent.putExtra("deskripsi", item?.deskripsi)
                startActivity(intent)
            }

        })


    }
}
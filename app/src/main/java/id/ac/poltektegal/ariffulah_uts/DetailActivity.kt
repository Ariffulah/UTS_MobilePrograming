package id.ac.poltektegal.ariffulah_uts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_data.*

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data)
        //actionbar
        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = "Ekonomi Masyarakat"
        //set back button
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)

        imageViewDetail.setImageResource(intent.getIntExtra("gambar", R.drawable.guru))
        textViewNamaDetail.text = intent.getStringExtra("judul")
        textViewListDetail.text = intent.getStringExtra("list")
        textViewKetDetail.text = intent.getStringExtra("deskripsi")

    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}
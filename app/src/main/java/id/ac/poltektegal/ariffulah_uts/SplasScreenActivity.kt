package id.ac.poltektegal.ariffulah_uts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplasScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splas_screen)
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this@SplasScreenActivity,
                MainActivity::class.java))
            finish()
        }, 3000)
    }
}
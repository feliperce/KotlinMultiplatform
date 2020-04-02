package br.com.feliperce.kotlinmultiplatform

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import getImc
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        calculateButton.setOnClickListener {
            Toast.makeText(this, getImc(70, 1.70f).toString(), Toast.LENGTH_SHORT).show()
        }
    }
}

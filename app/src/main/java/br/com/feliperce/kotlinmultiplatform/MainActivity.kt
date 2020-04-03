package br.com.feliperce.kotlinmultiplatform

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import appTitle
import getImc
import getImcResult
import kotlinx.android.synthetic.main.activity_main.*
import validateForm

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        title = appTitle()

        calculateButton.setOnClickListener {
            val weight = weightTextInputEditText.text.toString()
            val height = heightTextInputEditText.text.toString()

            if (validateForm(weight, height)) {
                val imc = getImc(weight.toInt(), height.toFloat())
                val imcResult = getImcResult(imc)

                imcValueTextView.text = "Você está: $imcResult"
            }

        }
    }
}

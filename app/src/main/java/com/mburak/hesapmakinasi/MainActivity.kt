package com.mburak.hesapmakinasi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.mburak.hesapmakinasi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var editTextBir: EditText
    private lateinit var editTextDiğer: EditText
    private lateinit var buttonTopla: Button
    private lateinit var buttonSil : Button
    private lateinit var textViewSonuç: TextView

    override fun onCreate(savedInstanceState: Bundle?) { super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextBir = findViewById(R.id.editTextBir)
        editTextDiğer = findViewById(R.id.editTextDiğer)
        buttonTopla = findViewById(R.id.buttonTopla)
        buttonSil = findViewById(R.id.buttonSil)
        textViewSonuç = findViewById(R.id.textViewSonuç)

        buttonTopla.setOnClickListener {
            topla()
        }

        buttonSil.setOnClickListener {
            sil()
        }
    }

    private fun topla(){
        val sayi1 = editTextBir.text.toString().toIntOrNull() ?:0
        val sayi2 = editTextDiğer.text.toString().toIntOrNull() ?:0

        val sonuç = sayi1 + sayi2

        textViewSonuç.text = "Sonuç: $sonuç"
    }

    private fun sil(){
        editTextBir.text.clear()
        editTextDiğer.text.clear()
        textViewSonuç.text = ""
    }

}

package com.example.jogardado

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.jogodado.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botaoJogar: Button = findViewById(R.id.button)
        botaoJogar.setOnClickListener{
            jogarDado()
        }
    }

    private fun jogarDado() {
        val dado = Dado(6)
        val jogarDado = dado.jogar()
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = jogarDado.toString()
    }
}

class  Dado(val numeroLados: Int) {

    fun  jogar(): Int {
        return (1..numeroLados).random()

    }
}
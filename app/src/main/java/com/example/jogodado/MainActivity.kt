
package com.example.jogardado

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.example.jogodado.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botaoJogar: Button = findViewById(R.id.button)
        botaoJogar.setOnClickListener {
            jogarDado()
        }
    }

    private fun jogarDado() {
        val dado = Dado(6)
        val jogarDado = dado.jogar()
        val imagemDado: ImageView = findViewById(R.id.imageView)

        when (jogarDado) {
        1-> imagemDado.setImageResource(R.drawable.dado_1)
        2-> imagemDado.setImageResource(R.drawable.dado_2)
        3-> imagemDado.setImageResource(R.drawable.dado_3)
        4-> imagemDado.setImageResource(R.drawable.dado_4)
        5-> imagemDado.setImageResource(R.drawable.dado_5)
        6-> imagemDado.setImageResource(R.drawable.dado_6)
        }
    }

}


    class Dado(val numeroLados: Int) {

        fun jogar(): Int {
            return (1..numeroLados).random()

        }
    }


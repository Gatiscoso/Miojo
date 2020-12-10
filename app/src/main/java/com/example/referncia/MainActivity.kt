package com.example.referncia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val usuarioa: usuário? = usuário("saiki",19)
        val usuariob: usuário? = usuário("ikias",91)

        texto.text = " $usuarioa ${usuarioa.hashCode()} "
        textob.text = "$usuariob ${usuariob.hashCode()}"

    }
}
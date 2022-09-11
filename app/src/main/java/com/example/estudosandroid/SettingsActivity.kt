package com.example.estudosandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        //na activity de destino - toda classe tem seu intent é como se ele tivesse esperando ai paradinho só pra ser recebido
        var nome = intent.getStringExtra("nome")

        findViewById<TextView>(R.id.ID_Nome_texto).text = nome
    }
}